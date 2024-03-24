package org.tiostitch.pokebag.pokemons;

import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public interface IPokemon {
    String getName();
    ISpecies getISpecie();
    String getDexId();

    ITypes getType();
    ITypes getSubType();

    default ArrayList<String> getDescription() {
        return new ArrayList<>();
    }

    ImageIcon getPath();
}
