package com.xsota;

import org.bukkit.plugin.java.JavaPlugin;

public class MMO extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("mmo4minecraft has been enabled.test");
		
		//make default config file
		//this.saveDefaultConfig();
		//this.saveConfig();
				
	}

	@Override
	public void onDisable() {
		getLogger().info("mmo4minecraft has been disabled.");
	}

}
