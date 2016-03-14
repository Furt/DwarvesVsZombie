package me.furt.dvz.references;

public class Messages {

	public static final String NO_FINGERPRINT_MESSAGE = null;
	public static final String INVALID_FINGERPRINT_MESSAGE = null;

	 public static final class Gui {

	        private static final String GUI_PREFIX = "container.dvz:";

	        public static final String NO_KNOWN_TRANSMUTATIONS = GUI_PREFIX + "alchenomicon.noTransmutationsKnown";
	    }

	    public static final class Tooltips {

	        private static final String TOOLTIP_PREFIX = "tooltip.dvz:";

	        public static final String UPGRADES_CHESTS = TOOLTIP_PREFIX + "upgradesPrefix";
	        public static final String ITEM_BELONGS_TO = TOOLTIP_PREFIX + "belongsTo";
	        public static final String ITEM_BELONGS_TO_NO_ONE = TOOLTIP_PREFIX + "belongsToNoOne";
	        public static final String SMALL = TOOLTIP_PREFIX + "small";
	        public static final String MEDIUM = TOOLTIP_PREFIX + "medium";
	        public static final String LARGE = TOOLTIP_PREFIX + "large";
	        public static final String SORT_BY_DISPLAY_NAME = TOOLTIP_PREFIX + "sortByDisplayName";
	        public static final String SORT_BY_ENERGY_VALUE = TOOLTIP_PREFIX + "sortByEnergyValue";
	        public static final String SORT_BY_ID = TOOLTIP_PREFIX + "sortByID";
	        public static final String SORT_ASCENDING = TOOLTIP_PREFIX + "sortAscending";
	        public static final String SORT_DESCENDING = TOOLTIP_PREFIX + "sortDescending";
	    }

	    public static final class Commands {

	        private static final String COMMAND_PREFIX = "commands.dvz.";

	        public static final String BASE_COMMAND_USAGE = COMMAND_PREFIX + "usage";

	        public static final String PLAYER_NOT_FOUND_ERROR = COMMAND_PREFIX + "player-not-found.error";
	        public static final String INVALID_NBT_TAG_ERROR = COMMAND_PREFIX + "invalid-nbt-tag.error";
	        public static final String NO_ITEM = COMMAND_PREFIX + "no-item.error";

	        public static final String RUN_TEST_USAGE = COMMAND_PREFIX + Names.Commands.RUN_TEST + ".usage";
	        public static final String RUN_TESTS_SUCCESS = COMMAND_PREFIX + Names.Commands.RUN_TEST + ".success";
	        public static final String RUN_TESTS_NOT_FOUND = COMMAND_PREFIX + Names.Commands.RUN_TEST + ".notfound";

	        public static final String ADMIN_USAGE = COMMAND_PREFIX + Names.Commands.ADMIN_PANEL + ".usage";
	    }

	    public static final class Configuration {

	        public static final String GENERAL_SYNC_THRESHOLD = "sync.threshold";
	        public static final String GENERAL_SYNC_THRESHOLD_LABEL = "general.sync.threshold.label";
	        public static final String GENERAL_SYNC_THRESHOLD_COMMENT = "general.sync.threshold.comment";

	        public static final String SOUND_MODE = "soundMode";
	        public static final String SOUND_MODE_LABEL = "general.sound.soundMode.label";
	        public static final String SOUND_MODE_COMMENT = "general.sound.soundMode.comment";

	        public static final String ABILITIES_ONLY_LOAD_FILE = "abilities.onlyLoadFile";
	        public static final String ABILITIES_ONLY_LOAD_FILE_LABEL = "general.abilities.onlyLoadFile.label";
	        public static final String ABILITIES_ONLY_LOAD_FILE_COMMENT = "general.abilities.onlyLoadFile.comment";
	    }
}
