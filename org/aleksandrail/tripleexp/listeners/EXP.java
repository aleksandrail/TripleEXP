package org.aleksandrail.tripleexp.listeners;

import org.aleksandrail.tripleexp.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class EXP implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public EXP(Main plugin){
	this.plugin = plugin;
	
	Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void tripleExperience(PlayerExpChangeEvent e){
		e.setAmount(e.getAmount() * 3);
	}
}
