package com.smokedogg.themadcrafter.core.util;

import com.smokedogg.themadcrafter.core.init.*;
import java.util.function.Supplier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum TmcArmorMaterial implements IArmorMaterial {
   AQUAMARINE("aquamarine", 15, new int[]{4, 10, 13, 6}, 16, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.AQUAMARINE_INGOT.get());}),	
   AZURITE("azurite", 15, new int[]{7, 16, 14, 9}, 13, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.AZURITE_CRYSTAL.get());}),
   DARK("dark", 15, new int[]{6, 9, 10, 6}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.DARK_SILVER_INGOT.get());}),
   SILVER("silver", 15, new int[]{5, 9, 11, 5}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.SILVER_INGOT.get());}), 
   FAIRY("fairy", 15, new int[]{8, 11, 12, 7}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.FAIRY_INGOT.get());}),
   HYBRID("hybrid", 15, new int[]{13, 15, 16, 11}, 22, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.HYBRID_LIQUID.get());}),  
   ZIRCON("zircon", 15, new int[]{11, 12, 13, 8}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.ZIRCON_CRYSTAL.get());}), 
   KUNZITE("kunzite", 15, new int[]{6, 9, 10, 6}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.KUNZITE_INGOT.get());}),   
   OBSIDIAN("obsidian", 15, new int[]{12, 14, 15, 9}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.OBSIDIAN_CRYSTAL.get());}), 
   DARK_HYBRID("dark_hybrid", 15, new int[]{13, 15, 16, 11}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.DARK_SILVER_INGOT.get());}),   
   CHRYSOCOLLA("chrysocolla", 15, new int[]{5, 12, 17, 10}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.CHRYSOCOLLA_CRYSTAL.get());}),   
   VOLCANIC_ROSE("volcanic_rose", 15, new int[]{7, 11, 13, 8}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.VOLCANIC_ROSE_CRYSTAL.get());}), 
   FOOLS_GOLD("fools_gold", 15, new int[]{6, 8, 10, 5}, 10, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.FOOLS_GOLD_INGOT.get());}),    
   EXOTIC("exotic", 15, new int[]{13, 15, 16, 11}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.EXOTIC_LIQUID.get());}),
   FLOURITE("flourite", 15, new int[]{8, 10, 12, 5}, 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.FLOURITE_INGOT.get());}),
   ALEXANDRITE("alexandrite", 15, new int[]{4, 10, 13, 6}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.ALEXANDRITE_CRYSTAL.get());}),	
   AMMOLITE("ammolite", 15, new int[]{4, 10, 10, 6}, 13, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.AMMOLITE_INGOT.get());}),
   BERYL("beryl", 15, new int[]{6, 9, 10, 6}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.BERYL_CRYSTAL.get());}),
   CITRINE("citrine", 15, new int[]{5, 9, 11, 5}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.CITRINE_INGOT.get());}), 
   CLINOHUMITE("clinohumite", 15, new int[]{8, 10, 12, 5}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.CLINOHUMITE_CRYSTAL.get());}),
   GARNET("garnet", 15, new int[]{13, 15, 16, 11}, 22, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.GARNET_CRYSTAL.get());}),  
   HACKMANITE("hackmanite", 15, new int[]{11, 12, 13, 8}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.HACKMANITE_CRYSTAL.get());}), 
   RUBY("ruby", 15, new int[]{6, 9, 10, 6}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.RUBY_CRYSTAL.get());}),   
   SPHALERITE("sphalerite", 15, new int[]{12, 14, 15, 9}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.SPHALERITE_CRYSTAL.get());}), 
   SPINEL("spinel", 15, new int[]{13, 15, 16, 11}, 20, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.SPINEL_INGOT.get());}),   
   SUNSTONE("sunstone", 15, new int[]{7, 10, 13, 8}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.SUNSTONE_CRYSTAL.get());}),   
   TOURMALINE("tourmaline", 15, new int[]{9, 13, 15, 9}, 8, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.TOURMALINE_CRYSTAL.get());}), 
   PINKOPAL("pink_opal", 15, new int[]{6, 7, 10, 4}, 10, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.PINKOPAL_INGOT.get());}),    
   SAPPHIRE("sapphire", 15, new int[]{13, 15, 16, 11}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.CRYSTALIZED_SAPPHIRE_INGOT.get());}),
   FIREOPAL("fire_opal", 15, new int[]{9, 12, 12,9}, 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.FIRE_OPAL_CRYSTAL.get());});
	
   private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
   private final String name;
   private final int durabilityMultiplier;
   private final int[] slotProtections;
   private final int enchantmentValue;
   private final SoundEvent sound;
   private final float toughness;
   private final float knockbackResistance;
   private final LazyValue<Ingredient> repairIngredient;

   private TmcArmorMaterial(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_,
		   float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
      this.name = p_i231593_3_;
      this.durabilityMultiplier = p_i231593_4_;
      this.slotProtections = p_i231593_5_;
      this.enchantmentValue = p_i231593_6_;
      this.sound = p_i231593_7_;
      this.toughness = p_i231593_8_;
      this.knockbackResistance = p_i231593_9_;
      this.repairIngredient = new LazyValue<>(p_i231593_10_);
   }
   public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
      return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
   }
   public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
      return this.slotProtections[p_200902_1_.getIndex()];
   }
   public int getEnchantmentValue() {
      return this.enchantmentValue;
   }
   public SoundEvent getEquipSound() {
      return this.sound;
   }
   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }
   @OnlyIn(Dist.CLIENT)
   public String getName() {
      return this.name;
   }
   public float getToughness() {
      return this.toughness;
   }
   public float getKnockbackResistance() {
      return this.knockbackResistance;
   }
}