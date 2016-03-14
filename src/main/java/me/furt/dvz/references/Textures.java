package me.furt.dvz.references;

import me.furt.dvz.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {

	public static final String RESOURCE_PREFIX = Reference.LOWERCASE_MOD_ID + ":";
	
	public static final class Armor {
		
        private static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    
	}

    public static final class Model {
    	
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
    
    }

    public static final class Gui {
    	
        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
        public static final ResourceLocation ADMIN_PANEL = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "adminPanel.png");

        public static final class Elements {
        	
            protected static final String ELEMENT_TEXTURE_LOCATION = GUI_TEXTURE_LOCATION + "elements/";
            public static final ResourceLocation ARROW_LEFT = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "arrowLeft.png");
            public static final ResourceLocation ARROW_RIGHT = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "arrowRight.png");
            public static final ResourceLocation SLIDER_VERTICAL_ENABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "sliderVerticalEnabled.png");
            public static final ResourceLocation SLIDER_VERTICAL_DISABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "sliderVerticalDisabled.png");
            public static final ResourceLocation BUTTON_ENABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonEnabled.png");
            public static final ResourceLocation BUTTON_DISABLED = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonDisabled.png");
            public static final ResourceLocation BUTTON_HOVER = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonHover.png");
            public static final ResourceLocation BUTTON_SORT_OPTION = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonSortOption.png");
            public static final ResourceLocation BUTTON_SORT_ORDER = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "buttonSortOrder.png");
            public static final ResourceLocation BUTTON = ResourceLocationHelper.getResourceLocation(ELEMENT_TEXTURE_LOCATION + "button.png");
        
        }
    
    }

    public static final class Effect {
    	
        private static final String EFFECTS_LOCATION = "textures/effects/";
    
    }

}
