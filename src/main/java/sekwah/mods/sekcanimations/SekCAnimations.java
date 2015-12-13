package sekwah.mods.sekcanimations;

import sekwah.mods.sekcanimations.animators.EntityAnimator;
import sekwah.mods.sekcanimations.animators.PlayerAnimator;
import sekwah.mods.sekcanimations.animators.TileBlockAnimator;
import sekwah.mods.sekcanimations.server.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by sekwah on 12/11/2015.
 * TODO add the option for specific positions or weights.
 */
@Mod(modid = SekCAnimations.modid, name = "SekCAnimations", version = SekCAnimations.version)

public class SekCAnimations {
    public static final String modid = "sekcanims";

    public static final Logger LOGGER = LogManager.getLogger("SekCAnimations");

    @SidedProxy(clientSide = "sekwah.mods.narutomod.client.ClientProxy", serverSide = "sekwah.mods.narutomod.generic.CommonProxy")
    public static ServerProxy proxy;

    // TODO make the SekC animator say in the chat when you join if there is an update available.

    public static final String version = "0.0.1";

    public static PlayerAnimator playerAnimator;
    private EntityAnimator entityAnimator;
    private TileBlockAnimator blockAnimator;

    @EventHandler
    public void init(FMLInitializationEvent event) {

        playerAnimator = new PlayerAnimator();

        /*entityAnimator = new EntityAnimator();*/ // TODO add entity animator

        /*blockAnimator = new TileBlockAnimator();*/ // TODO add block animator if felt neccesary(may never need it though for blocks like the cybernetic workbench it would be great)

    }

}
