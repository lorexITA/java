package me.lorex.joinleavechanger.joinleavechanger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();
        e.setQuitMessage(player.getDisplayName() + ChatColor.GRAY + "[" + ChatColor.DARK_RED + "-" + ChatColor.GRAY + "]");

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        e.setJoinMessage(player.getDisplayName() + ChatColor.GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.GRAY + "]");

    }
//per modificare il messaggio dopo il nome, cambiare il testo all'interno delle virgolette
}
