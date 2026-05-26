package com.example.myplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class GodCommand implements CommandExecutor {

    private static final Map<Player, Boolean> godMode = new HashMap<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                            @NotNull String label, @NotNull String[] args) {
        
        if (!(sender instanceof Player)) {
            sender.sendMessage("只有玩家可以使用此命令!");
            return true;
        }
        
        Player player = (Player) sender;
        boolean isGod = !getGodMode(player);
        godMode.put(player, isGod);
        
        if (isGod) {
            player.sendMessage("§a上帝模式已启用!");
            player.sendMessage("§a你现在无法受到伤害.");
        } else {
            player.sendMessage("§c上帝模式已禁用!");
            player.sendMessage("§c你现在可以受到伤害了.");
        }
        
        return true;
    }

    public static boolean getGodMode(Player player) {
        return godMode.getOrDefault(player, false);
    }

    public static void removePlayer(Player player) {
        godMode.remove(player);
    }
}
