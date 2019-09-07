package org.aleksandrail.tripleexp;

import org.aleksandrail.tripleexp.listeners.EXP;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		System.out.println("TripleEXP is enabled.");
		new EXP(this);
		this.saveDefaultConfig();
		}
	
	public void onDisable() {
		System.out.println("TripleEXP is disabled.");
	}

}
