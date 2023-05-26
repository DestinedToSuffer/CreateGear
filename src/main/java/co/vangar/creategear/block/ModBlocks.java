package co.vangar.creategear.block;

import co.vangar.creategear.CreateGear;
import co.vangar.creategear.fluid.ModFluids;
import co.vangar.creategear.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateGear.MOD_ID);

    public static final RegistryObject<LiquidBlock> IRON_LIQUID_BLOCK = BLOCKS.register("iron_liquid_block", () -> new LiquidBlock(ModFluids.SOURCE_IRON_LIQUID, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> GOLD_LIQUID_BLOCK = BLOCKS.register("gold_liquid_block", () -> new LiquidBlock(ModFluids.SOURCE_GOLD_LIQUID, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> DIAMOND_LIQUID_BLOCK = BLOCKS.register("diamond_liquid_block", () -> new LiquidBlock(ModFluids.SOURCE_DIAMOND_LIQUID, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> NETHERITE_LIQUID_BLOCK = BLOCKS.register("netherite_liquid_block", () -> new LiquidBlock(ModFluids.SOURCE_NETHERITE_LIQUID, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
