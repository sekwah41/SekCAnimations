package sekwah.mods.sekcanimations;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sekwah.mods.sekcanimations.animators.EntityAnimator;
import sekwah.mods.sekcanimations.animators.PlayerAnimator;
import sekwah.mods.sekcanimations.animators.TileBlockAnimator;
import sekwah.mods.sekcanimations.common.CommonProxy;
import sekwah.mods.sekcanimations.common.EventHook;

/**
 * Created by sekwah on 12/11/2015.
 * TODO add the option for specific positions or weights.
 *
 * TODO use the gson library inbuilt to one of the libraries minecraft uses :D
 */
@Mod(modid = SekCAnimations.modid, name = "SekCAnimations", version = SekCAnimations.version)
public class SekCAnimations {
    public static final String modid = "sekcanims";

    public static final String version = "0.0.1";

    public static final Logger logger = LogManager.getLogger("SekCAnims");

    @SidedProxy(clientSide = "sekwah.mods.sekcanimations.client.ClientProxy", serverSide = "sekwah.mods.sekcanimations.common.CommonProxy")
    public static CommonProxy proxy;

    // TODO make the SekC animator say in the chat when you join if there is an update available.

    public static PlayerAnimator playerAnimator;
    private EntityAnimator entityAnimator;
    private TileBlockAnimator blockAnimator;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // In case it is ever decided that config variables are needed.
        //File configFolder = event.getModConfigurationDirectory();

        EventHook eventHandler = new EventHook();

        MinecraftForge.EVENT_BUS.register(eventHandler);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        playerAnimator = new PlayerAnimator();

        /*entityAnimator = new EntityAnimator();*/ // TODO add entity animator

        /*blockAnimator = new TileBlockAnimator();*/ // TODO add block animator if felt neccesary(may never need it though for blocks like the cybernetic workbench it would be great)

    }



}
