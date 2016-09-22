package sekwah.mods.sekcanimations.animdata;


import java.util.HashMap;
import java.util.Map;

/**
 * General static pose
 */
public class Pose {

    public String poseName;

    public int animLength = 14;

    public String nextPose;

    public int completeAction;

    public Map<String, PartData> partData = new HashMap<String,PartData>();
    //public PartData[] partData;

    public boolean hasRotation = false;

    public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;

    public Pose(String poseName) {
        this.poseName = poseName;
    }

    public Pose(String poseName, PartData... partData) {
        this.poseName = poseName;
        for(PartData part : partData){
            this.partData.put(part.partName, part);
        }
        //this.partData = partData;
    }
}
