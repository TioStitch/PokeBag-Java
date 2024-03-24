package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Charmander
implements IPokemon {
    @Override
    public String getName() {
        return "Charmander";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Lizard", 60, 8.5, -15, 0);
    }

    @Override
    public String getDexId() {
        return "004";
    }

    @Override
    public ITypes getType() {
        return ITypes.FIRE;
    }

    @Override
    public ITypes getSubType() {
        return null;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("A chama que queima na ponta da cauda é uma");
        description.add("indicação de suas emoções. A chama tremula");
        description.add("quando Charmander está se divertindo. Se o");
        description.add("Pokémon se enfurecer, a chama queima ferozmente.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/charmander.png");
    }
}
