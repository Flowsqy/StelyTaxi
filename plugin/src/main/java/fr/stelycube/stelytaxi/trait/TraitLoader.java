package fr.stelycube.stelytaxi.trait;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.trait.TraitInfo;

public class TraitLoader {

    public void load() {
        CitizensAPI.getTraitFactory().registerTrait(TraitInfo.create(TaxiTrait.class));
    }

}
