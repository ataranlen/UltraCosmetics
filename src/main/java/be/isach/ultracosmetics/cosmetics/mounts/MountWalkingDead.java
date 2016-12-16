package be.isach.ultracosmetics.cosmetics.mounts;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.util.Particles;
import be.isach.ultracosmetics.util.UtilParticles;
import org.bukkit.entity.Horse;

import java.util.UUID;
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.entity.ZombieHorse;

/**
 * Created by sacha on 10/08/15.
 */
public class MountWalkingDead extends Mount {

    public MountWalkingDead(UUID owner, UltraCosmetics ultraCosmetics) {
        super(owner, MountType.WALKINGDEAD, ultraCosmetics);
    }

    @Override
    protected void onEquip() {
        ZombieHorse horse = (ZombieHorse) entity;
        //horse.setVariant(Horse.Variant.UNDEAD_HORSE);
        //variant = Horse.Variant.UNDEAD_HORSE;
        horse.setTamed(true); //pretty sure this is redundant, same as for infernal horror.
        //getLogger().info(horse.getInventory().toString()); 
        horse.setJumpStrength(0.7);
        //UltraCosmetics.getInstance().getEntityUtil().setHorseSpeed(horse, 0.4d); //apparently can't set the speed of zombie horses
    }

    @Override
    protected void onUpdate() {
        UtilParticles.display(Particles.CRIT_MAGIC, 0.4f, 0.2f, 0.4f, entity.getLocation().clone().add(0, 1, 0), 5);
        UtilParticles.display(Particles.SPELL_MOB_AMBIENT, 0.4f, 0.2f, 0.4f, entity.getLocation().clone().add(0, 1, 0), 5);
    }
}
