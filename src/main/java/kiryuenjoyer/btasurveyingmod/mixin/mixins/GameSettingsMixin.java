package kiryuenjoyer.btasurveyingmod.mixin.mixins;

import net.minecraft.client.option.GameSettings;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import kiryuenjoyer.btasurveyingmod.mixin.interfaces.IOptions;

import static org.lwjgl.input.Keyboard.KEY_M;
@Mixin(value = GameSettings.class, remap = false)
public class GameSettingsMixin implements IOptions{
	@Unique
	private final GameSettings thisAs = (GameSettings)(Object)this;
	@Unique
	public final KeyBinding keyOpenMap = new KeyBinding("surveying.key.openMap").bindKeyboard(KEY_M);

	public KeyBinding surveying$getKeyOpenMap() {
		return keyOpenMap;
	}


}
