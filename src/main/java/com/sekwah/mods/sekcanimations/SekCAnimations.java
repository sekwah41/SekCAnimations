package com.sekwah.mods.sekcanimations;

import com.sekwah.mods.sekcanimations.animators.PlayerAnimator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
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

    // TODO for the lang files possibly use the \u0007 character code thing and see if that works for accents

    public static final String version = "0.3.4";

    public static PlayerAnimator playerAnimator;

    @EventHandler
    public void init(FMLInitializationEvent event) {

        playerAnimator = new PlayerAnimator();

    }

}
