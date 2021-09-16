package me.lorex.afkplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class AfkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("PLUGIN AFK ABILITATO!");

    }

    @Override
    public void onDisable() {

        System.out.println("PLUGIN AFK DISABILITATO");

    }
}
