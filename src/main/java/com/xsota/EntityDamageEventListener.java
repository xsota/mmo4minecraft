package com.xsota;


import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.EntityDamageEvent;


public class EntityDamageEventListener implements Listener{	
		
	@EventHandler
	public void onEntityDamage(EntityDamageEvent damageEvent) {
		LivingEntity livingEntity = (LivingEntity)damageEvent.getEntity();
		double hp = livingEntity.getHealth();
		livingEntity.setCustomName("HP:"+String.valueOf((int)hp));
		livingEntity.setCustomNameVisible(true);
	}
	
	 
}
