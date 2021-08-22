package riyaya1528.paper.enderchestview;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(command.getName().equals("enderchest")) {
                if(args.length != 0) {
                    if(Bukkit.getServer().getPlayer(args[0]) != null) {
                        Player FromPlayer = (Player)sender;
                        Player ToPLayer = Bukkit.getPlayer(args[0]);

                        View.ViewEnderChest(FromPlayer,ToPLayer);
                    } else{
                        sender.sendMessage("§c§l正しいmcidを入力してください");
                    }
                }else {
                    sender.sendMessage("§c§lmcidを入力してください");
                }
            }
        }

        return true;
    }
}
