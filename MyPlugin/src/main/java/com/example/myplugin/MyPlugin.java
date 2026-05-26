package com.example.myplugin;

import com.example.myplugin.commands.HealCommand;
import com.example.myplugin.commands.GodCommand;
import com.example.myplugin.listeners.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    private static MyPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        
        saveDefaultConfig();
        
        registerCommands();
        registerListeners();
        
        getLogger().info("MyPlugin 已成功启用!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin 已禁用!");
    }

    private void registerCommands() {
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("god").setExecutor(new GodCommand());
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    public static MyPlugin getInstance() {
        return instance;
    }
}
