package net.appls.lebronmod.item;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class AthleticismEffect extends MobEffect {
    public AthleticismEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        Vec3 initialVec = pLivingEntity.getDeltaMovement();

        // Increase movement speed
        double speedBoost = 0.15D + (pAmplifier * 0.05D);
        Vec3 speedVec = new Vec3(initialVec.x * (1 + speedBoost), initialVec.y, initialVec.z * (1 + speedBoost));

        // Enhance jump height if on the ground
        if (pLivingEntity.onGround()) {
            speedVec = speedVec.add(0, 0.4D + (pAmplifier * 0.1D), 0);
        }

        pLivingEntity.setDeltaMovement(speedVec);
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}