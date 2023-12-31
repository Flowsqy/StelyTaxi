package fr.stelycube.stelytaxi;

import fr.stelycube.stelytaxi.config.Config;
import fr.stelycube.stelytaxi.config.ConfigLoader;
import fr.stelycube.stelytaxi.economy.EconomyLoader;
import fr.stelycube.stelytaxi.trait.TraitLoader;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public class StelyTaxiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        final Logger logger = getLogger();
        final File dataFolder = getDataFolder();
        final ConfigLoader configLoader = new ConfigLoader();

        if (!configLoader.checkDataFolder(dataFolder)) {
            logger.log(Level.WARNING, "Can not write in the directory : " + dataFolder.getAbsolutePath());
            logger.log(Level.WARNING, "Disable the plugin");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        final EconomyLoader economyLoader = new EconomyLoader();
        final Optional<Economy> economy = economyLoader.setupEconomy();

        final Config config = new Config();
        config.load(configLoader, this, "config.yml");

        final TraitLoader traitLoader = new TraitLoader();
        traitLoader.load();
    }

    @Override
    public void onDisable() {
        final TraitLoader traitLoader = new TraitLoader();
        traitLoader.unload();
    }

}
