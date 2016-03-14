package me.furt.dvz.references;

import java.io.File;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Files {
	
	public static final String TEMPLATE_JSON_FILE = "template.json";
	
	public static class Global {
		
		public static File dataDirectory;
		
		public static void init(FMLPreInitializationEvent event) {
		
			dataDirectory = new File(event.getModConfigurationDirectory().getParentFile(), "data" + File.separator + Reference.LOWERCASE_MOD_ID);
            dataDirectory.mkdirs();
            
			
		}
		
	}

}
