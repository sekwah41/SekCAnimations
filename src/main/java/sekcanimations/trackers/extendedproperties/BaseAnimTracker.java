package sekcanimations.trackers.extendedproperties;

import sekcanimations.animdata.Pose;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import java.util.ArrayList;

/**
 * Take a look to see if there is a better method for this but as the data is alongside the actual player
 * and not using a hashmap it account for duplicates and all sorts. Also may be faster(allthough could be wrong)
 */
public class BaseAnimTracker implements IExtendedEntityProperties
{

    // TODO can be used to save data but in this case the extended properties is just used to track all animation data on players
    // TODO create extended properties for entities, or use a range of the datawatchers. Whatever is best.
    public final static String IDENTIFIER = "sekcanimations_animdata";

    // could be usefull but not currently used, also this will only exist on a player and will not change so its reasonably safe
    protected final Entity entity;

    /**
     * For example when the animation is changed from standing to flying in the dbz demo.
     */
    protected Pose defaultPose = null;

    /**
     * Used for the underlying stuff, e.g. item poses and stuff
     */
    protected ArrayList<Pose> basePoses = new ArrayList<Pose>();

    /**
     * Will be stuff such as an attacking animation possibly(may change levels at a later date)
     */
    protected ArrayList<Pose> overlayingPoses = new ArrayList<Pose>();

    /**
     * If this is set then only this will be activated. It will be for things such as a cutscene for example :3
     * Possibly an emote or animation timeline which wants no interfering(exept from the default vanilla anims).
     */
    protected Pose absolutePose = null;

    /*
    The default constructor takes no arguments, but I put in the Entity so I can initialize the above variable 'player'

    Also, it's best to initialize any other variables you may have added, just like in any constructor.
    */
    public BaseAnimTracker(Entity entity)
    {
        this.entity = entity;
    }

    public ArrayList<Pose> activePoses(){
        return this.basePoses;
    }

    /**
     * Used to register these extended properties for the player during EntityConstructing event and is used to register its self
     * also it makes the code look nice so why not
     */
    public static final void register(Entity entity)
    {
        entity.registerExtendedProperties(PlayerAnimTracker.IDENTIFIER, new BaseAnimTracker(entity));
    }

    /**
     * Returns ExtendedPlayer properties for player
     * This method is for convenience only
     */
    public static final BaseAnimTracker get(Entity entity)
    {
        return (BaseAnimTracker) entity.getExtendedProperties(IDENTIFIER);
    }

    // None of this will be used as anim data does not need to be stored.

    @Override
    public void saveNBTData(NBTTagCompound compound)
    {

    }

    // Load whatever data you saved
    @Override
    public void loadNBTData(NBTTagCompound compound)
    {

    }

    @Override
    public void init(Entity entity, World world)
    {

    }
}