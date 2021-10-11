package me.lorex;

import Commands.FlyCommand;
import Commands.GlowCommand;
import Commands.VanishCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class simpleadmin extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("simpleadimin abilitato");
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("glow").setExecutor(new GlowCommand());

    }

    @Override
    public void onDisable() {

        System.out.println("simpleadmin disabilitato");

    }
}
