package sekcanimations.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sekcanimations.animators.EntityAnimator;
import sekcanimations.animators.PlayerAnimator;
import sekcanimations.animators.TileBlockAnimator;
import sekcanimations.common.core.EventHook;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sekcanimations.common.core.CommonProxy;

/**
 * Created by sekwah on 12/11/2015.
 * TODO add the option for specific positions or weights.
 *
 * TODO I still need to make a maven server to build the mods so people can get dependencies a lot easier. For now it'll
 * be manually add them but ill look into it once this library is released.
 *
 * TODO use the gson library inbuilt to one of the libraries minecraft uses :D
 */
@Mod(modid = SekCAnimations.modid, name = "SekCAnimations", version = SekCAnimations.version)
public class SekCAnimations {
    public static final String modid = "sekcanims";

    public static final String version = "0.0.1";

    public static final Logger logger = LogManager.getLogger("SekCAnims");

    @Mod.Instance
    public static SekCAnimations instance;

    @SidedProxy(clientSide = "ClientProxy", serverSide = "sekwah.mods.sekcanimations.common.CommonProxy")
    public static CommonProxy proxy;

    // TODO make the SekC animator say in the chat when you join if there is an update available.

    public static PlayerAnimator playerAnimator;
    public EntityAnimator entityAnimator;
    public TileBlockAnimator blockAnimator;

    public EventHook eventHandler;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // In case it is ever decided that config variables are needed.
        //File configFolder = event.getModConfigurationDirectory();

        eventHandler = new EventHook();

        MinecraftForge.EVENT_BUS.register(eventHandler);
        FMLCommonHandler.instance().bus().register(eventHandler);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        playerAnimator = new PlayerAnimator();

        /*entityAnimator = new EntityAnimator();*/ // TODO add entity animator

        /*blockAnimator = new TileBlockAnimator();*/ // TODO add block animator if felt neccesary(may never need it though for blocks like the cybernetic workbench it would be great)

    }



}
