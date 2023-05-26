package co.vangar.creategear.item;

import co.vangar.creategear.CreateGear;
import co.vangar.creategear.fluid.ModFluids;
import co.vangar.creategear.item.custom.ExcavatorItem;
import co.vangar.creategear.item.custom.HammerItem;
import co.vangar.creategear.item.custom.HatchetItem;
import co.vangar.creategear.item.custom.ScytheItem;
import co.vangar.creategear.misc.ModCreativeModeTab;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateGear.MOD_ID);
    //CLAY
    public static final RegistryObject<Item> HARDENED_CLAY = ITEMS.register("hardened_clay", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //MOLDS
    public static final RegistryObject<Item> EMPTY_MOLD = ITEMS.register("empty_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> HAMMER_HEAD_MOLD = ITEMS.register("hammer_head_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> EXCAVATOR_HEAD_MOLD = ITEMS.register("excavator_head_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> SCYTHE_HEAD_MOLD = ITEMS.register("scythe_head_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DAGGER_HEAD_MOLD = ITEMS.register("dagger_head_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> HATCHET_HEAD_MOLD = ITEMS.register("hatchet_head_mold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //HAMMERS
    public static final RegistryObject<Item> WOOD_HAMMER = ITEMS.register("wood_hammer", () -> new HammerItem(Tiers.WOOD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", () -> new HammerItem(Tiers.STONE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(Tiers.IRON,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer", () -> new HammerItem(Tiers.GOLD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(Tiers.DIAMOND,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(Tiers.NETHERITE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //HAMMER HEADS
    public static final RegistryObject<Item> WOOD_HAMMER_HEAD = ITEMS.register("wood_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_HAMMER_HEAD = ITEMS.register("stone_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_HAMMER_HEAD = ITEMS.register("iron_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_HAMMER_HEAD = ITEMS.register("gold_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_HAMMER_HEAD = ITEMS.register("diamond_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_HAMMER_HEAD = ITEMS.register("netherite_hammer_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //EXCAVATORS
    public static final RegistryObject<Item> WOOD_EXCAVATOR = ITEMS.register("wood_excavator", () -> new ExcavatorItem(Tiers.WOOD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator", () -> new ExcavatorItem(Tiers.STONE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator", () -> new ExcavatorItem(Tiers.IRON,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator", () -> new ExcavatorItem(Tiers.GOLD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator", () -> new ExcavatorItem(Tiers.DIAMOND,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator", () -> new ExcavatorItem(Tiers.NETHERITE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //EXCAVATOR HEADS
    public static final RegistryObject<Item> WOOD_EXCAVATOR_HEAD = ITEMS.register("wood_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_EXCAVATOR_HEAD = ITEMS.register("stone_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_EXCAVATOR_HEAD = ITEMS.register("iron_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_EXCAVATOR_HEAD = ITEMS.register("gold_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR_HEAD = ITEMS.register("diamond_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR_HEAD = ITEMS.register("netherite_excavator_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //SCYTHE
    public static final RegistryObject<Item> WOOD_SCYTHE = ITEMS.register("wood_scythe", () -> new ScytheItem(Tiers.WOOD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_SCYTHE = ITEMS.register("stone_scythe", () -> new ScytheItem(Tiers.STONE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe", () -> new ScytheItem(Tiers.IRON,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_SCYTHE = ITEMS.register("gold_scythe", () -> new ScytheItem(Tiers.GOLD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> new ScytheItem(Tiers.DIAMOND,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> new ScytheItem(Tiers.NETHERITE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //SCYTHE HEADS
    public static final RegistryObject<Item> WOOD_SCYTHE_HEAD = ITEMS.register("wood_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_SCYTHE_HEAD = ITEMS.register("stone_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_SCYTHE_HEAD = ITEMS.register("iron_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_SCYTHE_HEAD = ITEMS.register("gold_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_SCYTHE_HEAD = ITEMS.register("diamond_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_SCYTHE_HEAD = ITEMS.register("netherite_scythe_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //DAGGERS
    public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wood_dagger", () -> new SwordItem(Tiers.WOOD,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new SwordItem(Tiers.STONE,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new SwordItem(Tiers.IRON,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger", () -> new SwordItem(Tiers.GOLD,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new SwordItem(Tiers.DIAMOND,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger", () -> new SwordItem(Tiers.NETHERITE,2,-1.8f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //DAGGER HEADS
    public static final RegistryObject<Item> WOOD_DAGGER_HEAD = ITEMS.register("wood_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_DAGGER_HEAD = ITEMS.register("stone_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_DAGGER_HEAD = ITEMS.register("iron_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_DAGGER_HEAD = ITEMS.register("gold_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_DAGGER_HEAD = ITEMS.register("diamond_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_DAGGER_HEAD = ITEMS.register("netherite_dagger_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //HATCHETS
    public static final RegistryObject<Item> WOOD_HATCHET = ITEMS.register("wood_hatchet", () -> new HatchetItem(Tiers.WOOD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_HATCHET = ITEMS.register("stone_hatchet", () -> new HatchetItem(Tiers.STONE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_HATCHET = ITEMS.register("iron_hatchet", () -> new HatchetItem(Tiers.IRON,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_HATCHET = ITEMS.register("gold_hatchet", () -> new HatchetItem(Tiers.GOLD,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_HATCHET = ITEMS.register("diamond_hatchet", () -> new HatchetItem(Tiers.DIAMOND,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_HATCHET = ITEMS.register("netherite_hatchet", () -> new HatchetItem(Tiers.NETHERITE,7,-3.2f, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //HATCHET HEADS
    public static final RegistryObject<Item> WOOD_HATCHET_HEAD = ITEMS.register("wood_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> STONE_HATCHET_HEAD = ITEMS.register("stone_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> IRON_HATCHET_HEAD = ITEMS.register("iron_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> GOLD_HATCHET_HEAD = ITEMS.register("gold_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> DIAMOND_HATCHET_HEAD = ITEMS.register("diamond_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    public static final RegistryObject<Item> NETHERITE_HATCHET_HEAD = ITEMS.register("netherite_hatchet_head", () -> new Item(new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.CREATE_GEAR_TAB)));
    //BUCKETS
    public static final RegistryObject<Item> IRON_LIQUID_BUCKET = ITEMS.register("iron_liquid_bucket", () -> new BucketItem(ModFluids.SOURCE_IRON_LIQUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_LIQUID_BUCKET = ITEMS.register("gold_liquid_bucket", () -> new BucketItem(ModFluids.SOURCE_GOLD_LIQUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_LIQUID_BUCKET = ITEMS.register("diamond_liquid_bucket", () -> new BucketItem(ModFluids.SOURCE_DIAMOND_LIQUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_LIQUID_BUCKET = ITEMS.register("netherite_liquid_bucket", () -> new BucketItem(ModFluids.SOURCE_NETHERITE_LIQUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_GEAR_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
