package me.lorex.afkplugin;

import Events.PlayerMoveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AfkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("PLUGIN AFK ABILITATO!");

        getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);

    }

    @Override
    public void onDisable() {

        System.out.println("PLUGIN AFK DISABILITATO");

    }
}
