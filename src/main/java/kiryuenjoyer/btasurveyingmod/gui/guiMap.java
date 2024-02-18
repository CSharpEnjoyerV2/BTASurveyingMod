package kiryuenjoyer.btasurveyingmod.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.guidebook.GuiGuidebook;
import net.minecraft.client.render.FontRenderer;
import net.minecraft.client.render.Lighting;
import net.minecraft.client.render.OpenGLHelper;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class guiMap extends Gui {
	private int x;
	private int y;
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void render(RenderEngine re) {
		System.out.println("Render Code Reached");
		this.drawRectWidthHeight(-50,-50,100,100, 1125);
		System.out.println("Render Code Complete");
	}
}
