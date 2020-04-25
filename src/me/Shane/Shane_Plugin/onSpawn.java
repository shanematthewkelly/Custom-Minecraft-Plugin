package me.Shane.Shane_Plugin;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class onSpawn implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.sendMessage(ChatColor.BLUE + "Welcome to Shane Kelly's Custom Java Plugin - Check my commands out xD");

        player.setDisplayName("Penis O'Nuallian");
        player.setCustomName("Penis O'Nuallian");
        player.setGlowing(true);

    }
}
