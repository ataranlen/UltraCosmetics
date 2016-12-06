package be.isach.ultracosmetics.v1_11_R1.customentities;

import be.isach.ultracosmetics.v1_11_R1.morphs.MorphElderGuardian;
import net.minecraft.server.v1_11_R1.DataWatcherRegistry;
import net.minecraft.server.v1_11_R1.EntityGuardian;
import net.minecraft.server.v1_11_R1.SoundEffect;
import net.minecraft.server.v1_11_R1.World;
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
        getDataWatcher().set(DataWatcherRegistry.c.a(17), (float) (armorStand == null ? 0 : ((CraftArmorStand) armorStand).getHandle().getId()));
//        getDataWatcher().set(armorStand == null ? 0 : ((CraftArmorStand) armorStand).getHandle().getId(), 17);
    }

    @Override
    protected SoundEffect G() {
        if (custom) return null;
        else return super.G();
    }

    @Override
    protected SoundEffect bW() {
        if (custom) return null;
        else return super.bW();
    }

    @Override
    protected SoundEffect bX() {
        if (custom) return null;
        else return super.bX();
    }

    private boolean placeholder;
    public void m() {
        if (!custom) super.m(placeholder);
        else setHealth(getMaxHealth());
    }
}
