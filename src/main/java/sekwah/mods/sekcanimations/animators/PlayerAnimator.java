package sekwah.mods.sekcanimations.animators;

import sekwah.mods.sekcanimations.animdata.Pose;

/**
 * Created by sekwah on 12/11/2015.
 */
public class PlayerAnimator extends Animator {

    // Make a hashmap of player pose data here to the entity id

    /**
     * Poses will now sort of be known as modifiers rather than the player needs to be in 1 set pose, this will remove the need of the default pose.
     *
     * Also whenever the player poses are updates there will be a broadcast with a packet containing all of the different poses currently active in
     * order of most important to least important. If a pose is already altering that part then ignore the others(basically get each part to check
     * the current list of poses and find the first pose it wants to move to to get the desired position.
     *
     * Whenever the pose list has changed store a temp value of the last known pose position to stop having to constantly scan the file and increase speed.
     * If the pose stuff really is effected badly by this then possibly have it know about any dynamic poses and track that body part for the last position.
     * Also dont forget to add a smoothing value, smoothing type (slow start slow end, fast start slow end or slot start fast end) and also transition length,
     * this adds to the variation and allows for nice added detail. Also track with a simple number how long each animation has been going on for so it is known
     * if it should have stopped, that or add some code to check if all parts for that pose have stated they are completely in the new position(could be better
     * as parts need to calculate the percentage difference from the last pose to get their current pose.
     *
     * With the new system rather than changing the current default anim, changes to the default anim will just be added as a low priority animation(added last)
     * possibly make a animation priority system to try and make sure that there is no chance of animations appearing in the wrong order.
     *
     * Also add possibly a hash registry system, that way if there are specific parts about the player you want to change and stop overlaps(for instance jutsu pose)
     * add a id to track it so only 1 can be active at once, that way if you try to activate a fireball while summoning it will cancel the summoning animation. Also
     * possibly add checks for poses and add tags so you can check if there is an animation with a tag, that way you could stop other abilities activating if you
     * are still doing a past ability that takes some time :)
     */


    public static Pose[] playerPoses;



}
