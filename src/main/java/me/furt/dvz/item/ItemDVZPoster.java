package me.furt.dvz.item;

import net.minecraft.item.ItemStack;
import me.furt.dvz.references.Names;
import me.furt.dvz.references.Textures;

public class ItemDVZPoster extends ItemDVZ {
	
	public ItemDVZPoster() {
		super();
		this.maxStackSize = 64;
		this.setHasSubtypes(false);
		this.setUnlocalizedName(Names.Items.DVZ_POSTER);
	}
	
	@Override
    public String getUnlocalizedName() {
		
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, Names.Items.DVZ_POSTER);
    
	}

}
