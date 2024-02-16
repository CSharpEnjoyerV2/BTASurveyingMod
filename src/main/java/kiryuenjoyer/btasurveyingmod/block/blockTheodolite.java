package kiryuenjoyer.btasurveyingmod.block;

import kiryuenjoyer.btasurveyingmod.BTASurveyingMod;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockModel;

public class blockTheodolite extends BlockTransparent {
	public useless.dragonfly.model.block.processed.BlockModel model;
	public blockTheodolite(String key, int id, Material material, useless.dragonfly.model.block.processed.BlockModel model){
		super(key,id, material, true);
		this.model = model;
	}
	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(BTASurveyingMod.itemTheodolite)};
	}

	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	@Override
	public boolean canPlaceOnSurface() {
		return true;
	}
}
