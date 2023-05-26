package co.vangar.creategear.fluid;

import co.vangar.creategear.CreateGear;
import co.vangar.creategear.block.ModBlocks;
import co.vangar.creategear.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateGear.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_IRON_LIQUID = FLUIDS.register("iron_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.IRON_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_IRON_LIQUID = FLUIDS.register("flowing_iron_liquid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.IRON_LIQUID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_GOLD_LIQUID = FLUIDS.register("gold_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.GOLD_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GOLD_LIQUID = FLUIDS.register("flowing_gold_liquid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GOLD_LIQUID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DIAMOND_LIQUID = FLUIDS.register("diamond_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DIAMOND_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DIAMOND_LIQUID = FLUIDS.register("flowing_diamond_liquid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DIAMOND_LIQUID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NETHERITE_LIQUID = FLUIDS.register("netherite_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.NETHERITE_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NETHERITE_LIQUID = FLUIDS.register("flowing_netherite_liquid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.NETHERITE_LIQUID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties IRON_LIQUID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.IRON_LIQUID_FLUID_TYPE, SOURCE_IRON_LIQUID, FLOWING_IRON_LIQUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.IRON_LIQUID_BLOCK)
            .bucket(ModItems.IRON_LIQUID_BUCKET);

    public static final ForgeFlowingFluid.Properties GOLD_LIQUID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.GOLD_LIQUID_FLUID_TYPE, SOURCE_GOLD_LIQUID, FLOWING_GOLD_LIQUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.GOLD_LIQUID_BLOCK)
            .bucket(ModItems.GOLD_LIQUID_BUCKET);

    public static final ForgeFlowingFluid.Properties DIAMOND_LIQUID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.DIAMOND_LIQUID_FLUID_TYPE, SOURCE_DIAMOND_LIQUID, FLOWING_DIAMOND_LIQUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.DIAMOND_LIQUID_BLOCK)
            .bucket(ModItems.DIAMOND_LIQUID_BUCKET);

    public static final ForgeFlowingFluid.Properties NETHERITE_LIQUID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.NETHERITE_LIQUID_FLUID_TYPE, SOURCE_NETHERITE_LIQUID, FLOWING_NETHERITE_LIQUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.NETHERITE_LIQUID_BLOCK)
            .bucket(ModItems.NETHERITE_LIQUID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
