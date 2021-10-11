package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player p = (Player) sender;

            if(p.hasPermission("glow.use")){

                if(((Player) sender).isGlowing()){

                    p.sendMessage(ChatColor.MAGIC + "ora sei luminoso!");
                    p.setGlowing(true);

                }else{

                    p.sendMessage(ChatColor.MAGIC + "ora non sei più luminoso");
                    p.setGlowing(false);

                }



            }

        }

        return false;
    }
}
