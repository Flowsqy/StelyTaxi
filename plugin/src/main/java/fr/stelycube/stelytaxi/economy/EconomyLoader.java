package fr.stelycube.stelytaxi.economy;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class EconomyLoader {

    @NotNull
    public Optional<Economy> setupEconomy() {
        final RegisteredServiceProvider<Economy> rsp = Bukkit.getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return Optional.empty();
        }
        return Optional.of(rsp.getProvider());
    }

}
