package com.teamabnormals.caverns_and_chasms.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import com.teamabnormals.caverns_and_chasms.core.other.tags.CCBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.teamabnormals.caverns_and_chasms.core.registry.CCBlocks.*;

public class CCBlockTagsProvider extends BlockTagsProvider {

	public CCBlockTagsProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
		super(generator, CavernsAndChasms.MOD_ID, fileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BlockTags.BEACON_BASE_BLOCKS).add(SILVER_BLOCK.get(), NECROMIUM_BLOCK.get());
		this.tag(BlockTags.BUTTONS).add(SILVER_BUTTON.get(), COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(), WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get());
		this.tag(BlockTags.CAMPFIRES).add(CUPRIC_CAMPFIRE.get());
		this.tag(BlockTags.DIRT).add(ROCKY_DIRT.get());
		this.tag(BlockTags.FIRE).add(CUPRIC_FIRE.get());
		this.tag(BlockTags.GUARDED_BY_PIGLINS).add(GOLDEN_BARS.get(), LAVA_LAMP.get(), AZALEA_CHEST.getFirst().get(), AZALEA_CHEST.getSecond().get());
		this.tag(BlockTags.PIGLIN_REPELLENTS).add(SOUL_BRAZIER.get());
		this.tag(BlockTags.PRESSURE_PLATES).add(MEDIUM_WEIGHTED_PRESSURE_PLATE.get());
		this.tag(BlockTags.RAILS).add(SPIKED_RAIL.get());
		this.tag(BlockTags.SLABS).add(COBBLESTONE_BRICK_SLAB.get(), COBBLESTONE_TILE_SLAB.get(), MOSSY_COBBLESTONE_BRICK_SLAB.get(), MOSSY_COBBLESTONE_TILE_SLAB.get(), SPINEL_BRICK_SLAB.get(), LAPIS_LAZULI_BRICK_SLAB.get(), SANGUINE_SLAB.get(), DRIPSTONE_SHINGLE_SLAB.get(), CALCITE_SLAB.get(), POLISHED_CALCITE_SLAB.get(), TUFF_SLAB.get(), POLISHED_TUFF_SLAB.get(), SUGILITE_SLAB.get(), POLISHED_SUGILITE_SLAB.get(), CUT_AMETHYST_BRICK_SLAB.get());
		this.tag(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(SOUL_SILVER_ORE.get());
		this.tag(BlockTags.SOUL_SPEED_BLOCKS).add(SOUL_SILVER_ORE.get());
		this.tag(BlockTags.STAIRS).add(COBBLESTONE_BRICK_STAIRS.get(), COBBLESTONE_TILE_STAIRS.get(), MOSSY_COBBLESTONE_BRICK_STAIRS.get(), MOSSY_COBBLESTONE_TILE_STAIRS.get(), SPINEL_BRICK_STAIRS.get(), LAPIS_LAZULI_BRICK_STAIRS.get(), SANGUINE_STAIRS.get(), DRIPSTONE_SHINGLE_STAIRS.get(), CALCITE_STAIRS.get(), POLISHED_CALCITE_STAIRS.get(), TUFF_STAIRS.get(), POLISHED_TUFF_STAIRS.get(), SUGILITE_STAIRS.get(), POLISHED_SUGILITE_STAIRS.get(), CUT_AMETHYST_BRICK_STAIRS.get());
		this.tag(BlockTags.WALL_POST_OVERRIDE).add(CUPRIC_TORCH.get());
		this.tag(BlockTags.WALLS).add(COBBLESTONE_BRICK_WALL.get(), COBBLESTONE_TILE_WALL.get(), MOSSY_COBBLESTONE_BRICK_WALL.get(), MOSSY_COBBLESTONE_TILE_WALL.get(), SPINEL_BRICK_WALL.get(), LAPIS_LAZULI_BRICK_WALL.get(), DRIPSTONE_SHINGLE_WALL.get(), CALCITE_WALL.get(), TUFF_WALL.get(), SUGILITE_WALL.get(), CUT_AMETHYST_BRICK_WALL.get());
		this.tag(BlockTags.PLANKS).add(AZALEA_PLANKS.get(), VERTICAL_AZALEA_PLANKS.get());
		this.tag(BlockTags.LOGS_THAT_BURN).addTag(CCBlockTags.AZALEA_LOGS);
		this.tag(BlockTags.WOODEN_SLABS).add(AZALEA_SLAB.get());
		this.tag(BlockTags.WOODEN_STAIRS).add(AZALEA_STAIRS.get());
		this.tag(BlockTags.WOODEN_FENCES).add(AZALEA_FENCE.get());
		this.tag(BlockTags.WOODEN_DOORS).add(AZALEA_DOOR.get());
		this.tag(BlockTags.WOODEN_TRAPDOORS).add(AZALEA_TRAPDOOR.get());
		this.tag(BlockTags.WOODEN_BUTTONS).add(AZALEA_BUTTON.get());
		this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(AZALEA_PRESSURE_PLATE.get());
		this.tag(BlockTags.FENCE_GATES).add(AZALEA_FENCE_GATE.get());
		this.tag(BlockTags.OVERWORLD_NATURAL_LOGS).add(AZALEA_LOG.get());
		this.tag(BlockTags.STANDING_SIGNS).add(AZALEA_SIGN.getFirst().get());
		this.tag(BlockTags.WALL_SIGNS).add(AZALEA_SIGN.getSecond().get());
		this.tag(BlockTags.CLIMBABLE).add(AZALEA_LADDER.get());
		this.tag(BlockTags.BEEHIVES).add(AZALEA_BEEHIVE.get());
		// INDUCTOR.get()
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
				ROCKY_DIRT.get(), FRAGILE_STONE.get(), FRAGILE_DEEPSLATE.get(),
				SILVER_BLOCK.get(), RAW_SILVER_BLOCK.get(), SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get(), SILVER_BARS.get(), MEDIUM_WEIGHTED_PRESSURE_PLATE.get(), SILVER_BUTTON.get(), SPIKED_RAIL.get(),
				SANGUINE_PLATES.get(), SANGUINE_STAIRS.get(), SANGUINE_SLAB.get(), SANGUINE_VERTICAL_SLAB.get(),
				CUPRIC_LANTERN.get(), BRAZIER.get(), SOUL_BRAZIER.get(), CUPRIC_BRAZIER.get(), ENDER_BRAZIER.get(),
				LAVA_LAMP.get(), GOLDEN_BARS.get(), SPINEL_BLOCK.get(), SPINEL_LAMP.get(),
				SPINEL_PILLAR.get(), SPINEL_BRICKS.get(), SPINEL_BRICK_STAIRS.get(), SPINEL_BRICK_SLAB.get(), SPINEL_BRICK_WALL.get(), SPINEL_BRICK_VERTICAL_SLAB.get(), SPINEL_ORE.get(), DEEPSLATE_SPINEL_ORE.get(),
				NECROMIUM_BLOCK.get(),
				LAPIS_LAZULI_LAMP.get(), LAPIS_LAZULI_PILLAR.get(), LAPIS_LAZULI_BRICKS.get(), LAPIS_LAZULI_BRICK_STAIRS.get(), LAPIS_LAZULI_BRICK_SLAB.get(), LAPIS_LAZULI_BRICK_WALL.get(), LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(),
				COBBLESTONE_BRICKS.get(), COBBLESTONE_BRICK_STAIRS.get(), COBBLESTONE_BRICK_SLAB.get(), COBBLESTONE_BRICK_WALL.get(), COBBLESTONE_BRICK_VERTICAL_SLAB.get(),
				COBBLESTONE_TILES.get(), COBBLESTONE_TILE_STAIRS.get(), COBBLESTONE_TILE_SLAB.get(), COBBLESTONE_TILE_WALL.get(), COBBLESTONE_TILE_VERTICAL_SLAB.get(),
				MOSSY_COBBLESTONE_BRICKS.get(), MOSSY_COBBLESTONE_BRICK_STAIRS.get(), MOSSY_COBBLESTONE_BRICK_SLAB.get(), MOSSY_COBBLESTONE_BRICK_WALL.get(), MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB.get(),
				MOSSY_COBBLESTONE_TILES.get(), MOSSY_COBBLESTONE_TILE_STAIRS.get(), MOSSY_COBBLESTONE_TILE_SLAB.get(), MOSSY_COBBLESTONE_TILE_WALL.get(), MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB.get(),
				COPPER_BARS.get(), EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(), WAXED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get(), WAXED_OXIDIZED_COPPER_BARS.get(),
				COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(), WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get(),
				EXPOSED_LIGHTNING_ROD.get(), WEATHERED_LIGHTNING_ROD.get(), OXIDIZED_LIGHTNING_ROD.get(), WAXED_LIGHTNING_ROD.get(), WAXED_EXPOSED_LIGHTNING_ROD.get(), WAXED_WEATHERED_LIGHTNING_ROD.get(), WAXED_OXIDIZED_LIGHTNING_ROD.get(),
				DRIPSTONE_SHINGLES.get(), DRIPSTONE_SHINGLE_STAIRS.get(), DRIPSTONE_SHINGLE_SLAB.get(), DRIPSTONE_SHINGLE_WALL.get(), CHISELED_DRIPSTONE_SHINGLES.get(), FLOODED_DRIPSTONE_SHINGLES.get(),
				CALCITE_STAIRS.get(), CALCITE_SLAB.get(), CALCITE_WALL.get(), CALCITE_VERTICAL_SLAB.get(), POLISHED_CALCITE.get(), POLISHED_CALCITE_STAIRS.get(), POLISHED_CALCITE_SLAB.get(), POLISHED_CALCITE_VERTICAL_SLAB.get(),
				TUFF_STAIRS.get(), TUFF_SLAB.get(), TUFF_WALL.get(), TUFF_VERTICAL_SLAB.get(), POLISHED_TUFF.get(), POLISHED_TUFF_STAIRS.get(), POLISHED_TUFF_SLAB.get(), POLISHED_TUFF_VERTICAL_SLAB.get(),
				SUGILITE.get(), SUGILITE_STAIRS.get(), SUGILITE_SLAB.get(), SUGILITE_WALL.get(), SUGILITE_VERTICAL_SLAB.get(), POLISHED_SUGILITE.get(), POLISHED_SUGILITE_STAIRS.get(), POLISHED_SUGILITE_SLAB.get(), POLISHED_SUGILITE_VERTICAL_SLAB.get(),
				FLOODLIGHT.get(), EXPOSED_FLOODLIGHT.get(), WEATHERED_FLOODLIGHT.get(), OXIDIZED_FLOODLIGHT.get(), WAXED_FLOODLIGHT.get(), WAXED_EXPOSED_FLOODLIGHT.get(), WAXED_WEATHERED_FLOODLIGHT.get(), WAXED_OXIDIZED_FLOODLIGHT.get(),
				TOOLBOX.get(), EXPOSED_TOOLBOX.get(), WEATHERED_TOOLBOX.get(), OXIDIZED_TOOLBOX.get(), WAXED_TOOLBOX.get(), WAXED_EXPOSED_TOOLBOX.get(), WAXED_WEATHERED_TOOLBOX.get(), WAXED_OXIDIZED_TOOLBOX.get(),
				AMETHYST_BLOCK.get(), CUT_AMETHYST.get(), CUT_AMETHYST.get(), CUT_AMETHYST_BRICKS.get(), CUT_AMETHYST_BRICK_STAIRS.get(), CUT_AMETHYST_BRICK_SLAB.get(), CUT_AMETHYST_BRICK_WALL.get(), CUT_AMETHYST_BRICK_VERTICAL_SLAB.get(),
				ECHO_BLOCK.get()
		);
		this.tag(BlockTags.MINEABLE_WITH_AXE).add(
				CUPRIC_CAMPFIRE.get(),
				AZALEA_BOARDS.get(), AZALEA_BOOKSHELF.get(), AZALEA_LADDER.get(), AZALEA_BEEHIVE.get(), AZALEA_CHEST.getFirst().get(), AZALEA_CHEST.getSecond().get(), AZALEA_HEDGE.get(), AZALEA_POST.get(), STRIPPED_AZALEA_POST.get()
		);
		this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ROCKY_DIRT.get(), SOUL_SILVER_ORE.get());
		this.tag(BlockTags.MINEABLE_WITH_HOE).add(ROTTEN_FLESH_BLOCK.get());
		this.tag(BlockTags.NEEDS_STONE_TOOL).add(
				SPINEL_ORE.get(), DEEPSLATE_SPINEL_ORE.get(), SPINEL_BLOCK.get(), SPINEL_LAMP.get(), SPINEL_PILLAR.get(), SPINEL_BRICKS.get(), SPINEL_BRICK_STAIRS.get(), SPINEL_BRICK_SLAB.get(), SPINEL_BRICK_WALL.get(), SPINEL_BRICK_VERTICAL_SLAB.get(),
				LAPIS_LAZULI_LAMP.get(), LAPIS_LAZULI_PILLAR.get(), LAPIS_LAZULI_BRICKS.get(), LAPIS_LAZULI_BRICK_STAIRS.get(), LAPIS_LAZULI_BRICK_SLAB.get(), LAPIS_LAZULI_BRICK_WALL.get(), LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(),
				EXPOSED_LIGHTNING_ROD.get(), WEATHERED_LIGHTNING_ROD.get(), OXIDIZED_LIGHTNING_ROD.get(), WAXED_LIGHTNING_ROD.get(), WAXED_EXPOSED_LIGHTNING_ROD.get(), WAXED_WEATHERED_LIGHTNING_ROD.get(), WAXED_OXIDIZED_LIGHTNING_ROD.get()
		);
		this.tag(BlockTags.NEEDS_IRON_TOOL).add(SILVER_BLOCK.get(), RAW_SILVER_BLOCK.get(), SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get(), SANGUINE_PLATES.get(), SANGUINE_SLAB.get(), SANGUINE_STAIRS.get(), SANGUINE_VERTICAL_SLAB.get());
		this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(NECROMIUM_BLOCK.get());
		this.tag(BlockTags.CANDLES).add(CUPRIC_CANDLE.get());
		this.tag(BlockTags.CANDLE_CAKES).add(CUPRIC_CANDLE_CAKE.get());
		this.tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(AMETHYST_BLOCK.get(), CUT_AMETHYST.get(), CUT_AMETHYST.get(), CUT_AMETHYST_BRICKS.get(), CUT_AMETHYST_BRICK_STAIRS.get(), CUT_AMETHYST_BRICK_SLAB.get(), CUT_AMETHYST_BRICK_WALL.get(), CUT_AMETHYST_BRICK_VERTICAL_SLAB.get());
		this.tag(BlockTags.SCULK_REPLACEABLE).add(FRAGILE_STONE.get(), FRAGILE_DEEPSLATE.get());

		this.tag(CCBlockTags.BRAZIERS).add(BRAZIER.get(), SOUL_BRAZIER.get(), ENDER_BRAZIER.get(), CUPRIC_BRAZIER.get());
		// INDUCTOR.get()
		this.tag(CCBlockTags.CUPRIC_FIRE_BASE_BLOCKS).addTag(Tags.Blocks.ORES_COPPER).addTag(Tags.Blocks.STORAGE_BLOCKS_RAW_COPPER).add(Blocks.COPPER_BLOCK, Blocks.EXPOSED_COPPER, Blocks.WEATHERED_COPPER, Blocks.OXIDIZED_COPPER, Blocks.CUT_COPPER, Blocks.EXPOSED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER, Blocks.CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, FLOODLIGHT.get(), EXPOSED_FLOODLIGHT.get(), WEATHERED_FLOODLIGHT.get(), OXIDIZED_FLOODLIGHT.get(), WAXED_FLOODLIGHT.get(), WAXED_EXPOSED_FLOODLIGHT.get(), WAXED_WEATHERED_FLOODLIGHT.get(), WAXED_OXIDIZED_FLOODLIGHT.get());
		this.tag(CCBlockTags.DEEPER_SPAWNABLE_ON).add(Blocks.GRAVEL, FRAGILE_STONE.get(), FRAGILE_DEEPSLATE.get()).addTag(BlockTags.BASE_STONE_OVERWORLD).addTag(Tags.Blocks.ORES);
		this.tag(CCBlockTags.GLARE_SPAWNABLE_NEAR).add(Blocks.GRASS_BLOCK, Blocks.MOSS_BLOCK, Blocks.MOSS_CARPET, Blocks.SMALL_DRIPLEAF, Blocks.BIG_DRIPLEAF, Blocks.BIG_DRIPLEAF_STEM).addTag(BlockTags.LEAVES).addTag(BlockTags.FLOWERS).addTag(BlockTags.SAPLINGS).addTag(BlockTags.REPLACEABLE_PLANTS).addTag(BlockTags.CAVE_VINES);
		this.tag(CCBlockTags.IGNORE_RAIL_PLACEMENT);
		this.tag(CCBlockTags.SILVER_ORES).add(SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get(), SOUL_SILVER_ORE.get());
		this.tag(CCBlockTags.SPINEL_ORES).add(SPINEL_ORE.get(), DEEPSLATE_SPINEL_ORE.get());
		this.tag(CCBlockTags.AZALEA_LOGS).add(AZALEA_LOG.get(), STRIPPED_AZALEA_LOG.get(), AZALEA_WOOD.get(), STRIPPED_AZALEA_WOOD.get());

		this.tag(CCBlockTags.WAXABLE_COPPER_BLOCKS).add(
				Blocks.COPPER_BLOCK, Blocks.EXPOSED_COPPER, Blocks.WEATHERED_COPPER, Blocks.OXIDIZED_COPPER,
				Blocks.CUT_COPPER, Blocks.EXPOSED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER,
				Blocks.CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB,
				Blocks.CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS,
				COPPER_BARS.get(), EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(),
				COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(),
				TOOLBOX.get(), EXPOSED_TOOLBOX.get(), WEATHERED_TOOLBOX.get(), OXIDIZED_TOOLBOX.get(),
				Blocks.LIGHTNING_ROD, EXPOSED_LIGHTNING_ROD.get(), WEATHERED_LIGHTNING_ROD.get(), OXIDIZED_LIGHTNING_ROD.get(),
				FLOODLIGHT.get(), EXPOSED_FLOODLIGHT.get(), WEATHERED_FLOODLIGHT.get(), OXIDIZED_FLOODLIGHT.get()
		);
		this.tag(CCBlockTags.WAXED_COPPER_BLOCKS).add(
				Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_OXIDIZED_COPPER,
				Blocks.WAXED_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER,
				Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB,
				Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS,
				WAXED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get(), WAXED_OXIDIZED_COPPER_BARS.get(),
				WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get(),
				WAXED_TOOLBOX.get(), WAXED_EXPOSED_TOOLBOX.get(), WAXED_WEATHERED_TOOLBOX.get(), WAXED_OXIDIZED_TOOLBOX.get(),
				WAXED_LIGHTNING_ROD.get(), WAXED_EXPOSED_LIGHTNING_ROD.get(), WAXED_WEATHERED_LIGHTNING_ROD.get(), WAXED_OXIDIZED_LIGHTNING_ROD.get(),
				WAXED_FLOODLIGHT.get(), WAXED_EXPOSED_FLOODLIGHT.get(), WAXED_WEATHERED_FLOODLIGHT.get(), WAXED_OXIDIZED_FLOODLIGHT.get()
		);
		this.tag(CCBlockTags.STORAGE_BLOCKS_SILVER).add(SILVER_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_SPINEL).add(SPINEL_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_NECROMIUM).add(NECROMIUM_BLOCK.get());
		this.tag(CCBlockTags.STORAGE_BLOCKS_RAW_SILVER).add(RAW_SILVER_BLOCK.get());
		this.tag(Tags.Blocks.STORAGE_BLOCKS).addTag(CCBlockTags.STORAGE_BLOCKS_SILVER).addTag(CCBlockTags.STORAGE_BLOCKS_SPINEL).addTag(CCBlockTags.STORAGE_BLOCKS_NECROMIUM).addTag(CCBlockTags.STORAGE_BLOCKS_RAW_SILVER);
		this.tag(Tags.Blocks.ORES).addTag(CCBlockTags.ORES_SILVER).addTag(CCBlockTags.ORES_SPINEL);
		this.tag(CCBlockTags.ORES_AMETHYST).add(Blocks.AMETHYST_BLOCK, Blocks.AMETHYST_CLUSTER, Blocks.BUDDING_AMETHYST, Blocks.LARGE_AMETHYST_BUD, Blocks.MEDIUM_AMETHYST_BUD, Blocks.SMALL_AMETHYST_BUD);
		this.tag(CCBlockTags.ORES_SILVER).addTag(CCBlockTags.SILVER_ORES);
		this.tag(CCBlockTags.ORES_SPINEL).addTag(CCBlockTags.SPINEL_ORES);
		this.tag(Tags.Blocks.ORE_RATES_DENSE).add(SPINEL_ORE.get(), DEEPSLATE_SPINEL_ORE.get());
		this.tag(Tags.Blocks.ORE_RATES_SINGULAR).add(SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get());
		this.tag(Tags.Blocks.ORE_RATES_SPARSE).add(SOUL_SILVER_ORE.get());
		this.tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(SILVER_ORE.get(), SPINEL_ORE.get());
		this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(DEEPSLATE_SILVER_ORE.get(), DEEPSLATE_SPINEL_ORE.get());
		this.tag(Tags.Blocks.CHESTS_WOODEN).add(AZALEA_CHEST.getFirst().get(), AZALEA_CHEST.getSecond().get());
		this.tag(Tags.Blocks.CHESTS_TRAPPED).add(AZALEA_CHEST.getSecond().get());
		this.tag(Tags.Blocks.FENCES_WOODEN).add(AZALEA_FENCE.get());
		this.tag(Tags.Blocks.FENCE_GATES_WOODEN).add(AZALEA_FENCE_GATE.get());
		this.tag(Tags.Blocks.BOOKSHELVES).add(AZALEA_BOOKSHELF.get());
		this.tag(Tags.Blocks.STONE).add(POLISHED_CALCITE.get(), POLISHED_TUFF.get(), SUGILITE.get(), POLISHED_SUGILITE.get());

		this.tag(BlueprintBlockTags.LADDERS).add(AZALEA_LADDER.get());
		this.tag(BlueprintBlockTags.VERTICAL_SLABS).add(COBBLESTONE_BRICK_VERTICAL_SLAB.get(), COBBLESTONE_TILE_VERTICAL_SLAB.get(), MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB.get(), MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB.get(), SPINEL_BRICK_VERTICAL_SLAB.get(), LAPIS_LAZULI_BRICK_VERTICAL_SLAB.get(), SANGUINE_VERTICAL_SLAB.get(), DRIPSTONE_SHINGLE_VERTICAL_SLAB.get(), CALCITE_VERTICAL_SLAB.get(), POLISHED_CALCITE_VERTICAL_SLAB.get(), TUFF_VERTICAL_SLAB.get(), POLISHED_TUFF_VERTICAL_SLAB.get(), SUGILITE_VERTICAL_SLAB.get(), POLISHED_SUGILITE_VERTICAL_SLAB.get(), CUT_AMETHYST_BRICK_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.WOODEN_VERTICAL_SLABS).add(AZALEA_VERTICAL_SLAB.get());
		this.tag(BlueprintBlockTags.HEDGES).add(AZALEA_HEDGE.get(), FLOWERING_AZALEA_HEDGE.get());
	}
}