package me.furt.dvz;

import me.furt.dvz.capability.IManaCapability;
import me.furt.dvz.capability.ManaCapability;
import me.furt.dvz.command.CommandDVZ;
import me.furt.dvz.handler.ConfigurationHandler;
import me.furt.dvz.handler.ManaStorageHandler;
import me.furt.dvz.init.ModBlocks;
import me.furt.dvz.init.ModItems;
import me.furt.dvz.proxy.IProxy;
import me.furt.dvz.references.Files;
import me.furt.dvz.references.Messages;
import me.furt.dvz.references.Reference;
import me.furt.dvz.util.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, certificateFingerprint = Reference.FINGERPRINT, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DwarvesVsZombies
{
    @Instance(Reference.MOD_ID)
    public static DwarvesVsZombies instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event) {
    	
        if (Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {
            LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
        }
        else
        {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }
    
    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {

        event.registerServerCommand(new CommandDVZ());
    }
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	//ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    	//Files.Global.init(event);
    	
    	proxy.registerKeybindings();
    	ModItems.init();
        ModBlocks.init();
    	
    	//CapabilityManager.INSTANCE.register(IManaCapability.class, new ManaStorageHandler(), ManaCapability.class);
    	//MinecraftForge.EVENT_BUS.register(this);
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.initRenderingAndTextures();

        proxy.registerEventHandlers();
        
    	//DvzRecipes.addRecipes();
    	
    }
    
    @SubscribeEvent
    public void AttachCapability(AttachCapabilitiesEvent.Entity event) {
    	// TODO
    }
    
    @SubscribeEvent
    public void onClonePlayer(PlayerEvent.Clone event) {
    	// TODO
    }
}
