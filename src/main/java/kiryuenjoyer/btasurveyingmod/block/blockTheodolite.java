package kiryuenjoyer.btasurveyingmod.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import useless.dragonfly.model.block.processed.BlockModel;

public class blockTheodolite extends Block {
	public useless.dragonfly.model.block.processed.BlockModel model;
	public blockTheodolite(String key, int id, useless.dragonfly.model.block.processed.BlockModel model){
		super(key,id, Material.metal);
		this.setBlockBounds(1, 2, 1, 1, 2, 1);
		this.model = model;
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
