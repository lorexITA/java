package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player p = (Player) sender;

            if(sender.hasPermission("AdminFly.use")){

                if(p.isFlying()){

                    p.setFlying(false);
                    p.sendMessage(ChatColor.GOLD + "ora non voli più!");

                }else{

                    p.setFlying(true);
                    p.sendMessage(ChatColor.GOLD + "ora puoi volare!");

                }


            }else{

                p.sendMessage(ChatColor.DARK_RED + "ehi! non hai il permesso per usare questo comando!");

            }

        }else{

            System.out.println("devi essere un giocatore per usare questo!");

        }

        return true;
    }
}
