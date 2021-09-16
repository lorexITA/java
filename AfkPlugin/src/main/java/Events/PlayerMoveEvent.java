package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerMoveEvent implements Listener {

    @EventHandler
    public void onPlayerMovement(org.bukkit.event.player.PlayerMoveEvent e){

        Player p = e.getPlayer();
        p.setInvulnerable(false);
        p.setDisplayName(p.getDisplayName());
        p.sendMessage("non sei più afk");
    }

}
