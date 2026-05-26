package com.example.myplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, 
                            @NotNull String label, @NotNull String[] args) {
        
        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("只有玩家可以使用此命令!");
                return true;
            }
            
            Player player = (Player) sender;
            healPlayer(player);
            player.sendMessage("§a你已经恢复了生命值!");
            
        } else if (args.length == 1) {
            if (!sender.hasPermission("myplugin.heal.others")) {
                sender.sendMessage("§c你没有权限为他人治疗!");
                return true;
            }
            
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage("§c玩家 " + args[0] + " 不在线!");
                return true;
            }
            
            healPlayer(target);
            target.sendMessage("§a你已经被 " + sender.getName() + " 治疗了!");
            sender.sendMessage("§a你已经治疗了 " + target.getName() + "!");
            
        } else {
            sender.sendMessage("§c使用方法: /heal [玩家]");
        }
        
        return true;
    }

    private void healPlayer(Player player) {
        player.setHealth(player.getMaxHealth());
        player.setFoodLevel(20);
        player.setSaturation(20f);
        player.setFireTicks(0);
    }
}
