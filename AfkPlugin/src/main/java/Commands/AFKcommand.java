package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AFKcommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player p = (Player) sender;

            p.setInvulnerable(true);
            sender.sendMessage("ora sei afk");
            p.setDisplayName(ChatColor.DARK_RED + "AFK" + p.getDisplayName());

        }


        return true;
    }
}
