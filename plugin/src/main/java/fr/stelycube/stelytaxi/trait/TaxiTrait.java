package fr.stelycube.stelytaxi.trait;

import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

@TraitName(TaxiTrait.TRAIT_NAME)
public class TaxiTrait extends Trait {

    public static final String TRAIT_NAME = "stelytaxi";

    public TaxiTrait() {
        super(TRAIT_NAME);
    }

    @SuppressWarnings("unused")
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    private void click(NPCRightClickEvent event) {
        if (event.getNPC() != this.npc) {
            return;
        }
        // TODO Open the inventory
    }

}
