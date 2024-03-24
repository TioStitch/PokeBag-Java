package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Wartortle
implements IPokemon {
    @Override
    public String getName() {
        return "Wartortle";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Turtle", 1, 22.5, -65, 0);
    }

    @Override
    public String getDexId() {
        return "008";
    }

    @Override
    public ITypes getType() {
        return ITypes.WATER;
    }

    @Override
    public ITypes getSubType() {
        return null;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Sua cauda é grande e coberta com um pêlo rico e grosso.");
        description.add("A cauda torna-se cada vez mais profunda na cor à medida");
        description.add("que Wartortle envelhece. Os arranhões em sua concha são");
        description.add("uma evidência da dureza deste Pokémon como um lutador.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/wartortle.png");
    }
}
