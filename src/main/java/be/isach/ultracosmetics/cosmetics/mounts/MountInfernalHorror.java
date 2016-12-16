package be.isach.ultracosmetics.cosmetics.mounts;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.util.Particles;
import be.isach.ultracosmetics.util.UtilParticles;
import org.bukkit.entity.Horse;

import java.util.UUID;
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.Material;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.inventory.ItemStack;

/**
 * Created by sacha on 10/08/15.
 */
public class MountInfernalHorror extends Mount {

    public MountInfernalHorror(UUID owner, UltraCosmetics ultraCosmetics) {
        super(owner, MountType.INFERNALHORROR, ultraCosmetics);
    }

    @Override
    protected void onEquip() {
        if (entity instanceof SkeletonHorse) {
            SkeletonHorse horse = (SkeletonHorse) entity;
            horse.setTamed(true); //this might still not have a saddle, not sure how to give it a saddle
            //horse.setVariant(Horse.Variant.SKELETON_HORSE);
            //variant = Horse.Variant.SKELETON_HORSE;
            horse.setJumpStrength(0.7);
            //getLogger().info(horse.getInventory().toString()); 
            //UltraCosmetics.getInstance().getEntityUtil().setHorseSpeed(horse, 0.4d);
        }
    }

    @Override
    protected void onUpdate() {
        UtilParticles.display(Particles.FLAME, 0.4f, 0.2f, 0.4f, entity.getLocation().clone().add(0, 1, 0), 5);
    }
}
