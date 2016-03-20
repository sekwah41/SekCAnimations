package sekwah.mods.sekcanimations.base.anims.player;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import sekwah.mods.sekcanimations.animdata.DynamicPose;
import sekwah.mods.sekcanimations.animdata.PartData;

import java.util.HashMap;

public class FlyingPose extends DynamicPose {

    private final PartData rightArmUpper;
    private final PartData leftArmUpper;
    private final PartData rightArmLower;
    private final PartData leftArmLower;
    private final PartData head;
    private final PartData upperBody;
    private final PartData lowerBody;
    private final PartData rightLegUpper;
    private final PartData rightLegLower;
    private final PartData leftLegUpper;
    private final PartData leftLegLower;

    public FlyingPose() {
        super("flying");

        //partData = new PartData[11];
        partData = new HashMap<String, PartData>();
        rightArmUpper = new PartData("rightArmUpper", true, true);
        partData.put("rightArmUpper", rightArmUpper);
        rightArmLower = new PartData("rightArmLower", false, true);
        partData.put("rightArmLower", rightArmLower);

        leftArmUpper = new PartData("leftArmUpper", true, true);
        partData.put("leftArmUpper", leftArmUpper);
        leftArmLower = new PartData("leftArmLower", false, true);
        partData.put("leftArmLower", leftArmLower);
        head = new PartData("head", true, true);
        partData.put("head", head);
        upperBody = new PartData("upperBody", true, true);
        partData.put("upperBody", upperBody);
        lowerBody = new PartData("lowerBody", true, true);
        partData.put("lowerBody", lowerBody);
        rightLegUpper = new PartData("rightLegUpper", true, true);
        partData.put("rightLegUpper", rightLegUpper);
        rightLegLower = new PartData("rightLegLower", false, true);
        partData.put("rightLegLower", rightLegLower);
        leftLegUpper = new PartData("leftLegUpper", true, true);
        partData.put("leftLegUpper", leftLegUpper);
        leftLegLower = new PartData("leftLegLower", false, true);
        partData.put("leftLegLower", leftLegLower);

        // TODO need to add a part sorter or use a hash map
        //partData = DBZAnimator.sortParts(partData);
    }

    public void updatePose(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity, float... args) {


        // TODO recode the part positions and rotations for the new model.

        // TODO add code to do the punching animation

        EntityPlayer player = (EntityPlayer) par7Entity;

        double xSpeed = player.posX - player.prevPosX;
        double ySpeed = player.posY - player.prevPosY;
        double zSpeed = player.posY - player.prevPosZ;

        double speed = Math.sqrt(Math.pow(xSpeed,2) + Math.pow(ySpeed,2) + Math.pow(zSpeed,2));

        float bobbing = MathHelper.cos(par3 * 0.09F + 0.2F);

        rightArmUpper.setRotationPoint(-5.0F, 2.0F + par2 + bobbing, 0.0F);
        leftArmUpper.setRotationPoint(5.0F, 2.0F + par2 + bobbing, 0.0F);
        upperBody.setRotationPoint(0.0F, 0.0F + par2 + bobbing, 0.0F);
        lowerBody.setRotationPoint(0F, 6F + par2 + bobbing, 0F);
        head.setRotationPoint(0.0F, 0.0F + par2 + bobbing, 0.0F);

        leftLegUpper.setRotationPoint(2F, 12.0F + par2 + bobbing, 0.0F);
        rightLegUpper.setRotationPoint(-2F, 12.0F + par2 + bobbing, 0.0F);

        rightArmUpper.rotateAngleX = 0.1F;
        rightArmUpper.rotateAngleZ = 0.1F;
        leftArmUpper.rotateAngleX = 0.1F;
        leftArmUpper.rotateAngleZ = -0.1F;
        rightArmUpper.rotateAngleY = 0F;
        leftArmUpper.rotateAngleY = 0F;

        rightLegUpper.rotateAngleX = -0.1F;
        rightLegUpper.rotateAngleZ = 0.1F;
        leftLegUpper.rotateAngleX = -0.1F;
        leftLegUpper.rotateAngleZ = -0.1F;

        float headAngleChange = par2;

        if(headAngleChange > 1F){
            headAngleChange = 1F;
        }
        else if(headAngleChange < 0F){
            headAngleChange = 0F;
        }

        head.rotateAngleY = par4 / (180F / (float) Math.PI) * (1F - headAngleChange);
        head.rotateAngleX = par5 / (180F / (float) Math.PI) * (1F - headAngleChange);

        head.rotateAngleY += 0;
        head.rotateAngleX -= 1.0F * headAngleChange + par4 / (180F / (float) Math.PI) * 0.1F;

        head.rotateAngleZ = par4 / (180F / (float) Math.PI) * -headAngleChange;

        rotateAngleX = 70 * headAngleChange;

        ItemStack itemstack = player.inventory.getCurrentItem();
        int itemInHand = itemstack != null ? 1 : 0;
        if(itemInHand == 1){
            rightArmUpper.rotateAngleX -= 0.3;
        }

        leftArmLower.rotateAngleX = -MathHelper.cos(par3 * 0.09F) * 0.09F - 0.61F;
        rightArmLower.rotateAngleX = -MathHelper.sin(par3 * 0.09F) * 0.09F - 0.61F;

        rightArmUpper.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.09F + 0.05F;
        leftArmUpper.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.09F + 0.05F;
        rightArmUpper.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.09F + 0.13F;
        leftArmUpper.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.09F - 0.13F;

        leftLegLower.rotateAngleX = MathHelper.cos(par3 * 0.09F) * 0.09F + 0.61F;
        rightLegLower.rotateAngleX = MathHelper.sin(par3 * 0.09F) * 0.09F + 0.61F;

        rightLegUpper.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.03F + 0.05F;
        leftLegUpper.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.03F + 0.05F;
        rightLegUpper.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.09F - 0.13F;
        leftLegUpper.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.09F + 0.13F;

        leftLegLower.rotateAngleX *= (1 - headAngleChange);

        leftLegUpper.rotateAngleX = (leftLegUpper.rotateAngleX * (1 - headAngleChange)) + headAngleChange * 0.2F;

        rightLegLower.rotateAngleX = (rightLegLower.rotateAngleX * (1 - headAngleChange)) + (headAngleChange * 0.9F);

        rightLegUpper.rotateAngleX = (rightLegUpper.rotateAngleX * (1 - headAngleChange)) + (headAngleChange * -0.4F);


        // Arm swinging code
        /*if (args[0] > -9990.0F) {
            float f6 = args[0];
            upperBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float) Math.PI * 2.0F) * 0.2F;
            lowerBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float) Math.PI * 2.0F) * 0.2F;
            rightArmUpper.rotationPointZ = MathHelper.sin(upperBody.rotateAngleY) * 5.0F;
            rightArmUpper.rotationPointX = -MathHelper.cos(upperBody.rotateAngleY) * 5.0F;
            leftArmUpper.rotationPointZ = -MathHelper.sin(upperBody.rotateAngleY) * 5.0F;
            leftArmUpper.rotationPointX = MathHelper.cos(upperBody.rotateAngleY) * 5.0F;
            rightArmUpper.rotateAngleY += upperBody.rotateAngleY;
            leftArmUpper.rotateAngleY += upperBody.rotateAngleY;
            leftArmUpper.rotateAngleX += upperBody.rotateAngleY;
            f6 = 1.0F - args[0];
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            float f7 = MathHelper.sin(f6 * (float) Math.PI);
            float var10 = MathHelper.sin(args[0] * (float) Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;
            rightArmUpper.rotateAngleX = (float) ((double) rightArmUpper.rotateAngleX - ((double) f7 * 1.2D + (double) var10));
            rightArmUpper.rotateAngleY += upperBody.rotateAngleY * 2.0F;
            rightArmUpper.rotateAngleZ = MathHelper.sin(args[0] * (float) Math.PI) * -0.4F;
        }*/

        if (itemstack != null && player.getItemInUseCount() > 0) {
            EnumAction enumaction = itemstack.getItemUseAction();

            if (enumaction == EnumAction.block) {
                rightArmUpper.rotateAngleX -= 0.3;
            } else if (enumaction == EnumAction.bow) {
                rightArmUpper.rotateAngleZ = 0.0F;
                leftArmUpper.rotateAngleZ = 0.0F;
                rightArmUpper.rotateAngleY = -(0.1F) + head.rotateAngleY;
                leftArmUpper.rotateAngleY = 0.1F + head.rotateAngleY + 0.4F;
                rightArmUpper.rotateAngleX = -((float) Math.PI / 2F) + head.rotateAngleX;
                leftArmUpper.rotateAngleX = -((float) Math.PI / 2F) + head.rotateAngleX;
                rightArmUpper.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                leftArmUpper.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
                rightArmUpper.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
                leftArmUpper.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
                rightArmLower.rotateAngleX = 0F;
                leftArmLower.rotateAngleX = 0F;
            }
        }

    }
}
