package be.isach.ultracosmetics.v1_11_R1.nms;

import net.minecraft.server.v1_11_R1.EntityLiving;

public class WrapperEntityLiving extends WrapperEntity {

    protected EntityLiving handle;

    public WrapperEntityLiving(EntityLiving handle) {
        super(handle);

        this.handle = handle;
    }

    /*
     * 1_9_R2 : aP
     */
    public float getRotationYawHead() {
        return handle.aQ;
    }

    public void setRotationYawHead(float rotationYawHead) {
        handle.aQ = rotationYawHead;
    }

    /*
     * 1_9_R2 : aN
     */
    public float getRenderYawOffset() {
        return handle.aO;
    }

    public void setRenderYawOffset(float renderYawOffset) {
        handle.aO = renderYawOffset;
    }

    /*
     * 1_9_R2 : be
     */
    public float getMoveStrafing() {
        return handle.bf;
    }

    public void setMoveStrafing(float moveStrafing) {
        handle.bf = moveStrafing;
    }

    /*
     * 1_9_R2 : bf
     */
    public float getMoveForward() {
        return handle.bg;
    }

    public void setMoveForward(float moveForward) {
        handle.bg = moveForward;
    }

    /*
     * 1_9_R2 : bd
     */
    public boolean isJumping() {
        return getField("be", EntityLiving.class, Boolean.class);
    }

    public void setJumping(boolean jumping) {
        setField("be", EntityLiving.class, jumping);
    }

    /*
     * 1_9_R2 : aR
     * 1_10_R1 : aS
     */
    public float getJumpMovementFactor() {
        return handle.aR;
    }

    public void setJumpMovementFactor(float jumpMovementFactor) {
        handle.aR = jumpMovementFactor;
    }

    /*
     * 1_9_R2 : aF
     */
    public float getPrevLimbSwingAmount() {
        return handle.aG;
    }

    public void setPrevLimbSwingAmount(float prevLimbSwingAmount) {
        handle.aG = prevLimbSwingAmount;
    }

    /*
     * 1_9_R2 : aG
     */
    public float getLimbSwingAmount() {
        return handle.aH;
    }

    public void setLimbSwingAmount(float limbSwingAmount) {
        handle.aH = limbSwingAmount;
    }

    /*
     * 1_9_R2 : aH
     * 1_10_R1 : aI
     */
    public float getLimbSwing() {
        return handle.aH;
    }

    public void setLimbSwing(float limbSwing) {
        handle.aH = limbSwing;
    }

    /*
     * 1_9_R2 : cl() - l(float)
     * 1_10_R1 : cp
     */
    public float getMoveSpeed() {
        return handle.cq();
    } //cq is the only public float in EntityLiving that starts with c, all the others starting with c are now protected

    public void setMoveSpeed(float moveSpeed) {
        handle.l(moveSpeed);
    }

    @Override
    public EntityLiving getHandle() {
        return handle;
    }

}
