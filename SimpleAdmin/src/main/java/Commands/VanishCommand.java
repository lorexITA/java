package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            if(sender.hasPermission("vanish.use")){

                Player p = (Player) sender;
                if(p.isInvisible()){

                    System.out.println(ChatColor.AQUA + "sei invisibile");
                    p.setInvisible(false);

                }else{

                    System.out.println(ChatColor.DARK_AQUA + "ora non sei più invisibile");
                    p.setInvisible(true);

                }

            }

        }

        return false;
    }
}
