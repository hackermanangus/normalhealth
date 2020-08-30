package software.angus.normalhealth;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.awt.*;
import java.util.Objects;

public final class Normalhealth extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new set(), this);
        // Plugin startup logicString.valueOf(health)+"❤/"+maxHealth+"❤"
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player: Bukkit.getServer().getOnlinePlayers()) {
                    long health = (Math.round(player.getHealth()));
                    long maxHealth = (Math.round(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()));
                    net.md_5.bungee.api.chat.TextComponent component = new net.md_5.bungee.api.chat.TextComponent(health+"/"+maxHealth+"❤");
                    component.setColor(net.md_5.bungee.api.ChatColor.RED);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR,component);
                }
            }
        }.runTaskTimer(this, 1L, 20L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
