package com.tue135897;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[antigriefbasic] đã được bật");
		getServer().getPluginManager().registerEvents(new EventClass(), this);
		loadConfig();
	}
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[antigriefbasic] đã được tắt");
	}
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

}
