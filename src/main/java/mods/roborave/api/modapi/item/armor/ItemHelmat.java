package mods.roborave.api.modapi.item.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHelmat extends ItemArmor
{
	public String color;
	private String modname;
	
	/**
	 * 
	 * @param par2EnumArmorMaterial
	 * @param par3
	 * @param color
	 * @param Modid
	 */
	public ItemHelmat(ArmorMaterial par2EnumArmorMaterial, int par3, String color, String Modid)
	{
		super(par2EnumArmorMaterial, par3, 0);
		
		this.color = color;
		this.setFull3D();
		Modid=modname;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(modname+ ":" + this.color + "_Diamond_Helm"); 
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return "minecraft"+":textures/models/armor/"+this.color.toLowerCase()+"_layer_1.png";
    }
	
}