package co.uk.lostanddead.amethystevents.Events;

import co.uk.lostanddead.amethystevents.AmethystEvents;
import org.bukkit.ChatColor;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class TheGuardianExperience implements Listener {

    public AmethystEvents core;

    public TheGuardianExperience(AmethystEvents core) {
        this.core = core;
    }

    public String getName() {
        return ChatColor.GREEN + "The Guardian Experience";
    }

    public String getDescription() {
        return "The guardians are just misunderstood";
    }

    @EventHandler

    public void EntityDamageByEntityEvent(EntityDamageByEntityEvent event) {

        if (event.getDamager() instanceof Guardian && event.getEntity() instanceof Player) {
             Player p = (Player) event.getEntity();
             p.giveExp(3);
        }
    }
}


