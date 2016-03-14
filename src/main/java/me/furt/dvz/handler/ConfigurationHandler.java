package me.furt.dvz.handler;

import java.io.File;

import me.furt.dvz.references.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static void init(File configFile) {
		if(config == null) {
			config = new Configuration(configFile, true);
			loadConfiguration();
		}
	}
	
	public static void loadConfiguration() {
		
		// TODO add config here
		
		if(config.hasChanged()) {
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent event) {
		
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			// TODO
		}
	}

}
