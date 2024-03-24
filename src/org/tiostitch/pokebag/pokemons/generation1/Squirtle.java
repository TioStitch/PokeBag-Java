package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.PokeCoord;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.util.ArrayList;

public final class Squirtle
implements IPokemon {
    @Override
    public String getName() {
        return "Squirtle";
    }

    @Override
    public PokeCoord getSpecieCoord() {
        return new PokeCoord("Tiny Turtle", -65, 0);
    }

    @Override
    public String getPokeDexId() {
        return "007";
    }

    @Override
    public double getAltura() {
        return 50;
    }

    @Override
    public double getPeso() {
        return 9;
    }

    @Override
    public PokeType getType() {
        return PokeType.WATER;
    }

    @Override
    public PokeType getSubType() {
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
    public ImageIcon getLocation() {
        return new ImageIcon("src/resources/pokemons/squirtle.png");
    }
}
