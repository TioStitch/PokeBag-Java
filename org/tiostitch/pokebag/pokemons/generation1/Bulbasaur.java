package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Bulbasaur
implements IPokemon {
    @Override
    public String getName() {
        return "Bulbasaur";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Seed",  70, 7.9, 10, 0);
    }

    @Override
    public String getDexId() {
        return "001";
    }

    @Override
    public ITypes getType() {
        return ITypes.GRASS;
    }

    @Override
    public ITypes getSubType() {
        return null;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Bulbasaur pode ser visto cochilando sob luz solar");
        description.add("intensa. Há uma semente em suas costas. Ao");
        description.add("absorver os raios do sol, sua semente cresce");
        description.add("progressivamente.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/bulbasaur.png");
    }
}
