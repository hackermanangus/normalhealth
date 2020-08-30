package software.angus.normalhealth;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class set implements Listener {
    @EventHandler
    public void OnPlayerJoinEvent(PlayerJoinEvent e) {
        e.getPlayer().setHealthScaled(true);
    }

}
