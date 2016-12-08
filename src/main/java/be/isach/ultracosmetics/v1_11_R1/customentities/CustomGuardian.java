package be.isach.ultracosmetics.v1_11_R1.customentities;

import be.isach.ultracosmetics.v1_11_R1.morphs.MorphElderGuardian;
import net.minecraft.server.v1_11_R1.*;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftArmorStand;
import org.bukkit.entity.ArmorStand;

/**
 * Created by Sacha on 19/12/15.
 */
public class CustomGuardian extends EntityGuardian {

    private boolean custom;

    public CustomGuardian(World world) {
        super(world);
    }

    public void check() {
        custom = MorphElderGuardian.customEntities.contains(this);
    }

    public void target(ArmorStand armorStand) {
        try {
            getDataWatcher().set(DataWatcherRegistry.c.a(17), (float) (armorStand == null ? 0 : ((CraftArmorStand) armorStand).getHandle().getId()));
        } catch (Exception exc) {

        }
    }

    @Override
    protected SoundEffect G() {
        if (custom) {
            return null;
        } else {
            return super.G();
        }
    }

    //previously bV
    @Override
    protected SoundEffect bW() {
        if (custom) {
            return null;
        } else {
            return super.bW();
        }
    }

    //previously bW
    @Override
    protected SoundEffect bX() {
        if (custom) {
            return null;
        } else {
            return super.bX();
        }
    }

    //previously m
    @Override
    public void A_() {
        if (!custom) {
            super.A_();
        } else {
            setHealth(getMaxHealth());
        }
    }
}
