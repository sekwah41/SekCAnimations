package sekwah.mods.sekcanimations.extendedproperties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerInfo implements IExtendedEntityProperties
{

    // TODO can be used to save data but in this case the extended properties is just used to track all animation data on players
    // TODO create extended properties for entities, or use a range of the datawatchers. Whatever is best.
    public final static String IDENTIFIER = "sekcanimations_playerdata";

    // could be usefull but not currently used, also this will only exist on a player and will not change so its reasonably safe
    private final EntityPlayer player;

    private String currentPose = "default";

    /*
    The default constructor takes no arguments, but I put in the Entity so I can initialize the above variable 'player'

    Also, it's best to initialize any other variables you may have added, just like in any constructor.
    */
    public PlayerInfo(EntityPlayer player)
    {
        this.player = player;
    }

    public String getPoseName(){
        return this.currentPose;
    }

    /**
     * Used to register these extended properties for the player during EntityConstructing event and is used to register its self
     * also it makes the code look nice so why not
     */
    public static final void register(EntityPlayer player)
    {
        player.registerExtendedProperties(PlayerInfo.IDENTIFIER, new PlayerInfo(player));
    }

    /**
     * Returns ExtendedPlayer properties for player
     * This method is for convenience only
     */
    public static final PlayerInfo get(EntityPlayer player)
    {
        return (PlayerInfo) player.getExtendedProperties(IDENTIFIER);
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