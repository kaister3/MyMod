package kaister3.mymod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGroupMyMod extends ItemGroup {
  private final ItemStack sword;

  public ItemGroupMyMod() {
    super(MyMod.MODID);
    //
  }

  @OnlyIn(Dist.CLIENT)
  @Override
  public ItemStack createIcon() {
    return sword;
  }

  @OnlyIn(Dist.CLIENT)
  @Override
  public void fill(final NonNullList<ItemStack> items) {
    items.add(sword.copy());
    super.fill(items);
  }
}
