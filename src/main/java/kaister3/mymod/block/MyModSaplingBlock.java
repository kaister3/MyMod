package kaister3.mymod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;

public class MyModSaplingBlock extends SaplingBlock {
  /**
   * a dummy property to allow for separate item models.
   */
  public static final Property<Boolean> ITEM = BooleanProperty.create("item");

  public MyModSaplingBlock(final Tree tree, final AbstractBlock.Properties properties) {
    super(tree, properties);
  }

  @Override
  protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
    super.fillStateContainer(builder);
    builder.add(ITEM);
  }
}
