package com.smokedogg.themadcrafter.world;

import com.smokedogg.themadcrafter.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TmcOreGeneration {

	public static void generateOres(final BiomeLoadingEvent event) {

            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.AQUAMARINE_ORE.get().defaultBlockState(), 2, 15, 50, 10); 
        	generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.AZURITE_ORE.get().defaultBlockState(), 5, 15, 64, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.BLACK_MICA_ORE.get().defaultBlockState(), 8, 5, 128, 15); 
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.CHRYSOCOLLA_ORE.get().defaultBlockState(), 4, 24, 50, 10);           
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.ERYTHRITE_ORE.get().defaultBlockState(), 4, 15, 40, 10); 
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.FIRE_OPAL_ORE.get().defaultBlockState(), 5, 5, 40, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.FLOURITE_ORE.get().defaultBlockState(), 5, 15, 64, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.FOOLS_GOLD_ORE.get().defaultBlockState(), 5, 15, 50, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.HYDROCERUSSITE_ORE.get().defaultBlockState(), 3, 64, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.KUNZITE_ORE.get().defaultBlockState(), 5, 15, 80, 10);    
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.PINK_OPAL_ORE.get().defaultBlockState(), 4, 30, 64, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SILVER_ORE.get().defaultBlockState(), 5, 15, 55, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.STURMANITE_ORE.get().defaultBlockState(), 4, 60, 110, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.VOLCANIC_ROSE_ORE.get().defaultBlockState(), 4, 64, 128, 7);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.ZINCITE_ORE.get().defaultBlockState(), 5, 30, 60, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.ZIRCON_ORE.get().defaultBlockState(), 5, 64, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 64, 128, 10);     
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.ALEXANDRITE_ORE.get().defaultBlockState(), 5, 5, 40, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.AMMOLITE_ORE.get().defaultBlockState(), 5, 15, 64, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.BERYL_ORE.get().defaultBlockState(), 5, 15, 50, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.CITRINE_ORE.get().defaultBlockState(), 4, 64, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.CLINOHUMITE_ORE.get().defaultBlockState(), 5, 15, 80, 10);              
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.GARNET_ORE.get().defaultBlockState(), 4, 30, 64, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.HACKMANITE_ORE.get().defaultBlockState(), 5, 15, 55, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 60, 110, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SPHALERITE_ORE.get().defaultBlockState(), 4, 64, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SPINEL_ORE.get().defaultBlockState(), 5, 30, 60, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SUNSTONE_ORE.get().defaultBlockState(), 4, 64, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 4, 64, 128, 10); 
        }
    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
            int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
        		
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }
}