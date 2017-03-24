package com.irql.disablejoinleave;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
public class Main
  extends JavaPlugin
  implements Listener {
  public void onEnable(){
    getServer().getPluginManager().registerEvents(this, this);
    System.out.println("disablejoinleave v1.0 by irql");
  }
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    event.setJoinMessage("");
  }
  @EventHandler
  public void onQuit(PlayerQuitEvent event) {
    event.setQuitMessage("");
  }
}
