package me.Shane.Shane_Plugin;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

//Shane's Minecraft Plugin

public class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        //server startup...
        getServer().getPluginManager().registerEvents(new onSpawn(), this);
    }

    @Override
    public void onDisable() {
        //server shutdown...
    }

    //Commands
    public boolean onCommand (CommandSender sender, Command command, String word, String[] args) {
        if (word.equalsIgnoreCase("info")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("info.use")) {
                    player.sendMessage(ChatColor.GREEN + "Plugin built by Shane Kelly on Clovux server");
                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }

        //------------------------------------------------------------------------------------------//

        if (word.equalsIgnoreCase("weather-change")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("weather-change.use")) {
                    player.sendMessage(ChatColor.GREEN + "Rupert Westrup fucking hates the rain, turn it off");
                    player.setPlayerWeather(WeatherType.DOWNFALL);
                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }

        //---------------------------------------------------------------------------------------//

        if (word.equalsIgnoreCase("level-change")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("weather-change.use")) {
                    player.sendMessage(ChatColor.GREEN + "You are now level 50");
                    player.setLevel(50);
                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }

        //----------------------------------------------------------------------------------//

        if (word.equalsIgnoreCase("level-change")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("weather-change.use")) {
                    player.sendMessage(ChatColor.GREEN + "You are now level 50");
                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }

        //---------------------------------------------------------------------------------//

        if (word.equalsIgnoreCase("firework-blue")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("firework-blue.use")) {

                    //Fireworks
                    Firework firework = player.getWorld().spawn(player.getLocation(), Firework.class);
                    FireworkMeta properties = firework.getFireworkMeta();

                    FireworkEffect.Builder builder = FireworkEffect.builder();

                    properties.addEffect(builder.flicker(true).withColor(Color.BLUE).build());
                    properties.addEffect(builder.trail(true).build());
                    properties.addEffect(builder.withFade(Color.ORANGE).build());
                    properties.addEffect(builder.with(FireworkEffect.Type.CREEPER).build());
                    properties.setPower(2);

                    firework.setFireworkMeta(properties);

                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }

        //----------------------------------------------------------------------------------------//

        if (word.equalsIgnoreCase("firework-red")) {
            if (sender instanceof Player) {


                Player player = (Player) sender;

                if (player.hasPermission("firework-red.use")) {

                    //Fireworks
                    Firework firework = player.getWorld().spawn(player.getLocation(), Firework.class);
                    FireworkMeta properties = firework.getFireworkMeta();

                    FireworkEffect.Builder builder = FireworkEffect.builder();

                    properties.addEffect(builder.flicker(true).withColor(Color.RED).build());
                    properties.addEffect(builder.trail(true).build());
                    properties.addEffect(builder.withFade(Color.YELLOW).build());
                    properties.addEffect(builder.with(FireworkEffect.Type.BALL_LARGE).build());
                    properties.setPower(2);

                    firework.setFireworkMeta(properties);

                    return true;

                }
                player.sendMessage(ChatColor.RED + "Permission denied on this server");
                return true;

            } else {
                //console stuff
                sender.sendMessage("Hello console, this is Shane & Ultan's server");
                return true;
            }
        }



        return false;
    }


}
