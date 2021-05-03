package co.uk.lostanddead.amethystevents.Events;

import co.uk.lostanddead.amethystevents.AmethystEvents;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;

public class TheGuardianExperience implements Listener {

    public AmethystEvents core;

    public TheGuardianExperience(AmethystEvents core) {
        this.core = core;
    }

    public String getName(){
        return ChatColor.GREEN + "The Guardian Experience";
    }

    public String getDescription() {
        return "The guardians are just misunderstood";
    }


}
