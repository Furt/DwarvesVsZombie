package me.furt.dvz.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import me.furt.dvz.items.ItemDVZ;
import me.furt.dvz.items.ItemDVZPoster;
import me.furt.dvz.references.Names;

public class ModItems {

	public static final ItemDVZ dvzPoster = new ItemDVZPoster();
	
	public static void init() {
		GameRegistry.registerItem(dvzPoster, Names.Items.DVZ_POSTER);
	}

}
