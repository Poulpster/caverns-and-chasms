package com.teamabnormals.caverns_and_chasms.core.registry;

import com.teamabnormals.blueprint.common.block.VerticalSlabBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.caverns_and_chasms.common.block.*;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(modid = CavernsAndChasms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CCBlocks {
	public static final BlockSubRegistryHelper HELPER = CavernsAndChasms.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> SILVER_BLOCK = HELPER.createBlock("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SILVER_ORE = HELPER.createBlock("silver_ore", () -> new OreBlock(CCProperties.ORE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = HELPER.createBlock("deepslate_silver_ore", () -> new OreBlock(CCProperties.DEEPSLATE_ORE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SOUL_SILVER_ORE = HELPER.createBlock("soul_silver_ore", () -> new OreBlock(Block.Properties.copy(Blocks.SOUL_SOIL), UniformInt.of(0, 1)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = HELPER.createBlock("raw_silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SILVER_BARS = HELPER.createBlock("silver_bars", () -> new IronBarsBlock(CCProperties.METAL_BARS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MEDIUM_WEIGHTED_PRESSURE_PLATE = HELPER.createBlock("medium_weighted_pressure_plate", () -> new WeightedPressurePlateBlock(50, CCProperties.SILVER_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> SILVER_BUTTON = HELPER.createCompatBlock("quark", "silver_button", () -> new SilverButtonBlock(CCProperties.SILVER_BUTTON), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> SPIKED_RAIL = HELPER.createBlock("spiked_rail", () -> new SpikedRailBlock(BlockBehaviour.Properties.copy(Blocks.POWERED_RAIL)), CreativeModeTab.TAB_TRANSPORTATION);

	public static final RegistryObject<Block> SANGUINE_PLATES = HELPER.createBlock("sanguine_plates", () -> new Block(CCProperties.SANGUINE_PLATES), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SANGUINE_STAIRS = HELPER.createBlock("sanguine_plate_stairs", () -> new StairBlock(() -> SANGUINE_PLATES.get().defaultBlockState(), CCProperties.SANGUINE_PLATES), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SANGUINE_SLAB = HELPER.createBlock("sanguine_plate_slab", () -> new SlabBlock(CCProperties.SANGUINE_PLATES), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SANGUINE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "sanguine_plate_vertical_slab", () -> new VerticalSlabBlock(CCProperties.SANGUINE_PLATES), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> NECROMIUM_BLOCK = HELPER.createBlock("necromium_block", () -> new Block(CCProperties.NECROMIUM_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> BRAZIER = HELPER.createBlock("brazier", () -> new BrazierBlock(1, CCProperties.BRAZIER), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SOUL_BRAZIER = HELPER.createBlock("soul_brazier", () -> new BrazierBlock(2, CCProperties.BRAZIER_DIM), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> ENDER_BRAZIER = HELPER.createCompatBlock("endergetic", "ender_brazier", () -> new BrazierBlock(3, CCProperties.BRAZIER), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CURSED_BRAZIER = HELPER.createBlock("cursed_brazier", () -> new BrazierBlock(4, CCProperties.BRAZIER_DIM), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> CURSED_FIRE = HELPER.createBlockNoItem("cursed_fire", () -> new CursedFireBlock(Block.Properties.copy(Blocks.SOUL_FIRE)));
	public static final RegistryObject<Block> CURSED_CAMPFIRE = HELPER.createBlock("cursed_campfire", () -> new CursedCampfireBlock(Block.Properties.copy(Blocks.SOUL_CAMPFIRE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CURSED_LANTERN = HELPER.createBlock("cursed_lantern", () -> new LanternBlock(Block.Properties.copy(Blocks.SOUL_LANTERN)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CURSED_WALL_TORCH = HELPER.createBlockNoItem("cursed_wall_torch", () -> new CursedWallTorchBlock(Block.Properties.copy(Blocks.SOUL_TORCH)));
	public static final RegistryObject<Block> CURSED_TORCH = HELPER.createStandingAndWallBlock("cursed_torch", () -> new CursedTorchBlock(Block.Properties.copy(Blocks.SOUL_TORCH)), CURSED_WALL_TORCH, CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> ROTTEN_FLESH_BLOCK = HELPER.createBlock("rotten_flesh_block", () -> new Block(CCProperties.ROTTEN_FLESH_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRAVESTONE = HELPER.createBlock("gravestone", () -> new GravestoneBlock(Block.Properties.copy(Blocks.STONE)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> GOLDEN_LANTERN = HELPER.createBlock("golden_lantern", () -> new GoldenLanternBlock(CCProperties.GOLDEN_LANTERN), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> GOLDEN_BARS = HELPER.createBlock("golden_bars", () -> new IronBarsBlock(CCProperties.METAL_BARS), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> SPINEL_ORE = HELPER.createBlock("spinel_ore", () -> new OreBlock(CCProperties.ORE, UniformInt.of(2, 5)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_SPINEL_ORE = HELPER.createBlock("deepslate_spinel_ore", () -> new OreBlock(CCProperties.DEEPSLATE_ORE, UniformInt.of(2, 5)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BLOCK = HELPER.createBlock("spinel_block", () -> new Block(CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BRICKS = HELPER.createBlock("spinel_bricks", () -> new Block(CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BRICK_STAIRS = HELPER.createBlock("spinel_brick_stairs", () -> new StairBlock(() -> SPINEL_BRICKS.get().defaultBlockState(), CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BRICK_SLAB = HELPER.createBlock("spinel_brick_slab", () -> new SlabBlock(CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "spinel_brick_vertical_slab", () -> new VerticalSlabBlock(CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_BRICK_WALL = HELPER.createBlock("spinel_brick_wall", () -> new WallBlock(CCProperties.SPINEL), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SPINEL_PILLAR = HELPER.createBlock("spinel_pillar", () -> new RotatedPillarBlock(CCProperties.SPINEL), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPINEL_LAMP = HELPER.createBlock("spinel_lamp", () -> new Block(CCProperties.LAMP), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> LAPIS_LAZULI_BRICKS = HELPER.createBlock("lapis_bricks", () -> new Block(CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_STAIRS = HELPER.createBlock("lapis_brick_stairs", () -> new StairBlock(() -> LAPIS_LAZULI_BRICKS.get().defaultBlockState(), CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_SLAB = HELPER.createBlock("lapis_brick_slab", () -> new SlabBlock(CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "lapis_brick_vertical_slab", () -> new VerticalSlabBlock(CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LAPIS_LAZULI_BRICK_WALL = HELPER.createBlock("lapis_brick_wall", () -> new WallBlock(CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LAPIS_LAZULI_PILLAR = HELPER.createBlock("lapis_pillar", () -> new RotatedPillarBlock(CCProperties.LAPIS_LAZULI), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LAPIS_LAZULI_LAMP = HELPER.createBlock("lapis_lamp", () -> new Block(CCProperties.LAMP), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> ROCKY_DIRT = HELPER.createBlock("rocky_dirt", () -> new Block(CCProperties.ROCKY_DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> DIRT_BRICKS = HELPER.createBlock("dirt_bricks", () -> new Block(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_STAIRS = HELPER.createBlock("dirt_brick_stairs", () -> new StairBlock(() -> DIRT_BRICKS.get().defaultBlockState(), CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_SLAB = HELPER.createBlock("dirt_brick_slab", () -> new SlabBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_WALL = HELPER.createBlock("dirt_brick_wall", () -> new WallBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dirt_brick_vertical_slab", () -> new VerticalSlabBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> DIRT_TILES = HELPER.createBlock("dirt_tiles", () -> new Block(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_TILE_STAIRS = HELPER.createBlock("dirt_tile_stairs", () -> new StairBlock(() -> DIRT_TILES.get().defaultBlockState(), CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_TILE_SLAB = HELPER.createBlock("dirt_tile_slab", () -> new SlabBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_TILE_WALL = HELPER.createBlock("dirt_tile_wall", () -> new WallBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> DIRT_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dirt_tile_vertical_slab", () -> new VerticalSlabBlock(CCProperties.DIRT_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> COBBLESTONE_BRICKS = HELPER.createBlock("cobblestone_bricks", () -> new Block(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_BRICK_STAIRS = HELPER.createBlock("cobblestone_brick_stairs", () -> new StairBlock(() -> COBBLESTONE_BRICKS.get().defaultBlockState(), CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_BRICK_SLAB = HELPER.createBlock("cobblestone_brick_slab", () -> new SlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_BRICK_WALL = HELPER.createBlock("cobblestone_brick_wall", () -> new WallBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> COBBLESTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cobblestone_brick_vertical_slab", () -> new VerticalSlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = HELPER.createBlock("mossy_cobblestone_bricks", () -> new Block(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = HELPER.createBlock("mossy_cobblestone_brick_stairs", () -> new StairBlock(() -> COBBLESTONE_BRICKS.get().defaultBlockState(), CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_SLAB = HELPER.createBlock("mossy_cobblestone_brick_slab", () -> new SlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_WALL = HELPER.createBlock("mossy_cobblestone_brick_wall", () -> new WallBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_cobblestone_brick_vertical_slab", () -> new VerticalSlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> COBBLESTONE_TILES = HELPER.createBlock("cobblestone_tiles", () -> new Block(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_TILE_STAIRS = HELPER.createBlock("cobblestone_tile_stairs", () -> new StairBlock(() -> COBBLESTONE_TILES.get().defaultBlockState(), CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_TILE_SLAB = HELPER.createBlock("cobblestone_tile_slab", () -> new SlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> COBBLESTONE_TILE_WALL = HELPER.createBlock("cobblestone_tile_wall", () -> new WallBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> COBBLESTONE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cobblestone_tile_vertical_slab", () -> new VerticalSlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILES = HELPER.createBlock("mossy_cobblestone_tiles", () -> new Block(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_STAIRS = HELPER.createBlock("mossy_cobblestone_tile_stairs", () -> new StairBlock(() -> COBBLESTONE_TILES.get().defaultBlockState(), CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_SLAB = HELPER.createBlock("mossy_cobblestone_tile_slab", () -> new SlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_WALL = HELPER.createBlock("mossy_cobblestone_tile_wall", () -> new WallBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_cobblestone_tile_vertical_slab", () -> new VerticalSlabBlock(CCProperties.COBBLESTONE_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static class CCProperties {
		public static final BlockBehaviour.Properties ROCKY_DIRT = BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F).sound(SoundType.GRAVEL);
		public static final BlockBehaviour.Properties DIRT_BRICKS = BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL);
		public static final BlockBehaviour.Properties COBBLESTONE_BRICKS = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F);

		public static final BlockBehaviour.Properties GOLDEN_LANTERN = BlockBehaviour.Properties.of(Material.METAL).strength(3.5F).sound(SoundType.LANTERN).lightLevel((state) -> 15);
		public static final BlockBehaviour.Properties METAL_BARS = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion();
		public static final BlockBehaviour.Properties SILVER_PRESSURE_PLATE = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().noCollission().strength(0.5F).sound(SoundType.WOOD);
		public static final BlockBehaviour.Properties SILVER_BUTTON = BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.METAL);
		public static final BlockBehaviour.Properties SANGUINE_PLATES = Block.Properties.of(Material.METAL, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.METAL);

		public static final BlockBehaviour.Properties BRAZIER = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel(getLightValueLit(15)).noOcclusion();
		public static final BlockBehaviour.Properties BRAZIER_DIM = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel(getLightValueLit(10)).noOcclusion();

		public static final BlockBehaviour.Properties ORE = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F);
		public static final BlockBehaviour.Properties DEEPSLATE_ORE = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE);
		public static final BlockBehaviour.Properties SPINEL = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(3.0F, 3.0F);
		public static final BlockBehaviour.Properties LAPIS_LAZULI = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.LAPIS).requiresCorrectToolForDrops().strength(3.0F, 3.0F);
		public static final BlockBehaviour.Properties LAMP = BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel((state) -> 15).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(CCProperties::alwaysAllowSpawn);

		public static final BlockBehaviour.Properties ROTTEN_FLESH_BLOCK = BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.TERRACOTTA_ORANGE).strength(0.8F).sound(SoundType.CORAL_BLOCK);
		public static final BlockBehaviour.Properties NECROMIUM_BLOCK = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK);

		private static boolean alwaysAllowSpawn(BlockState state, BlockGetter reader, BlockPos pos, EntityType<?> entity) {
			return true;
		}

		private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
			return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
		}
	}
}