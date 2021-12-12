package com.teamabnormals.caverns_and_chasms.core.other;

import com.teamabnormals.blueprint.common.dispenser.FishBucketDispenseItemBehavior;
import com.teamabnormals.blueprint.core.util.DataUtil;
import com.teamabnormals.caverns_and_chasms.common.entity.SilverArrow;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import com.teamabnormals.caverns_and_chasms.core.registry.CCBlocks;
import com.teamabnormals.caverns_and_chasms.core.registry.CCItems;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class CCCompat {

	public static void registerCompat() {
		addBiomeDictionaryTypes();
		registerDispenserBehaviors();
		changeLocalization();
		ObfuscationReflectionHelper.setPrivateValue(Item.class, CCBlocks.NECROMIUM_BLOCK.get().asItem(), true, "f_41372_");
	}

	public static void addBiomeDictionaryTypes() {
		BiomeDictionary.addTypes(Biomes.MEADOW, PLAINS, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.GROVE, COLD, CONIFEROUS, FOREST, SNOWY, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.SNOWY_SLOPES, COLD, SPARSE, SNOWY, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.JAGGED_PEAKS, COLD, SPARSE, SNOWY, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.FROZEN_PEAKS, COLD, SPARSE, SNOWY, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.STONY_PEAKS, HOT, MOUNTAIN, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.LUSH_CAVES, LUSH, WET, OVERWORLD);
		BiomeDictionary.addTypes(Biomes.DRIPSTONE_CAVES, SPARSE, OVERWORLD);
	}

	public static void registerDispenserBehaviors() {
		DispenserBlock.registerBehavior(CCItems.CAVEFISH_BUCKET.get(), new FishBucketDispenseItemBehavior());
		DispenserBlock.registerBehavior(CCItems.SILVER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
			protected Projectile getProjectile(Level worldIn, Position position, ItemStack stackIn) {
				SilverArrow entity = new SilverArrow(worldIn, position.x(), position.y(), position.z());
				entity.pickup = AbstractArrow.Pickup.ALLOWED;
				return entity;
			}
		});
	}

	public static void changeLocalization() {
		DataUtil.changeItemLocalization(Items.NETHERITE_SCRAP, CavernsAndChasms.MOD_ID, "ancient_scrap");
	}
}
