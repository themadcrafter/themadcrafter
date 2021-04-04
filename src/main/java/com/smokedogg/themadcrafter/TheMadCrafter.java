package com.smokedogg.themadcrafter;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.smokedogg.themadcrafter.core.init.BlockInit;
import com.smokedogg.themadcrafter.core.init.ItemInit;
import com.smokedogg.themadcrafter.world.TmcOreGeneration;

@Mod(TheMadCrafter.MOD_ID)

public class TheMadCrafter {
	
   public static final Logger LOGGER = LogManager.getLogger();
   public static final String MOD_ID = "themadcrafter";
 
   public static final ItemGroup THEMADCRAFTERARMOR_TAB = new TMCArmorGroup("themadcraftersarmor");
   public static final ItemGroup THEMADCRAFTERTOOLS_TAB = new TMCToolsGroup("themadcrafterstools");
   public static final ItemGroup THEMADCRAFTERWEAPONS_TAB = new TMCWeaponGroup("themadcraftersweapons"); 
   public static final ItemGroup THEMADCRAFTERINGOTS_TAB = new TMCIngotsGroup("themadcraftersingots");
   public static final ItemGroup THEMADCRAFTERCRYSTALS_TAB = new TMCCrystalsGroup("themadcrafterscrystals"); 
   public static final ItemGroup THEMADCRAFTERLIQUIDS_TAB = new TMCLiquidsGroup("themadcraftersliquids");
   public static final ItemGroup THEMADCRAFTERBLOCKS_TAB = new TMCBlocksGroup("themadcraftersblocks"); 
   public static final ItemGroup THEMADCRAFTERMOLDS_TAB = new TMCMoldsGroup("themadcraftersmolds");
   public static final ItemGroup THEMADCRAFTERMATERIALS_TAB = new TMCMaterialsGroup("themadcraftersmaterials");
   public static final ItemGroup THEMADCRAFTERORES_TAB = new TMCOresGroup("themadcraftersores");
   
   public TheMadCrafter() {
	   IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
       bus.addListener(this::setup); 

       ItemInit.ITEMS.register(bus);
       BlockInit.BLOCKS.register(bus);    
       
       MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, TmcOreGeneration::generateOres);
       MinecraftForge.EVENT_BUS.register(this);
	}  
    private void setup(final FMLCommonSetupEvent event) {   
    }
    
    public static class TMCToolsGroup extends ItemGroup {
		public TMCToolsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.ZIRCON_PICK.get().getDefaultInstance();
		}
    }
    public static class TMCArmorGroup extends ItemGroup {
		public TMCArmorGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.AZURITE_CHESTPLATE.get().getDefaultInstance();
		}
    }
    public static class TMCMaterialsGroup extends ItemGroup {
		public TMCMaterialsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.REINFORCED_TOOL_BAR.get().getDefaultInstance();
		}
    } 
    public static class TMCBlocksGroup extends ItemGroup {
		public TMCBlocksGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.CHRYSOCOLLA_BLOCK.get().getDefaultInstance();
		}
    }  
    public static class TMCMoldsGroup extends ItemGroup {
		public TMCMoldsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.INGOT_MOLD.get().getDefaultInstance();
		}
    }
    public static class TMCWeaponGroup extends ItemGroup {
		public TMCWeaponGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.ZIRCON_SWORD.get().getDefaultInstance();
		}
    }  
    public static class TMCIngotsGroup extends ItemGroup {
		public TMCIngotsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.AZURITE_INGOT.get().getDefaultInstance();
		}
    } 
    public static class TMCCrystalsGroup extends ItemGroup {
		public TMCCrystalsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.CHRYSOCOLLA_CRYSTAL.get().getDefaultInstance();
		}
    }  
    public static class TMCLiquidsGroup extends ItemGroup {
		public TMCLiquidsGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.FLOURITE_LIQUID.get().getDefaultInstance();
		}
    }  
    public static class TMCOresGroup extends ItemGroup {
		public TMCOresGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return ItemInit.GARNET_ORE.get().getDefaultInstance();
		}

	    @SubscribeEvent
	    public void onServerStarting(FMLServerStartingEvent event) {
	    }

	    @SubscribeEvent
	    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
	    }
	}
    
}