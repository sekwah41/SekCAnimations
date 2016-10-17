package sekcanimations.trackers.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import sekcanimations.animdata.Pose;

import java.util.ArrayList;

public class PlayerAnimTracker extends BaseAnimTracker
{

    // TODO can be used to save data but in this case the extended properties is just used to track all animation data on players
    // TODO create extended properties for entities, or use a range of the datawatchers. Whatever is best.
    public final static String IDENTIFIER = "sekcanimations_animdata";

    /*
    The default constructor takes no arguments, but I put in the Entity so I can initialize the above variable 'player'

    Also, it's best to initialize any other variables you may have added, just like in any constructor.
    */
    public PlayerAnimTracker(EntityPlayer player)
    {
        super(player);
    }

    public ArrayList<Pose> activePoses(){
        return this.basePoses;
    }

    public EntityPlayer getPlayer(){
        return (EntityPlayer) entity;
    }

    /**
     * Used to register these extended properties for the player during EntityConstructing event and is used to register its self
     * also it makes the code look nice so why not
     */
    public static final void register(EntityPlayer player)
    {
        player.registerExtendedProperties(PlayerAnimTracker.IDENTIFIER, new PlayerAnimTracker(player));
    }

    /**
     * Returns ExtendedPlayer properties for player
     * This method is for convenience only
     */
    public static final PlayerAnimTracker get(EntityPlayer player)
    {
        return (PlayerAnimTracker) player.getExtendedProperties(IDENTIFIER);
    }

    // Save any custom data that needs saving here
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