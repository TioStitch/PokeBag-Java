package org.tiostitch.pokebag.pokemons;

import org.tiostitch.pokebag.utilities.PokeCoord;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.util.ArrayList;

public interface IPokemon {
    String getName();
    PokeCoord getSpecieCoord();
    String getPokeDexId();

    double getAltura();
    double getPeso();

    PokeType getType();
    PokeType getSubType();

    default ArrayList<String> getDescription() {
        return new ArrayList<>();
    }

    ImageIcon getLocation();
}
