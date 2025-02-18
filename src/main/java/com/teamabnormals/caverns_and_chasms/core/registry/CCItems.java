package com.teamabnormals.caverns_and_chasms.core.registry;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.common.item.BlueprintRecordItem;
import com.teamabnormals.blueprint.common.item.InjectedItem;
import com.teamabnormals.blueprint.core.util.registry.AbstractSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamabnormals.caverns_and_chasms.common.item.*;
import com.teamabnormals.caverns_and_chasms.common.item.necromium.*;
import com.teamabnormals.caverns_and_chasms.common.item.silver.*;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import com.teamabnormals.caverns_and_chasms.core.other.CCTiers.CCArmorMaterials;
import com.teamabnormals.caverns_and_chasms.core.other.CCTiers.CCItemTiers;
import com.teamabnormals.caverns_and_chasms.core.other.tags.CCInstrumentTags;
import com.teamabnormals.caverns_and_chasms.integration.boatload.CCBoatTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = CavernsAndChasms.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CCItems {
	public static final ItemSubRegistryHelper HELPER = CavernsAndChasms.REGISTRY_HELPER.getItemSubHelper();

	public static final RegistryObject<Item> TUNING_FORK = HELPER.createItem("tuning_fork", () -> new TuningForkItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> BAROMETER = HELPER.createItem("barometer", () -> new InjectedItem(Items.CLOCK, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> OXIDIZED_COPPER_GOLEM = HELPER.createItem("oxidized_copper_golem", () -> new OxidizedCopperGolemItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), false));
	public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_GOLEM = HELPER.createItem("waxed_oxidized_copper_golem", () -> new OxidizedCopperGolemItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), true));
	public static final RegistryObject<Item> COPPER_NUGGET = HELPER.createItem("copper_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> NETHERITE_NUGGET = HELPER.createItem("netherite_nugget", () -> new Item(new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = HELPER.createItem("netherite_horse_armor", () -> new NetheriteHorseArmorItem(12, 0.4F, "netherite", new Item.Properties().fireResistant().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> RAW_SILVER = HELPER.createItem("raw_silver", () -> new InjectedItem(Items.GOLD_INGOT, new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SILVER_INGOT = HELPER.createItem("silver_ingot", () -> new InjectedItem(Items.GOLD_INGOT, new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SILVER_NUGGET = HELPER.createItem("silver_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> KUNAI = HELPER.createItem("kunai", () -> new KunaiItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_SWORD = HELPER.createItem("silver_sword", () -> new SilverSwordItem(CCItemTiers.SILVER, 1, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_SHOVEL = HELPER.createItem("silver_shovel", () -> new SilverShovelItem(CCItemTiers.SILVER, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> SILVER_PICKAXE = HELPER.createItem("silver_pickaxe", () -> new SilverPickaxeItem(CCItemTiers.SILVER, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> SILVER_AXE = HELPER.createItem("silver_axe", () -> new SilverAxeItem(CCItemTiers.SILVER, 4.0F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> SILVER_HOE = HELPER.createItem("silver_hoe", () -> new SilverHoeItem(CCItemTiers.SILVER, 0, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> SILVER_HELMET = HELPER.createItem("silver_helmet", () -> new SilverArmorItem(CCArmorMaterials.SILVER, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = HELPER.createItem("silver_chestplate", () -> new SilverArmorItem(CCArmorMaterials.SILVER, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_LEGGINGS = HELPER.createItem("silver_leggings", () -> new SilverArmorItem(CCArmorMaterials.SILVER, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_BOOTS = HELPER.createItem("silver_boots", () -> new SilverArmorItem(CCArmorMaterials.SILVER, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SILVER_HORSE_ARMOR = HELPER.createItem("silver_horse_armor", () -> new SilverHorseArmorItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DEPTH_GAUGE = HELPER.createItem("depth_gauge", () -> new InjectedItem(Items.COMPASS, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> LARGE_ARROW = HELPER.createItem("large_arrow", () -> new LargeArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> NECROMIUM_INGOT = HELPER.createItem("necromium_ingot", () -> new InjectedItem(Items.NETHERITE_INGOT, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> NECROMIUM_NUGGET = HELPER.createItem("necromium_nugget", () -> new Item(new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> NECROMIUM_SWORD = HELPER.createItem("necromium_sword", () -> new NecromiumSwordItem(CCItemTiers.NECROMIUM, 3, -2.4F, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NECROMIUM_SHOVEL = HELPER.createItem("necromium_shovel", () -> new NecromiumShovelItem(CCItemTiers.NECROMIUM, 1.5F, -3.0F, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> NECROMIUM_PICKAXE = HELPER.createItem("necromium_pickaxe", () -> new NecromiumPickaxeItem(CCItemTiers.NECROMIUM, 1, -2.8F, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> NECROMIUM_AXE = HELPER.createItem("necromium_axe", () -> new NecromiumAxeItem(CCItemTiers.NECROMIUM, 5.0F, -3.0F, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> NECROMIUM_HOE = HELPER.createItem("necromium_hoe", () -> new NecromiumHoeItem(CCItemTiers.NECROMIUM, -3, 0.0F, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> NECROMIUM_HELMET = HELPER.createItem("necromium_helmet", () -> new NecromiumArmorItem(CCArmorMaterials.NECROMIUM, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NECROMIUM_CHESTPLATE = HELPER.createItem("necromium_chestplate", () -> new NecromiumArmorItem(CCArmorMaterials.NECROMIUM, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NECROMIUM_LEGGINGS = HELPER.createItem("necromium_leggings", () -> new NecromiumArmorItem(CCArmorMaterials.NECROMIUM, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NECROMIUM_BOOTS = HELPER.createItem("necromium_boots", () -> new NecromiumArmorItem(CCArmorMaterials.NECROMIUM, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NECROMIUM_HORSE_ARMOR = HELPER.createItem("necromium_horse_armor", () -> new NecromiumHorseArmorItem(12, "necromium", new Item.Properties().stacksTo(1).fireResistant().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> SANGUINE_PLATING = HELPER.createItem("sanguine_plating", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SANGUINE_HELMET = HELPER.createItem("sanguine_helmet", () -> new SanguineArmorItem(CCArmorMaterials.SANGUINE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SANGUINE_CHESTPLATE = HELPER.createItem("sanguine_chestplate", () -> new SanguineArmorItem(CCArmorMaterials.SANGUINE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SANGUINE_LEGGINGS = HELPER.createItem("sanguine_leggings", () -> new SanguineArmorItem(CCArmorMaterials.SANGUINE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> SANGUINE_BOOTS = HELPER.createItem("sanguine_boots", () -> new SanguineArmorItem(CCArmorMaterials.SANGUINE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> SPINEL = HELPER.createItem("spinel", () -> new InjectedItem(Items.LAPIS_LAZULI, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BEJEWELED_PEARL = HELPER.createItem("bejeweled_pearl", () -> new BejeweledPearlItem(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BEJEWELED_APPLE = HELPER.createItem("bejeweled_apple", () -> new BejeweledAppleItem(new Item.Properties().food(CCFoods.BEJEWELED_APPLE).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<Item> TETHER_POTION = HELPER.createItem("tether_potion", () -> new TetherPotionItem((new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_BREWING)));
	public static final RegistryObject<Item> BLUNT_ARROW = HELPER.createItem("blunt_arrow", () -> new BluntArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> DEEPER_HEAD = HELPER.createItem("deeper_head", () -> new MobHeadItem(CCBlocks.DEEPER_HEAD.get(), CCBlocks.DEEPER_WALL_HEAD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> PEEPER_HEAD = HELPER.createItem("peeper_head", () -> new MobHeadItem(CCBlocks.PEEPER_HEAD.get(), CCBlocks.PEEPER_WALL_HEAD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> MIME_HEAD = HELPER.createItem("mime_head", () -> new MobHeadItem(CCBlocks.MIME_HEAD.get(), CCBlocks.MIME_WALL_HEAD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).rarity(Rarity.UNCOMMON)));

	public static final RegistryObject<Item> GOLDEN_BUCKET = HELPER.createItem("golden_bucket", () -> new GoldenBucketItem(() -> Fluids.EMPTY, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16)));
	public static final RegistryObject<Item> GOLDEN_WATER_BUCKET = HELPER.createItem("golden_water_bucket", () -> new GoldenBucketItem(() -> Fluids.WATER, new Item.Properties().craftRemainder(GOLDEN_BUCKET.get()).tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
	public static final RegistryObject<Item> GOLDEN_LAVA_BUCKET = HELPER.createItem("golden_lava_bucket", () -> new GoldenBucketItem(() -> Fluids.LAVA, new Item.Properties().craftRemainder(GOLDEN_BUCKET.get()).tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
	public static final RegistryObject<Item> GOLDEN_POWDER_SNOW_BUCKET = HELPER.createItem("golden_powder_snow_bucket", () -> new GoldenSolidBucketItem(Blocks.POWDER_SNOW, SoundEvents.POWDER_SNOW_PLACE, new Item.Properties().craftRemainder(GOLDEN_BUCKET.get()).tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
	public static final RegistryObject<Item> GOLDEN_MILK_BUCKET = HELPER.createItem("golden_milk_bucket", () -> new GoldenMilkBucketItem(new Item.Properties().craftRemainder(GOLDEN_BUCKET.get()).tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

	public static final Pair<RegistryObject<Item>, RegistryObject<Item>> AZALEA_BOAT = HELPER.createBoatAndChestBoatItem("azalea", CCBlocks.AZALEA_PLANKS);
	public static final RegistryObject<Item> AZALEA_FURNACE_BOAT = HELPER.createItem("azalea_furnace_boat", ModList.get().isLoaded("boatload") ? CCBoatTypes.AZALEA_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
	public static final RegistryObject<Item> LARGE_AZALEA_BOAT = HELPER.createItem("large_azalea_boat", ModList.get().isLoaded("boatload") ? CCBoatTypes.LARGE_AZALEA_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

	public static final RegistryObject<Item> LOST_GOAT_HORN = HELPER.createItem("lost_goat_horn", () -> new LostGoatHornItem((new Item.Properties()).stacksTo(1), CCInstrumentTags.LOST_GOAT_HORNS)); // .tab(CreativeModeTab.TAB_MISC)

	public static final RegistryObject<Item> MUSIC_DISC_EPILOGUE = HELPER.createItem("music_disc_epilogue", () -> new BlueprintRecordItem(11, CCSoundEvents.EPILOGUE, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE), 77));

	public static final RegistryObject<ForgeSpawnEggItem> DEEPER_SPAWN_EGG = HELPER.createSpawnEggItem("deeper", CCEntityTypes.DEEPER::get, 8355711, 13717260);
	public static final RegistryObject<ForgeSpawnEggItem> PEEPER_SPAWN_EGG = HELPER.createSpawnEggItem("peeper", CCEntityTypes.PEEPER::get, 0x3E3434, 0x694242);
	//	public static final RegistryObject<ForgeSpawnEggItem> FLY_SPAWN_EGG = HELPER.createSpawnEggItem("fly", CCEntityTypes.FLY::get, 920336, 7080720);
	public static final RegistryObject<ForgeSpawnEggItem> MIME_SPAWN_EGG = HELPER.createSpawnEggItem("mime", CCEntityTypes.MIME::get, 0x5A5050, 0x969964);
	// public static final RegistryObject<ForgeSpawnEggItem> RAT_SPAWN_EGG = HELPER.createSpawnEggItem("rat", CCEntityTypes.RAT::get, 0x3B4248, 0xA76E6C);
	public static final RegistryObject<ForgeSpawnEggItem> GLARE_SPAWN_EGG = HELPER.createSpawnEggItem("glare", CCEntityTypes.GLARE::get, 0x72942F, 0x516F2C);

	public static class CCFoods {
		public static final FoodProperties BEJEWELED_APPLE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2F).alwaysEat().build();
	}
}
