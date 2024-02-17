package kiryuenjoyer.btasurveyingmod;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.options.GuiOptions;
import net.minecraft.client.gui.options.components.KeyBindingComponent;
import net.minecraft.client.gui.options.components.OptionsCategory;
import net.minecraft.client.gui.options.data.OptionsPage;
import net.minecraft.client.gui.options.data.OptionsPages;
import net.minecraft.client.option.GameSettings;
import kiryuenjoyer.btasurveyingmod.mixin.interfaces.IOptions;

import java.util.HashMap;
import java.util.Map;

public class BTASurveyingModClient {
	public static GameSettings gameSettings;
	public static IOptions modSettings;
	public static OptionsPage surveyingOptions;
	public static Map<String, String > modIds = new HashMap<>();
	public static void onLoad(){
		gameSettings = Minecraft.getMinecraft(Minecraft.class).gameSettings;
		modSettings = (IOptions) gameSettings;
		surveyingOptions = new OptionsPage("surveying.options.title")
			.withComponent(new OptionsCategory("surveying.options.category.keybindings")
				.withComponent(new KeyBindingComponent(modSettings.surveying$getKeyOpenMap())));

		OptionsPages.register(surveyingOptions);
		for (ModContainer container : FabricLoader.getInstance().getAllMods()) {
			modIds.put(container.getMetadata().getId(), container.getMetadata().getName());
		}

		OptionsPages.CONTROLS.withComponent(
			new OptionsCategory("surveying.options.category.keybinds.explicit")
				.withComponent(new KeyBindingComponent(modSettings.surveying$getKeyOpenMap())));
	}
	public static GuiOptions getOptionsPage(GuiScreen parent){
		return new GuiOptions(parent, gameSettings, surveyingOptions);
	}

}
