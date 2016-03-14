package me.furt.dvz.render.items;

import me.furt.dvz.init.ModItems;
import me.furt.dvz.item.ItemDVZPoster;
import me.furt.dvz.references.Names;
import me.furt.dvz.references.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.dvzPoster, 0, new ModelResourceLocation(Textures.RESOURCE_PREFIX + Names.Items.DVZ_LOGO, "inventory"));
	}

}
