package kiryuenjoyer.btasurveyingmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;


public class BTASurveyingMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "btasurveyingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ConfigHandler config;
	private static int itemID;
	static {
		Properties properties = new Properties();
		properties.put("itemID", "18000");
		config = new ConfigHandler(MOD_ID, properties);
		itemID = config.getInt("itemID");
	}

	//Items
	public static Item ItemTheodolite = ItemHelper.createItem(BTASurveyingMod.MOD_ID,
		new Item("theodolite", itemID++), "btasurveyingmodtheodolite.png");
	@Override
    public void onInitialize() {
        LOGGER.info("btasurveyingmod initialized.");
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}
}
