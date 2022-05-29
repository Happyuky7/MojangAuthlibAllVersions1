package com.github.happyrogelio7.mojangauthliballversions;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MojangAuthLibAllVersionsCMD implements CommandExecutor {

    private Mojangauthliballversions plugin;

    public MojangAuthLibAllVersionsCMD(Mojangauthliballversions plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a MojangAuthLibAllVersions &7| &3Information:"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Author: &fHappyRogelio7"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a version: &f1.0.0-SNAPSHOT"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a Github: &fhttps://github.com/HappyRogelio7/Mojangauthliballversions1"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&r "));

        return true;
    }
}
