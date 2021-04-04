package com.smokedogg.themadcrafter.core.init;

import com.smokedogg.themadcrafter.TheMadCrafter;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			TheMadCrafter.MOD_ID);	
	//blocks
	public static final RegistryObject<Block> AZURITE_BLOCK = BLOCKS.register("azurite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLACK_MICA_BLOCK = BLOCKS.register("black_mica_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> CHRYSOCOLLA_BLOCK = BLOCKS.register("chrysocolla_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));	
	public static final RegistryObject<Block> ERYTHRITE_BLOCK = BLOCKS.register("erythrite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> FIRE_OPAL_BLOCK = BLOCKS.register("fire_opal_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> FLOURITE_BLOCK = BLOCKS.register("flourite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> FOOLS_GOLD_BLOCK = BLOCKS.register("fools_gold_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> PINK_OPAL_BLOCK = BLOCKS.register("pink_opal_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> STURMANITE_BLOCK = BLOCKS.register("sturmanite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> VOLCANIC_ROSE_BLOCK = BLOCKS.register("volcanic_rose_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ZIRCON_BLOCK = BLOCKS.register("zircon_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE)
					.sound(SoundType.STONE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	//ores surface
	public static final RegistryObject<Block> AQUAMARINE_ORE = BLOCKS.register("aquamarine_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));
	public static final RegistryObject<Block> AZURITE_ORE = BLOCKS.register("azurite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> BLACK_MICA_ORE = BLOCKS.register("black_mica_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> CHRYSOCOLLA_ORE = BLOCKS.register("chrysocolla_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> ERYTHRITE_ORE = BLOCKS.register("erythrite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> FIRE_OPAL_ORE = BLOCKS.register("fire_opal_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));	
	public static final RegistryObject<Block> FLOURITE_ORE = BLOCKS.register("flourite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> FOOLS_GOLD_ORE = BLOCKS.register("fools_gold_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));	
	public static final RegistryObject<Block> HYDROCERUSSITE_ORE = BLOCKS.register("hydrocerussite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> KUNZITE_ORE = BLOCKS.register("kunzite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> PINK_OPAL_ORE = BLOCKS.register("pink_opal_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> STURMANITE_ORE = BLOCKS.register("sturmanite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));	
	public static final RegistryObject<Block> VOLCANIC_ROSE_ORE = BLOCKS.register("volcanic_rose_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));	
	public static final RegistryObject<Block> ZINCITE_ORE = BLOCKS.register("zincite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> ZIRCON_ORE = BLOCKS.register("zircon_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> ALEXANDRITE_ORE = BLOCKS.register("alexandrite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> AMMOLITE_ORE = BLOCKS.register("ammolite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));
	public static final RegistryObject<Block> BERYL_ORE = BLOCKS.register("beryl_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> CITRINE_ORE = BLOCKS.register("citrine_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> CLINOHUMITE_ORE = BLOCKS.register("clinohumite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> GARNET_ORE = BLOCKS.register("garnet_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));	
	public static final RegistryObject<Block> HACKMANITE_ORE = BLOCKS.register("hackmanite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));	
	public static final RegistryObject<Block> SPHALERITE_ORE = BLOCKS.register("sphalerite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> SPINEL_ORE = BLOCKS.register("spinel_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> SUNSTONE_ORE = BLOCKS.register("sunstone_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> TOURMALINE_ORE = BLOCKS.register("tourmaline_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	//ores nether
	public static final RegistryObject<Block> CRYSTALIZED_BLACK_MICA_ORE = BLOCKS.register("crystalized_black_mica_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));	
	public static final RegistryObject<Block> CYSTALIZED_CHRYSOCOLLA_ORE = BLOCKS.register("crystalized_chrysocolla_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> CRYSTALIZED_FLOURITE_ORE = BLOCKS.register("crystalized_flourite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> CRYSTALIZED_VOLCANIC_ROSE_ORE = BLOCKS.register("crystalized_volcanic_rose_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> CRYSTALIZED_ZIRCON_ORE = BLOCKS.register("crystalized_zircon_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> CRYSTALIZED_ALEXANDRITE_ORE = BLOCKS.register("crystalized_alexandrite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));	
	public static final RegistryObject<Block> CRYSTALIZED_HACKMANITE_ORE = BLOCKS.register("crystalized_hackmanite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	public static final RegistryObject<Block> CRYSTALIZED_FIRE_OPAL_ORE = BLOCKS.register("crystalized_fire_opal_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> CRYSTALIZED_SAPPHIRE_ORE = BLOCKS.register("crystalized_sapphire_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)));	
	public static final RegistryObject<Block> CRYSTALIZED_RUBY_ORE = BLOCKS.register("crystalized_ruby_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	
}
