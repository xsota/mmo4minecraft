package com.xsota;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MMO extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("mmo4minecraft has been enabled.");
		
		//make default config file
		//this.saveDefaultConfig();
		//this.saveConfig();
		PluginManager pm = getServer().getPluginManager();
		//pm.registerEvents(new EntityDamageEventListener(), this);
		pm.registerEvents(new LoginBonus(), this);
	}

	@Override
	public void onDisable() {
		getLogger().info("mmo4minecraft has been disabled.");
	}

}
