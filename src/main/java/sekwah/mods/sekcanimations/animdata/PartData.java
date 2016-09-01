package sekwah.mods.sekcanimations.animdata;


public class PartData {

    public String partName;

    // LocationData
    public boolean[] hasPos = {false, false, false};
    public float rotationPointX;
    public float rotationPointY;
    public float rotationPointZ;
    public boolean[] shouldRot = {false, false, false};
    public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;

    public float lastAnimTime;
    public float animTime;

    public String currentAnim;

    public PartData(String partName) {
        this.partName = partName;
    }

    public PartData(String partName, boolean fullPos, boolean fullRot) {
        this.partName = partName;
        hasPos[0] = fullPos;
        hasPos[1] = fullPos;
        hasPos[2] = fullPos;

        shouldRot[0] = fullRot;
        shouldRot[1] = fullRot;
        shouldRot[2] = fullRot;
    }

    public PartData(String partName, boolean hasPosX, boolean hasPosY, boolean hasPosZ, boolean hasRotX, boolean hasRotY, boolean hasRotZ) {
        this.partName = partName;
        hasPos[0] = hasPosX;
        hasPos[1] = hasPosY;
        hasPos[2] = hasPosZ;

        shouldRot[0] = hasRotX;
        shouldRot[1] = hasRotY;
        shouldRot[2] = hasRotZ;
    }

    public void setRotationPoint(float x, float y, float z) {
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
    }
}
