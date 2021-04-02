package com.smokedogg.themadcrafter.core.util;

import java.util.function.Supplier;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import com.smokedogg.themadcrafter.core.init.*;

public enum TmcItemTier implements IItemTier {
   DARK(2, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.DARK_INGOT.get());}),
   AZURITE(1, 450, 4.0F, 1.0F, 8, () -> {return Ingredient.of(ItemInit.AZURITE_INGOT.get());}), 
   ZINCITE(1, 400, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemInit.ZINCITE_CRYSTAL.get());}),
   AQUAMARINE(2, 720, 4.0F, 1.0F, 8, () -> {return Ingredient.of(ItemInit.AQUAMARINE_INGOT.get());}),
   STURMANITE(1, 650, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemInit.STURMANITE_INGOT.get());}),
   ERYTHRITE(2, 570, 6.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.ERYTHRITE_INGOT.get());}),
   FOOLS_GOLD(2, 340, 6.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.FOOLS_GOLD_INGOT.get());}),
   SILVER(2, 550, 6.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.SILVER_INGOT.get());}),
   CHRYSOCOLLA(2, 561, 6.0F, 2.0F, 10, () -> {return Ingredient.of(ItemInit.CHRYSOCOLLA_CRYSTAL.get());}),
   OBSIDIAN(3, 1211, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.OBSIDIAN_CRYSTAL.get());}),
   HYBRID(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.HYBRID_LIQUID.get());}),
   FIREOPAL(2, 1322, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.FIRE_OPAL_CRYSTAL.get());}),
   SAPPHIRE(3, 1156, 7.0F, 4.0F, 13, () -> {return Ingredient.of(ItemInit.CRYSTALIZED_SAPPHIRE_INGOT.get());}),
   DARK_SILVER(1, 700, 10.0F, 0.0F, 11, () -> {return Ingredient.of(ItemInit.DARK_SILVER_INGOT.get());}),
   VOLCANICROSE(3, 1500, 11.0F, 0.0F, 22, () -> {return Ingredient.of(ItemInit.VOLCANIC_ROSE_CRYSTAL.get());}),
   ZIRCON(3, 2031, 8.0F, 4.0F, 18, () -> {return Ingredient.of(ItemInit.ZIRCON_CRYSTAL.get());}),
   FLOURITE(1, 531, 7.0F, 4.0F, 18, () -> {return Ingredient.of(ItemInit.FLOURITE_INGOT.get());}),	
   PINKOPAL(1, 408, 3.0F, 1.0F, 5, () -> {return Ingredient.of(ItemInit.PINKOPAL_INGOT.get());}),
   KUNZITE(2, 700, 4.0F, 1.0F, 8, () -> {return Ingredient.of(ItemInit.KUNZITE_INGOT.get());}),
   ALEXANDRITE(2, 1150, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemInit.ALEXANDRITE_CRYSTAL.get());}),
   AMMOLITE(2, 504, 6.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.AMMOLITE_INGOT.get());}),
   BERYL(2, 300, 5.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.BERYL_CRYSTAL.get());}),
   CITRINE(2, 550, 6.0F, 2.0F, 14, () -> {return Ingredient.of(ItemInit.CITRINE_INGOT.get());}),
   CLINOHUMITE(3, 561, 6.0F, 2.0F, 10, () -> {return Ingredient.of(ItemInit.CLINOHUMITE_CRYSTAL.get());}),
   GARNET(3, 900, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.GARNET_CRYSTAL.get());}),
   HACKMANITE(3, 1200, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.HACKMANITE_CRYSTAL.get());}),
   RUBY(3, 1322, 8.0F, 3.0F, 10, () -> {return Ingredient.of(ItemInit.RUBY_CRYSTAL.get());}),
   SPHALERITE(3, 1274, 6.0F, 4.0F, 13, () -> {return Ingredient.of(ItemInit.SPHALERITE_CRYSTAL.get());}),
   SPINEL(1, 670, 10.0F, 0.0F, 11, () -> {return Ingredient.of(ItemInit.SPINEL_INGOT.get());}),
   SUNSTONE(3, 831, 9.0F, 4.0F, 18, () -> {return Ingredient.of(ItemInit.SUNSTONE_CRYSTAL.get());}),
   TOURMALINE(1, 600, 11.0F, 0.0F, 11, () -> {return Ingredient.of(ItemInit.TOURMALINE_CRYSTAL.get());});   
   private final int level;
   private final int uses;
   private final float speed;
   private final float damage;
   private final int enchantmentValue;
   private final LazyValue<Ingredient> repairIngredient;

   private TmcItemTier(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
      this.level = p_i48458_3_;
      this.uses = p_i48458_4_;
      this.speed = p_i48458_5_;
      this.damage = p_i48458_6_;
      this.enchantmentValue = p_i48458_7_;
      this.repairIngredient = new LazyValue<>(p_i48458_8_);
   }

   public int getUses() {
      return this.uses;
   }

   public float getSpeed() {
      return this.speed;
   }

   public float getAttackDamageBonus() {
      return this.damage;
   }

   public int getLevel() {
      return this.level;
   }

   public int getEnchantmentValue() {
      return this.enchantmentValue;
   }

   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }
}
