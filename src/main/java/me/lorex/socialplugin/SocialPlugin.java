package me.lorex.socialplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equalsIgnoreCase("discord")){

            Player p = (Player) sender;
            String Discord = getConfig().getString("Discord");
            p.sendMessage(ChatColor.DARK_PURPLE + "DISCORD" + ChatColor.DARK_PURPLE + Discord);

        }

        if(command.getName().equalsIgnoreCase("instagram")){

            Player p = (Player) sender;
            String Instagram = getConfig().getString("Instagram");
            p.sendMessage(ChatColor.BLUE + "INSTAGRAM:" + "" + ChatColor.BLUE + Instagram);

        }

        if(command.getName().equalsIgnoreCase("twitter")){

            Player p = (Player) sender;
            String Twitter = getConfig().getString("Twitter");
            p.sendMessage(ChatColor.DARK_BLUE + "TWITTER:" + "" + ChatColor.DARK_BLUE + Twitter);

        }

        if(command.getName().equalsIgnoreCase("Telegram")){

            Player p = (Player) sender;
            String Telegram = getConfig().getString("Telegram");
            p.sendMessage(ChatColor.AQUA + "TELEGRAM:" + "" + ChatColor.AQUA);

        }
           return false;
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
