package me.furt.dvz.item;

import me.furt.dvz.creativetab.CreativeTab;
import me.furt.dvz.references.Textures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDVZ extends Item {
	
	public ItemDVZ() {
		super();
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.DVZ_TAB);
		this.setNoRepair();
	}
	
	@Override
    public String getUnlocalizedName() {
		
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
    	
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
    	
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
        
    }
	
}
