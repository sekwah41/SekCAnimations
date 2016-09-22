package sekwah.mods.sekcanimations.animdata;

import net.minecraft.entity.Entity;

/**
 * Like dynamic but follows a looping timeline
 *
 * TODO sort timeline data.
 */
public class TimelinePose extends Pose {

    public TimelinePose(String poseName) {
        super(poseName);
    }

    // Pases the normal updatePose variables.
    public void updatePose(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity, float... args) {

    }
}
