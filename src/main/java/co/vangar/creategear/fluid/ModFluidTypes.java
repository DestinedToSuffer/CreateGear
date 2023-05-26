package co.vangar.creategear.fluid;

import co.vangar.creategear.CreateGear;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateGear.MOD_ID);

    //IRON
    public static final ResourceLocation IRON_STILL_RL = new ResourceLocation(CreateGear.MOD_ID, "block/iron_liquid_still");
    public static final ResourceLocation IRON_FLOWING_RL = new ResourceLocation(CreateGear.MOD_ID, "block/iron_liquid_flow");
    public static final ResourceLocation IRON_OVERLAY_RL = new ResourceLocation(CreateGear.MOD_ID, "misc/in_iron_liquid");

    public static final RegistryObject<FluidType> IRON_LIQUID_FLUID_TYPE = registerIron("iron_liquid_fluid",
            FluidType.Properties.create().lightLevel(15));

    private static RegistryObject<FluidType> registerIron(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(IRON_STILL_RL, IRON_FLOWING_RL, IRON_OVERLAY_RL,
                0xA1CCCCCC, new Vector3f(204 / 255f, 204 / 255f, 204 / 255f), properties));
    }

    //GOLD
    public static final ResourceLocation GOLD_STILL_RL = new ResourceLocation(CreateGear.MOD_ID, "block/gold_liquid_still");
    public static final ResourceLocation GOLD_FLOWING_RL = new ResourceLocation(CreateGear.MOD_ID, "block/gold_liquid_flow");
    public static final ResourceLocation GOLD_OVERLAY_RL = new ResourceLocation(CreateGear.MOD_ID, "misc/in_gold_liquid");

    public static final RegistryObject<FluidType> GOLD_LIQUID_FLUID_TYPE = registerGold("gold_liquid_fluid",
            FluidType.Properties.create().lightLevel(15));

    private static RegistryObject<FluidType> registerGold(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(GOLD_STILL_RL, GOLD_FLOWING_RL, GOLD_OVERLAY_RL,
                0xA1B9B100, new Vector3f(185 / 255f, 177 / 255f, 0 / 255f), properties));
    }

    //DIAMOND
    public static final ResourceLocation DIAMOND_STILL_RL = new ResourceLocation(CreateGear.MOD_ID, "block/diamond_liquid_still");
    public static final ResourceLocation DIAMOND_FLOWING_RL = new ResourceLocation(CreateGear.MOD_ID, "block/diamond_liquid_flow");
    public static final ResourceLocation DIAMOND_OVERLAY_RL = new ResourceLocation(CreateGear.MOD_ID, "misc/in_diamond_liquid");

    public static final RegistryObject<FluidType> DIAMOND_LIQUID_FLUID_TYPE = registerDiamond("diamond_liquid_fluid",
            FluidType.Properties.create().lightLevel(15));

    private static RegistryObject<FluidType> registerDiamond(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(DIAMOND_STILL_RL, DIAMOND_FLOWING_RL, DIAMOND_OVERLAY_RL,
                0xA133CDC6, new Vector3f(51 / 255f, 205 / 255f, 198 / 255f), properties));
    }

    //NETHERITE
    public static final ResourceLocation NETHERITE_STILL_RL = new ResourceLocation(CreateGear.MOD_ID, "block/netherite_liquid_still");
    public static final ResourceLocation NETHERITE_FLOWING_RL = new ResourceLocation(CreateGear.MOD_ID, "block/netherite_liquid_flow");
    public static final ResourceLocation NETHERITE_OVERLAY_RL = new ResourceLocation(CreateGear.MOD_ID, "misc/in_netherite_liquid");

    public static final RegistryObject<FluidType> NETHERITE_LIQUID_FLUID_TYPE = registerNetherite("netherite_liquid_fluid",
            FluidType.Properties.create().lightLevel(15));

    private static RegistryObject<FluidType> registerNetherite(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(NETHERITE_STILL_RL, NETHERITE_FLOWING_RL, NETHERITE_OVERLAY_RL,
                0xA17B2AA0, new Vector3f(123 / 255f, 42 / 255f, 160 / 255f), properties));
    }



    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
