package fr.stelycube.stelytaxi;

import fr.stelycube.stelytaxi.trait.TraitLoader;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class StelyTaxiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        final TraitLoader traitLoader = new TraitLoader();
        traitLoader.load();
    }

}
