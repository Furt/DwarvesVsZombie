package me.furt.dvz.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import me.furt.dvz.init.ModItems;
import me.furt.dvz.references.Reference;

public class CreativeTab {
	
	public static final CreativeTabs DVZ_TAB = new CreativeTabs(Reference.LOWERCASE_MOD_ID) {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.dvzPoster;
		}
		
	};

}
