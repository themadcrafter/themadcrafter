package com.smokedogg.themadcrafter.core.init;

import com.smokedogg.themadcrafter.TheMadCrafter;
import com.smokedogg.themadcrafter.core.util.TmcArmorMaterial;
import com.smokedogg.themadcrafter.core.util.TmcItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheMadCrafter.MOD_ID);

	public static final RegistryObject<Item> BLACK_MICA_CHUNK = ITEMS.register("black_mica_chunk", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> REINFORCED_BAR = ITEMS.register("reinforced_bar", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> REINFORCED_TOOL_BAR = ITEMS.register("reinforced_tool_bar", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> AXE_MOLD = ITEMS.register("axe_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HOE_MOLD = ITEMS.register("hoe_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> PICK_MOLD = ITEMS.register("pick_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> SHOVEL_MOLD = ITEMS.register("shovel_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> INGOT_MOLD = ITEMS.register("ingot_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> CRYSTAL_MOLD = ITEMS.register("crystal_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));	
	public static final RegistryObject<Item> CHRYSOCOLLA_SWORD_MOLD_EMPTY = ITEMS.register("chrysocolla_sword_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_SWORD_MOLD_FULL = ITEMS.register("chrysocolla_sword_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> ERYTHRITE_CLUB_MOLD_EMPTY = ITEMS.register("erythrite_club_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> ERYTHRITE_CLUB_MOLD_FULL = ITEMS.register("erythrite_club_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_SWORD_MOLD_EMPTY = ITEMS.register("fire_opal_sword_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_SWORD_MOLD_FULL = ITEMS.register("fire_opal_sword_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_WARHAMMER_MOLD_EMPTY = ITEMS.register("hybrid_warhammer_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_WARHAMMER_FULL = ITEMS.register("hybrid_warhammer_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_SWORD_MOLD_EMPTY = ITEMS.register("volcanic_rose_sword_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_SWORD_MOLD_FULL = ITEMS.register("volcanic_rose_sword_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> ZIRCON_SWORD_MOLD_EMPTY = ITEMS.register("zircon_sword_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> ZIRCON_SWORD_MOLD_FULL = ITEMS.register("zircon_sword_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_BOOTS_MOLD_EMPTY = ITEMS.register("exotic_boots_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_BOOTS_MOLD_FULL = ITEMS.register("exotic_boots_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_LEGGINGS_MOLD_EMPTY = ITEMS.register("exotic_leggings_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_LEGGINGS_MOLD_FULL = ITEMS.register("exotic_leggings_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_CHESTPLATE_MOLD_EMPTY = ITEMS.register("exotic_chestplate_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_CHESTPLATE_MOLD_FULL = ITEMS.register("exotic_chestplate_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_HELMET_MOLD_EMPTY = ITEMS.register("exotic_helmet_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_HELMET_MOLD_FULL = ITEMS.register("exotic_helmet_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));	
	public static final RegistryObject<Item> HYBRID_BOOTS_MOLD_EMPTY = ITEMS.register("hybrid_boots_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_BOOTS_MOLD_FULL = ITEMS.register("hybrid_boots_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_LEGGINGS_MOLD_EMPTY = ITEMS.register("hybrid_leggings_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_LEGGINGS_MOLD_FULL = ITEMS.register("hybrid_leggings_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_CHESTPLATE_MOLD_EMPTY = ITEMS.register("hybrid_chestplate_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_CHESTPLATE_MOLD_FULL = ITEMS.register("hybrid_chestplate_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_HELMET_MOLD_EMPTY = ITEMS.register("hybrid_helmet_mold_empty", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_HELMET_MOLD_FULL = ITEMS.register("hybrid_helmet_mold_full", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> BOOTS_MOLD = ITEMS.register("boots_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> LEGGINGS_MOLD = ITEMS.register("leggings_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> CHESTPLATE_MOLD = ITEMS.register("chestplate_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HELMET_MOLD = ITEMS.register("helmet_mold", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_AXE_SMELT = ITEMS.register("hybrid_axe_smelt", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_PICK_SMELT = ITEMS.register("hybrid_pick_smelt", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	public static final RegistryObject<Item> HYBRID_SHOVEL_SMELT = ITEMS.register("hybrid_shovel_smelt", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMOLDS_TAB)));
	//crystals//
	public static final RegistryObject<Item> AZURITE_CRYSTAL = ITEMS.register("azurite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_CRYSTAL = ITEMS.register("chrysocolla_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_CRYSTAL = ITEMS.register("fire_opal_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> HYDROCERUSSITE_CRYSTAL = ITEMS.register("hydrocerussite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_CRYSTAL = ITEMS.register("obsidian_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = ITEMS.register("sapphire_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_CRYSTAL = ITEMS.register("volcanic_rose_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> ZINCITE_CRYSTAL = ITEMS.register("zincite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> ZIRCON_CRYSTAL = ITEMS.register("zircon_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_CRYSTAL = ITEMS.register("alexandrite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> BERYL_CRYSTAL = ITEMS.register("beryl_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> GARNET_CRYSTAL = ITEMS.register("garnet_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> RUBY_CRYSTAL = ITEMS.register("ruby_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> TOURMALINE_CRYSTAL = ITEMS.register("tourmaline_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> CLINOHUMITE_CRYSTAL = ITEMS.register("clinohumite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> HACKMANITE_CRYSTAL = ITEMS.register("hackmanite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> SPHALERITE_CRYSTAL = ITEMS.register("sphalerite_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));
	public static final RegistryObject<Item> SUNSTONE_CRYSTAL = ITEMS.register("sunstone_crystal", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERCRYSTALS_TAB)));	
	//ingots//
	public static final RegistryObject<Item> AQUAMARINE_INGOT = ITEMS.register("aquamarine_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> AZURITE_INGOT = ITEMS.register("azurite_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> CRYSTALIZED_FIRE_INGOT = ITEMS.register("crystalized_fire_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> CRYSTALIZED_OBSIDIAN_INGOT = ITEMS.register("crystalized_obsidian_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> CRYSTALIZED_SAPPHIRE_INGOT = ITEMS.register("crystalized_sapphire_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));	
	public static final RegistryObject<Item> DARK_SILVER_INGOT = ITEMS.register("dark_silver_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> ERYTHRITE_INGOT = ITEMS.register("erythrite_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> FAIRY_INGOT = ITEMS.register("fairy_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> FLOURITE_INGOT = ITEMS.register("flourite_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_INGOT = ITEMS.register("fools_gold_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> KUNZITE_INGOT = ITEMS.register("kunzite_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));	
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> STURMANITE_INGOT = ITEMS.register("sturmanite_ingot",() -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> PINKOPAL_INGOT = ITEMS.register("pink_opal_ingot",() -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> AMMOLITE_INGOT = ITEMS.register("ammolite_ingot", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> CITRINE_INGOT = ITEMS.register("citrine_ingot",() -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));
	public static final RegistryObject<Item> SPINEL_INGOT = ITEMS.register("spinel_ingot",() -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERINGOTS_TAB)));	
	//liquids//
	public static final RegistryObject<Item> AZURITE_LIQUID = ITEMS.register("azurite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_LIQUID = ITEMS.register("chrysocolla_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> ERYTHRITE_LIQUID = ITEMS.register("erythrite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_LIQUID = ITEMS.register("fire_opal_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> FLOURITE_LIQUID = ITEMS.register("flourite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> STURMANITE_LIQUID = ITEMS.register("sturmanite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_LIQUID = ITEMS.register("volcanic_rose_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> ZINCITE_LIQUID = ITEMS.register("zincite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> ZIRCON_LIQUID = ITEMS.register("zircon_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> EXOTIC_LIQUID = ITEMS.register("exotic_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> HYBRID_LIQUID = ITEMS.register("hybrid_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> CLINOHUMITE_LIQUID = ITEMS.register("clinohumite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> HACKMANITE_LIQUID = ITEMS.register("hackmanite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> SPHALERITE_LIQUID = ITEMS.register("sphalerite_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	public static final RegistryObject<Item> SUNSTONE_LIQUID = ITEMS.register("sunstone_liquid", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERLIQUIDS_TAB)));
	//nuggets//
	public static final RegistryObject<Item> ERYTHRITE_NUGGET = ITEMS.register("erythrite_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> FLOURITE_NUGGET = ITEMS.register("flourite_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_NUGGET = ITEMS.register("fools_gold_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> PINK_OPAL_NUGGET = ITEMS.register("pink_opal_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> STURMANITE_NUGGET = ITEMS.register("sturmanite_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> AMMOLITE_NUGGET = ITEMS.register("ammolite_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> CITRINE_NUGGET = ITEMS.register("citrine_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));
	public static final RegistryObject<Item> SPINEL_NUGGET = ITEMS.register("spinel_nugget", () -> new Item(new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERMATERIALS_TAB)));	
	//weapons//
	public static final RegistryObject<Item> CHRYSOCOLLA_SWORD = ITEMS.register("chrysocolla_sword", () -> new SwordItem(TmcItemTier.CHRYSOCOLLA, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> DARK_BATTLEAXE = ITEMS.register("dark_battleaxe",  () -> new SwordItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> DARK_SILVER_SWORD = ITEMS.register("dark_silver_sword", () -> new SwordItem(TmcItemTier.DARK_SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword", () -> new SwordItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> ERYTHRITE_CLUB = ITEMS.register("erythrite_club", () -> new SwordItem(TmcItemTier.ERYTHRITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_BATTLEAXE = ITEMS.register("fire_opal_battleaxe", () -> new SwordItem(TmcItemTier.FIREOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> FIRE_OPAL_SWORD = ITEMS.register("fire_opal_sword", () -> new SwordItem(TmcItemTier.FIREOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> HYBRID_WARHAMMER = ITEMS.register("hybrid_warhammer", () -> new SwordItem(TmcItemTier.HYBRID, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> SILVER_BATTLEAXE = ITEMS.register("silver_battleaxe", () -> new SwordItem(TmcItemTier.SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(TmcItemTier.SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> SLEDGE_HAMMER = ITEMS.register("sledge_hammer", () -> new SwordItem(TmcItemTier.SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_SWORD = ITEMS.register("volcanic_rose_sword", () -> new SwordItem(TmcItemTier.VOLCANICROSE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> ZINCITE_DAGGER = ITEMS.register("zincite_dagger", () -> new SwordItem(TmcItemTier.ZINCITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword", () -> new SwordItem(TmcItemTier.ZIRCON, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword", () -> new SwordItem(TmcItemTier.ALEXANDRITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> BERYL_SWORD = ITEMS.register("beryl_sword", () -> new SwordItem(TmcItemTier.BERYL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> AMMOLITE_SWORD = ITEMS.register("ammolite_sword", () -> new SwordItem(TmcItemTier.AMMOLITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> GARNET_SWORD = ITEMS.register("garnet_sword", () -> new SwordItem(TmcItemTier.GARNET, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> HACKMANITE_SWORD = ITEMS.register("hackmanite_sword", () -> new SwordItem(TmcItemTier.HACKMANITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(TmcItemTier.RUBY, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> SPINEL_SWORD = ITEMS.register("spinel_sword", () -> new SwordItem(TmcItemTier.SPINEL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword", () -> new SwordItem(TmcItemTier.TOURMALINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));	
	public static final RegistryObject<Item> BERYL_BATTLEAXE = ITEMS.register("beryl_battleaxe", () -> new SwordItem(TmcItemTier.BERYL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	public static final RegistryObject<Item> SUNSTONE_BATTLEAXE = ITEMS.register("sunstone_battleaxe", () -> new SwordItem(TmcItemTier.SUNSTONE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERWEAPONS_TAB)));
	//all the tools XD//
	public static final RegistryObject<Item> AQUAMARINE_AXE = ITEMS.register("aquamarine_axe",() -> new AxeItem(TmcItemTier.AQUAMARINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AQUAMARINE_PICK = ITEMS.register("aquamarine_pick", () -> new HoeItem(TmcItemTier.AQUAMARINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel", () -> new PickaxeItem(TmcItemTier.AQUAMARINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AZURITE_AXE = ITEMS.register("azurite_axe", () -> new AxeItem(TmcItemTier.AZURITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AZURITE_PICK = ITEMS.register("azurite_pick", () -> new HoeItem(TmcItemTier.AZURITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AZURITE_SHOVEL = ITEMS.register("azurite_shovel", () -> new PickaxeItem(TmcItemTier.AZURITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_AXE = ITEMS.register("chrysocolla_axe", () -> new AxeItem(TmcItemTier.CHRYSOCOLLA, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_PICK = ITEMS.register("chrysocolla_pick", () -> new HoeItem(TmcItemTier.CHRYSOCOLLA, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_SHOVEL = ITEMS.register("chrysocolla_shovel", () -> new PickaxeItem(TmcItemTier.CHRYSOCOLLA, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> DARK_AXE = ITEMS.register("dark_axe", () -> new AxeItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> DARK_HOE = ITEMS.register("dark_hoe", () -> new HoeItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> DARK_PICK = ITEMS.register("dark_pick", () -> new PickaxeItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> DARK_SHOVEL = ITEMS.register("dark_shovel", () -> new ShovelItem(TmcItemTier.DARK, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> HYBRID_AXE = ITEMS.register("hybrid_axe", () -> new PickaxeItem(TmcItemTier.HYBRID, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> HYBRID_PICK = ITEMS.register("hybrid_pick", () -> new PickaxeItem(TmcItemTier.HYBRID, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> HYBRID_SHOVEL = ITEMS.register("hybrid_shovel", () -> new ShovelItem(TmcItemTier.HYBRID, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_SHOVEL = ITEMS.register("fools_gold_shovel", () -> new ShovelItem(TmcItemTier.FOOLS_GOLD, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(TmcItemTier.OBSIDIAN, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_PICK = ITEMS.register("obsidian_pick", () -> new HoeItem(TmcItemTier.OBSIDIAN, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new PickaxeItem(TmcItemTier.OBSIDIAN, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(TmcItemTier.SAPPHIRE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SAPPHIRE_PICK = ITEMS.register("sapphire_pick", () -> new HoeItem(TmcItemTier.SAPPHIRE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new PickaxeItem(TmcItemTier.SAPPHIRE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(TmcItemTier.SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SILVER_PICK = ITEMS.register("silver_pick", () -> new AxeItem(TmcItemTier.SILVER, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> STURMANITE_AXE = ITEMS.register("sturmanite_axe", () -> new AxeItem(TmcItemTier.STURMANITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
    public static final RegistryObject<Item> STURMANITE_SHOVEL = ITEMS.register("sturmanite_shovel", () -> new ShovelItem(TmcItemTier.STURMANITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_AXE = ITEMS.register("volcanic_rose_axe", () -> new AxeItem(TmcItemTier.VOLCANICROSE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_SHOVEL = ITEMS.register("volcanic_rose_shovel", () -> new ShovelItem(TmcItemTier.VOLCANICROSE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_PICK = ITEMS.register("volcanic_rose_pick", () -> new PickaxeItem(TmcItemTier.VOLCANICROSE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe", () -> new AxeItem(TmcItemTier.ZIRCON, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe", () -> new HoeItem(TmcItemTier.ZIRCON, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ZIRCON_PICK = ITEMS.register("zircon_pick", () -> new PickaxeItem(TmcItemTier.ZIRCON, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel", () -> new ShovelItem(TmcItemTier.ZIRCON, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe", () -> new AxeItem(TmcItemTier.ALEXANDRITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> ALEXANDRITE_PICK = ITEMS.register("alexandrite_pick", () -> new PickaxeItem(TmcItemTier.ALEXANDRITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel", () -> new ShovelItem(TmcItemTier.ALEXANDRITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AMMOLITE_AXE = ITEMS.register("ammolite_axe", () -> new AxeItem(TmcItemTier.AMMOLITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AMMOLITE_PICK = ITEMS.register("ammolite_pick", () -> new PickaxeItem(TmcItemTier.AMMOLITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> AMMOLITE_SHOVEL = ITEMS.register("ammolite_shovel", () -> new ShovelItem(TmcItemTier.AMMOLITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> BERYL_AXE = ITEMS.register("beryl_axe", () -> new AxeItem(TmcItemTier.BERYL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> BARYL_PICK = ITEMS.register("beryl_pick", () -> new PickaxeItem(TmcItemTier.BERYL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> BERYL_SHOVEL = ITEMS.register("beryl_shovel", () -> new ShovelItem(TmcItemTier.BERYL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(TmcItemTier.RUBY, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(TmcItemTier.RUBY, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> RUBY_PICK = ITEMS.register("ruby_pick", () -> new PickaxeItem(TmcItemTier.RUBY, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> KUNZITE_AXE = ITEMS.register("kunzite_axe", () -> new AxeItem(TmcItemTier.KUNZITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> KUNZITE_PICK = ITEMS.register("kunzite_pick", () -> new PickaxeItem(TmcItemTier.KUNZITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> KUNZITE_SHOVEL = ITEMS.register("kunzite_shovel", () -> new ShovelItem(TmcItemTier.KUNZITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> FIREOPAL_AXE = ITEMS.register("fireopal_axe", () -> new AxeItem(TmcItemTier.FIREOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> FIREOPAL_PICK = ITEMS.register("fireopal_pick", () -> new PickaxeItem(TmcItemTier.FIREOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> FIREOPAL_SHOVEL = ITEMS.register("fireopal_shovel", () -> new ShovelItem(TmcItemTier.FIREOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> PINKOPAL_AXE = ITEMS.register("pinkopal_axe", () -> new AxeItem(TmcItemTier.PINKOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> PINKOPAL_PICK = ITEMS.register("pinkopal_pick", () -> new PickaxeItem(TmcItemTier.PINKOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> PINKOPAL_SHOVEL = ITEMS.register("pinkopal_shovel", () -> new ShovelItem(TmcItemTier.PINKOPAL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> GARNET_AXE = ITEMS.register("garnet_axe", () -> new AxeItem(TmcItemTier.GARNET, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> GARNET_PICK = ITEMS.register("garnet_pick", () -> new PickaxeItem(TmcItemTier.GARNET, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> GARNET_SHOVEL = ITEMS.register("garnet_shovel", () -> new ShovelItem(TmcItemTier.GARNET, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> SPINEL_AXE = ITEMS.register("spinel_axe", () -> new AxeItem(TmcItemTier.SPINEL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SPINEL_PICK = ITEMS.register("spinel_pick", () -> new PickaxeItem(TmcItemTier.SPINEL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SPINEL_SHOVEL = ITEMS.register("spinel_shovel", () -> new ShovelItem(TmcItemTier.SPINEL, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> TOURMALINE_AXE = ITEMS.register("tourmaline_axe", () -> new AxeItem(TmcItemTier.TOURMALINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel", () -> new ShovelItem(TmcItemTier.TOURMALINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> TOURMALINE_PICK = ITEMS.register("tourmaline_pick", () -> new PickaxeItem(TmcItemTier.TOURMALINE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SPHALERITE_AXE = ITEMS.register("sphalerite_axe", () -> new AxeItem(TmcItemTier.SPHALERITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SPHALERITE_PICK = ITEMS.register("sphalerite_pick", () -> new PickaxeItem(TmcItemTier.SPHALERITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SPHALERITE_SHOVEL = ITEMS.register("sphalerite_shovel", () -> new ShovelItem(TmcItemTier.SPHALERITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SUNSTONE_AXE = ITEMS.register("sunstone_axe", () -> new AxeItem(TmcItemTier.SUNSTONE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));	
	public static final RegistryObject<Item> SUNSTONE_PICK = ITEMS.register("sunstone_pick", () -> new PickaxeItem(TmcItemTier.SUNSTONE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> SUNSTONE_SHOVEL = ITEMS.register("sunstone_shovel", () -> new ShovelItem(TmcItemTier.SUNSTONE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CLINOHUMITE_PICK = ITEMS.register("clinohumite_pick", () -> new PickaxeItem(TmcItemTier.CLINOHUMITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CLINOHUMITE_SHOVEL = ITEMS.register("clinohumite_shovel", () -> new ShovelItem(TmcItemTier.CLINOHUMITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	public static final RegistryObject<Item> CLINOHUMITE_AXE = ITEMS.register("clinohumite_axe", () -> new AxeItem(TmcItemTier.CLINOHUMITE, 6, -3.4F, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERTOOLS_TAB)));
	//all the armors XD//
	public static final RegistryObject<Item> AQUAMARINE_BOOTS = ITEMS.register("aquamarine_boots", () -> new ArmorItem(TmcArmorMaterial.AQUAMARINE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AQUAMARINE_LEGGINGS = ITEMS.register("aquamarine_leggings", () -> new ArmorItem(TmcArmorMaterial.AQUAMARINE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AQUAMARINE_CHESTPLATE = ITEMS.register("aquamarine_chestplate", () -> new ArmorItem(TmcArmorMaterial.AQUAMARINE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AQUAMARINE_HELMET = ITEMS.register("aquamarine_helmet", () -> new ArmorItem(TmcArmorMaterial.AQUAMARINE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> AZURITE_BOOTS = ITEMS.register("azurite_boots", () -> new ArmorItem(TmcArmorMaterial.AZURITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AZURITE_LEGGINGS = ITEMS.register("azurite_leggings", () -> new ArmorItem(TmcArmorMaterial.AZURITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AZURITE_CHESTPLATE = ITEMS.register("azurite_chestplate", () -> new ArmorItem(TmcArmorMaterial.AZURITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AZURITE_HELMET = ITEMS.register("azurite_helmet", () -> new ArmorItem(TmcArmorMaterial.AZURITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_BOOTS = ITEMS.register("chrysocolla_boots", () -> new ArmorItem(TmcArmorMaterial.CHRYSOCOLLA, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_LEGGINGS = ITEMS.register("chrysocolla_leggings", () -> new ArmorItem(TmcArmorMaterial.CHRYSOCOLLA, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_CHESTPLATE = ITEMS.register("chrysocolla_chestplate", () -> new ArmorItem(TmcArmorMaterial.CHRYSOCOLLA, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CHRYSOCOLLA_HELMET = ITEMS.register("chrysocolla_helmet", () -> new ArmorItem(TmcArmorMaterial.CHRYSOCOLLA, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> DARK_BOOTS = ITEMS.register("dark_boots", () -> new ArmorItem(TmcArmorMaterial.DARK, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_LEGGINGS = ITEMS.register("dark_leggings", () -> new ArmorItem(TmcArmorMaterial.DARK, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_CHESTPLATE = ITEMS.register("dark_chestplate", () -> new ArmorItem(TmcArmorMaterial.DARK, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_HELMET = ITEMS.register("dark_helmet", () -> new ArmorItem(TmcArmorMaterial.DARK, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> EXOTIC_BOOTS = ITEMS.register("exotic_boots", () -> new ArmorItem(TmcArmorMaterial.EXOTIC, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> EXOTIC_LEGGINGS = ITEMS.register("exotic_leggings", () -> new ArmorItem(TmcArmorMaterial.EXOTIC, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> EXOTIC_CHESTPLATE = ITEMS.register("exotic_chestplate", () -> new ArmorItem(TmcArmorMaterial.EXOTIC, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> EXOTIC_HELMET = ITEMS.register("exotic_helmet", () -> new ArmorItem(TmcArmorMaterial.EXOTIC, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FAIRY_BOOTS = ITEMS.register("fairy_boots",() -> new ArmorItem(TmcArmorMaterial.FAIRY, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FAIRY_LEGGINGS = ITEMS.register("fairy_leggings", () -> new ArmorItem(TmcArmorMaterial.FAIRY, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FAIRY_CHESTPLATE = ITEMS.register("fairy_chestplate", () -> new ArmorItem(TmcArmorMaterial.FAIRY, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FAIRY_HELMET = ITEMS.register("fairy_helmet", () -> new ArmorItem(TmcArmorMaterial.FAIRY, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FLOURITE_BOOTS = ITEMS.register("flourite_boots",() -> new ArmorItem(TmcArmorMaterial.FLOURITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FLOURITE_LEGGINGS = ITEMS.register("flourite_leggings", () -> new ArmorItem(TmcArmorMaterial.FLOURITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FLOURITE_CHESTPLATE = ITEMS.register("flourite_chestplate", () -> new ArmorItem(TmcArmorMaterial.FLOURITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FLOURITE_HELMET = ITEMS.register("flourite_helmet", () -> new ArmorItem(TmcArmorMaterial.FLOURITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_BOOTS = ITEMS.register("fools_gold_boots",() -> new ArmorItem(TmcArmorMaterial.FOOLS_GOLD, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_LEGGINGS = ITEMS.register("fools_gold_leggings", () -> new ArmorItem(TmcArmorMaterial.FOOLS_GOLD, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_CHESTPLATE = ITEMS.register("fools_gold_chestplate", () -> new ArmorItem(TmcArmorMaterial.FOOLS_GOLD, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> FOOLS_GOLD_HELMET = ITEMS.register("fools_gold_helmet", () -> new ArmorItem(TmcArmorMaterial.FOOLS_GOLD, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HYBRID_BOOTS = ITEMS.register("hybrid_boots",() -> new ArmorItem(TmcArmorMaterial.HYBRID, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HYBRID_LEGGINGS = ITEMS.register("hybrid_leggings", () -> new ArmorItem(TmcArmorMaterial.HYBRID, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HYBRID_CHESTPLATE = ITEMS.register("hybrid_chestplate", () -> new ArmorItem(TmcArmorMaterial.HYBRID, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HYBRID_HELMET = ITEMS.register("hybrid_helmet", () -> new ArmorItem(TmcArmorMaterial.HYBRID, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> KUNZITE_BOOTS = ITEMS.register("kunzite_boots",() -> new ArmorItem(TmcArmorMaterial.KUNZITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> KUNZITE_LEGGINGS = ITEMS.register("kunzite_leggings", () -> new ArmorItem(TmcArmorMaterial.KUNZITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> KUNZITE_CHESTPLATE = ITEMS.register("kunzite_chestplate", () -> new ArmorItem(TmcArmorMaterial.KUNZITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> KUNZITE_HELMET = ITEMS.register("kunzite_helmet", () -> new ArmorItem(TmcArmorMaterial.KUNZITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));		
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",() -> new ArmorItem(TmcArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(TmcArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(TmcArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(TmcArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));		
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",() -> new ArmorItem(TmcArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(TmcArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(TmcArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(TmcArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",() -> new ArmorItem(TmcArmorMaterial.ZIRCON, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings", () -> new ArmorItem(TmcArmorMaterial.ZIRCON, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate", () -> new ArmorItem(TmcArmorMaterial.ZIRCON, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet", () -> new ArmorItem(TmcArmorMaterial.ZIRCON, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));				
	public static final RegistryObject<Item> VOLCANIC_ROSE_BOOTS = ITEMS.register("volcanic_rose_boots",() -> new ArmorItem(TmcArmorMaterial.VOLCANIC_ROSE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_LEGGINGS = ITEMS.register("volcanic_rose_leggings", () -> new ArmorItem(TmcArmorMaterial.VOLCANIC_ROSE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_CHESTPLATE = ITEMS.register("volcanic_rose_chestplate", () -> new ArmorItem(TmcArmorMaterial.VOLCANIC_ROSE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> VOLCANIC_ROSE_HELMET = ITEMS.register("volcanic_rose_helmet", () -> new ArmorItem(TmcArmorMaterial.VOLCANIC_ROSE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));				
	public static final RegistryObject<Item> DARK_HYBRID_BOOTS = ITEMS.register("dark_hybrid_boots",() -> new ArmorItem(TmcArmorMaterial.DARK_HYBRID, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_HYBRID_LEGGINGS = ITEMS.register("dark_hybrid_leggings", () -> new ArmorItem(TmcArmorMaterial.DARK_HYBRID, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_HYBRID_CHESTPLATE = ITEMS.register("dark_hybrid_chestplate", () -> new ArmorItem(TmcArmorMaterial.DARK_HYBRID, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> DARK_HYBRID_HELMET = ITEMS.register("dark_hybrid_helmet", () -> new ArmorItem(TmcArmorMaterial.DARK_HYBRID, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> ALEXANDRITE_BOOTS = ITEMS.register("alexandrite_boots",() -> new ArmorItem(TmcArmorMaterial.ALEXANDRITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_LEGGINGS = ITEMS.register("alexandrite_leggings", () -> new ArmorItem(TmcArmorMaterial.ALEXANDRITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_CHESTPLATE = ITEMS.register("alexandrite_chestplate", () -> new ArmorItem(TmcArmorMaterial.ALEXANDRITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> ALEXANDRITE_HELMET = ITEMS.register("alexandrite_helmet", () -> new ArmorItem(TmcArmorMaterial.ALEXANDRITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> BERYL_BOOTS = ITEMS.register("beryl_boots",() -> new ArmorItem(TmcArmorMaterial.BERYL, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> BERYL_LEGGINGS = ITEMS.register("beryl_leggings", () -> new ArmorItem(TmcArmorMaterial.BERYL, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> BERYL_CHESTPLATE = ITEMS.register("beryl_chestplate", () -> new ArmorItem(TmcArmorMaterial.BERYL, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> BERYL_HELMET = ITEMS.register("beryl_helmet", () -> new ArmorItem(TmcArmorMaterial.BERYL, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",() -> new ArmorItem(TmcArmorMaterial.CITRINE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings", () -> new ArmorItem(TmcArmorMaterial.CITRINE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine_chestplate", () -> new ArmorItem(TmcArmorMaterial.CITRINE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet", () -> new ArmorItem(TmcArmorMaterial.CITRINE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> HACKMANITE_BOOTS = ITEMS.register("hackmanite_boots",() -> new ArmorItem(TmcArmorMaterial.HACKMANITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HACKMANITE_LEGGINGS = ITEMS.register("hackmanite_leggings", () -> new ArmorItem(TmcArmorMaterial.HACKMANITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HACKMANITE_CHESTPLATE = ITEMS.register("hackmanite_chestplate", () -> new ArmorItem(TmcArmorMaterial.HACKMANITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> HACKMANITE_HELMET = ITEMS.register("hackmanite_helmet", () -> new ArmorItem(TmcArmorMaterial.HACKMANITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> PINKOPAL_BOOTS = ITEMS.register("pink_opal_boots",() -> new ArmorItem(TmcArmorMaterial.PINKOPAL, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> PINKOPAL_LEGGINGS = ITEMS.register("pink_opal_leggings", () -> new ArmorItem(TmcArmorMaterial.PINKOPAL, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> PINKOPAL_CHESTPLATE = ITEMS.register("pink_opal_chestplate", () -> new ArmorItem(TmcArmorMaterial.PINKOPAL, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> PINKOPAL_HELMET = ITEMS.register("pink_opal_helmet", () -> new ArmorItem(TmcArmorMaterial.PINKOPAL, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> SPINEL_BOOTS = ITEMS.register("spinel_boots",() -> new ArmorItem(TmcArmorMaterial.SPINEL, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPINEL_LEGGINGS = ITEMS.register("spinel_leggings", () -> new ArmorItem(TmcArmorMaterial.SPINEL, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPINEL_CHESTPLATE = ITEMS.register("spinel_chestplate", () -> new ArmorItem(TmcArmorMaterial.SPINEL, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPINEL_HELMET = ITEMS.register("spinel_helmet", () -> new ArmorItem(TmcArmorMaterial.SPINEL, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> SPHALERITE_BOOTS = ITEMS.register("sphalerite_boots",() -> new ArmorItem(TmcArmorMaterial.SPHALERITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPHALERITE_LEGGINGS = ITEMS.register("sphalerite_leggings", () -> new ArmorItem(TmcArmorMaterial.SPHALERITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPHALERITE_CHESTPLATE = ITEMS.register("sphalerite_chestplate", () -> new ArmorItem(TmcArmorMaterial.SPHALERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> SPHALERITE_HELMET = ITEMS.register("sphalerite_helmet", () -> new ArmorItem(TmcArmorMaterial.SPHALERITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	public static final RegistryObject<Item> AMMOLITE_BOOTS = ITEMS.register("ammolite_boots",() -> new ArmorItem(TmcArmorMaterial.AMMOLITE, EquipmentSlotType.FEET, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AMMOLITE_LEGGINGS = ITEMS.register("ammolite_leggings", () -> new ArmorItem(TmcArmorMaterial.AMMOLITE, EquipmentSlotType.LEGS, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AMMOLITE_CHESTPLATE = ITEMS.register("ammolite_chestplate", () -> new ArmorItem(TmcArmorMaterial.AMMOLITE, EquipmentSlotType.CHEST, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));
	public static final RegistryObject<Item> AMMOLITE_HELMET = ITEMS.register("ammolite_helmet", () -> new ArmorItem(TmcArmorMaterial.AMMOLITE, EquipmentSlotType.HEAD, new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERARMOR_TAB)));	
	//horse armor//	
 
	//blockitems//
	public static final RegistryObject<BlockItem> AZURITE_BLOCK = ITEMS.register("azurite_block",
			() -> new BlockItem(BlockInit.AZURITE_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> BLACK_MICA_BLOCK = ITEMS.register("black_mica_block",
			() -> new BlockItem(BlockInit.BLACK_MICA_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> CHRYSOCOLLA_BLOCK = ITEMS.register("chrysocolla_block",
			() -> new BlockItem(BlockInit.CHRYSOCOLLA_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ERYTHRITE_BLOCK = ITEMS.register("erythrite_block",
			() -> new BlockItem(BlockInit.ERYTHRITE_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FIRE_OPAL_BLOCK = ITEMS.register("fire_opal_block",
			() -> new BlockItem(BlockInit.FIRE_OPAL_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FLOURITE_BLOCK = ITEMS.register("flourite_block",
			() -> new BlockItem(BlockInit.FLOURITE_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FOOLS_GOLD_BLOCK = ITEMS.register("fools_gold_block",
			() -> new BlockItem(BlockInit.FOOLS_GOLD_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> PINK_OPAL_BLOCK = ITEMS.register("pink_opal_block",
			() -> new BlockItem(BlockInit.PINK_OPAL_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> STURMANITE_BLOCK = ITEMS.register("sturmanite_block",
			() -> new BlockItem(BlockInit.STURMANITE_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> VOLCANIC_ROSE_BLOCK = ITEMS.register("volcanic_rose_block",
			() -> new BlockItem(BlockInit.VOLCANIC_ROSE_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ZIRCON_BLOCK = ITEMS.register("zircon_block",
			() -> new BlockItem(BlockInit.ZIRCON_BLOCK.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> AQUAMARINE_ORE = ITEMS.register("aquamarine_ore",
			() -> new BlockItem(BlockInit.AQUAMARINE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> AZURITE_ORE = ITEMS.register("azurite_ore",
			() -> new BlockItem(BlockInit.AZURITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> BLACK_MICA_ORE = ITEMS.register("black_mica_ore",
			() -> new BlockItem(BlockInit.BLACK_MICA_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> CHRYSOCOLLA_ORE = ITEMS.register("chrysocolla_ore",
			() -> new BlockItem(BlockInit.CHRYSOCOLLA_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ERYTHRITE_ORE = ITEMS.register("erythrite_ore",
			() -> new BlockItem(BlockInit.ERYTHRITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FIRE_OPAL_ORE = ITEMS.register("fire_opal_ore",
			() -> new BlockItem(BlockInit.FIRE_OPAL_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FLOURITE_ORE = ITEMS.register("flourite_ore",
			() -> new BlockItem(BlockInit.FLOURITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> FOOLS_GOLD_ORE = ITEMS.register("fools_gold_ore",
			() -> new BlockItem(BlockInit.FOOLS_GOLD_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> HYDROCERUSSITE_ORE = ITEMS.register("hydrocerussite_ore",
			() -> new BlockItem(BlockInit.HYDROCERUSSITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> KUNZITE_ORE = ITEMS.register("kunzite_ore",
			() -> new BlockItem(BlockInit.KUNZITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));	
	public static final RegistryObject<BlockItem> PINK_OPAL_ORE = ITEMS.register("pink_opal_ore",
			() -> new BlockItem(BlockInit.PINK_OPAL_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore",
			() -> new BlockItem(BlockInit.SILVER_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> STURMANITE_ORE = ITEMS.register("sturmanite_ore",
			() -> new BlockItem(BlockInit.STURMANITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> VOLCANIC_ROSE_ORE = ITEMS.register("volcanic_rose_ore",
			() -> new BlockItem(BlockInit.VOLCANIC_ROSE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ZINCITE_ORE = ITEMS.register("zincite_ore",
			() -> new BlockItem(BlockInit.ZINCITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ZIRCON_ORE = ITEMS.register("zircon_ore",
			() -> new BlockItem(BlockInit.ZIRCON_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore",
			() -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> ALEXANDRITE_ORE = ITEMS.register("alexandrite_ore",
			() -> new BlockItem(BlockInit.ALEXANDRITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> AMMOLITE_ORE = ITEMS.register("ammolite_ore",
			() -> new BlockItem(BlockInit.AMMOLITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> BERYL_ORE = ITEMS.register("beryl_ore",
			() -> new BlockItem(BlockInit.BERYL_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore",
			() -> new BlockItem(BlockInit.CITRINE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> CLINOHUMITE_ORE = ITEMS.register("clinohumite_ore",
			() -> new BlockItem(BlockInit.CLINOHUMITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));	
	public static final RegistryObject<BlockItem> GARNET_ORE = ITEMS.register("garnet_ore",
			() -> new BlockItem(BlockInit.GARNET_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> HACKMANITE_ORE = ITEMS.register("hackmanite_ore",
			() -> new BlockItem(BlockInit.HACKMANITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
			() -> new BlockItem(BlockInit.RUBY_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> SPHALERITE_ORE = ITEMS.register("sphalerite_ore",
			() -> new BlockItem(BlockInit.SPHALERITE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> SPINEL_ORE = ITEMS.register("spinel_ore",
			() -> new BlockItem(BlockInit.SPINEL_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> SUNSTONE_ORE = ITEMS.register("sunstone_ore",
			() -> new BlockItem(BlockInit.SUNSTONE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
	public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore",
			() -> new BlockItem(BlockInit.TOURMALINE_ORE.get(), 
				  new Item.Properties().tab(TheMadCrafter.THEMADCRAFTERBLOCKS_TAB)));
}
