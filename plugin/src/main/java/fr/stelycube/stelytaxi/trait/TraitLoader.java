package fr.stelycube.stelytaxi.trait;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.trait.TraitInfo;

public class TraitLoader {

    public void load() {
        CitizensAPI.getTraitFactory().registerTrait(TraitInfo.create(TaxiTrait.class));
    }

    public void unload() {
        CitizensAPI.getTraitFactory().deregisterTrait(TraitInfo.create(TaxiTrait.class));
    }

}
