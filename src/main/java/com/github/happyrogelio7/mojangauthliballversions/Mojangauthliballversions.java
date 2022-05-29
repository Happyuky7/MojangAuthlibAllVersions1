package com.github.happyrogelio7.mojangauthliballversions;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mojangauthliballversions extends JavaPlugin {

    // Author Mote:
    // This does not work as a library API, it is just so you can see
    // how the libraries are imported and downloaded, so that you can use them.

    // Licence:
    // The use of this Repository is Free but its Sale or distribution is not allowed as you created it.
    
    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a MojangAuthLibAllVersions &7| &aEnabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Author: &fHappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a version: &f1.0.0-SNAPSHOT"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Github: &fhttps://github.com/HappyRogelio7/Mojangauthliballversions1"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));

        getCommand("mojangauthliballversions").setExecutor((CommandExecutor) new MojangAuthLibAllVersionsCMD(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a MojangAuthLibAllVersions &7| &cDisabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Author: &fHappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a version: &f1.0.0-SNAPSHOT"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Github: &fhttps://github.com/HappyRogelio7/Mojangauthliballversions1"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));

    }
}
