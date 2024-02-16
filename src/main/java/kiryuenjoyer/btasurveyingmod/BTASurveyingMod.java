package kiryuenjoyer.btasurveyingmod;

import kiryuenjoyer.btasurveyingmod.block.blockMarker;
import kiryuenjoyer.btasurveyingmod.block.blockTheodolite;
import kiryuenjoyer.btasurveyingmod.item.ItemTheodolite;
import kiryuenjoyer.btasurveyingmod.item.ItemMarker;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.block.ItemBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import useless.dragonfly.debug.block.BlockModel;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import java.util.Properties;


public class BTASurveyingMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = "btasurveyingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ConfigHandler config;
	private static int itemID;
	private static int blockID;
	static {
		Properties properties = new Properties();
		properties.put("blockID", "1000");
		properties.put("itemID", "17000");
		config = new ConfigHandler(MOD_ID, properties);
		itemID = config.getInt("itemID");
		blockID = config.getInt("blockID");
	}

	//Blocks
	public static final Block blockTheodolite = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blockTheodolite.json")))
		.setHardness(1.0F)
		.setBlockSound(BlockSounds.STONE)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new blockTheodolite("blockTheodolite", blockID++, Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blockTheodolite.json")));
	public static final Block blockMarker = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blockMarker.json")))
		.setHardness(0.5F)
		.setBlockSound(BlockSounds.WOOD)
		.setTags(BlockTags.MINEABLE_BY_AXE)
		.build(new blockMarker("blockMarker", blockID++, Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/blockMarker.json")));

	//Items
	public static Item itemTheodolite = ItemHelper.createItem(BTASurveyingMod.MOD_ID,
		new ItemPlaceable("itemTheodolite", itemID++, blockTheodolite), "btasurveyingmodtheodolite.png");
	public static Item itemMarker = ItemHelper.createItem(BTASurveyingMod.MOD_ID,
		new ItemPlaceable("itemMarker", itemID++, blockMarker), "itemMarker.png");

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
