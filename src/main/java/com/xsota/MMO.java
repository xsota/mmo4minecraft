package com.xsota;

import org.bukkit.plugin.java.JavaPlugin;

public class MMO extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("plugin has been enable.");
		
		//make default config file
		//this.saveDefaultConfig();
		//this.saveConfig();
				
	}

	@Override
	public void onDisable() {
		getLogger().info("plugin has been disable.");
	}

}
