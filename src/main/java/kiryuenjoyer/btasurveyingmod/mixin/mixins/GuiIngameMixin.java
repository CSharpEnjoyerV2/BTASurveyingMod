package kiryuenjoyer.btasurveyingmod.mixin.mixins;

import kiryuenjoyer.btasurveyingmod.mixin.interfaces.IOptions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.option.GameSettings;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.texturepack.TexturePackList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import kiryuenjoyer.btasurveyingmod.gui.guiMap;

import java.io.File;

@Mixin(value = GuiIngame.class, remap = false)
public class GuiIngameMixin extends Gui {
	@Shadow protected Minecraft mc;
	public guiMap gM = new guiMap();
    @Inject( method = "updateTick", at = @At("TAIL"))
	public void updateTick(CallbackInfo ci){
		if(((IOptions)this.mc.gameSettings).surveying$getKeyOpenMap().isPressed() && this.mc.currentScreen == null){
			System.out.println("IM GAY AND WORKING");
			gM.setX(100);
			gM.setY(100);
			gM.render(this.mc.renderEngine);
		}
	}
}
