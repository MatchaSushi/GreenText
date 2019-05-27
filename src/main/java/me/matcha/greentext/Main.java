package me.matcha.greentext;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("GreenText v1.0.0 by Matcha is now enabled!");
        Bukkit.getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }


    @Override
    public void onDisable() {
        getLogger().info("GreenText v1.0.0 by Matcha is now disabled! :( Sadface");
    }
}
