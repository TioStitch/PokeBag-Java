package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Squirtle
implements IPokemon {
    @Override
    public String getName() {
        return "Squirtle";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Tiny Turtle", 50, 9, -65, 0);
    }

    @Override
    public String getDexId() {
        return "007";
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
        description.add("A concha de Squirtle não é apenas usada para");
        description.add("proteção. A forma arredondada da concha e as ranhuras na ");
        description.add("superfície ajudam a minimizar aresistência na água, permitindo");
        description.add("que este Pokémon nade em alta velocidade.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/squirtle.png");
    }
}
