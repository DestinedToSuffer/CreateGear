package co.vangar.creategear.misc;

import co.vangar.creategear.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_GEAR_TAB = new CreativeModeTab("creategeartab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_SCYTHE.get());
        }
    };
}