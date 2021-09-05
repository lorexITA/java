package me.lorex.joinleavechanger.joinleavechanger;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeaveChanger extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("JoinLeaveChanger plugin enabled");

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("JoinLeaveChanger plugin disabled");
    }
}
