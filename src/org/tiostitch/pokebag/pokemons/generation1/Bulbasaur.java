package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.PokeCoord;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.util.ArrayList;

public final class Bulbasaur
implements IPokemon {
    @Override
    public String getName() {
        return "Bulbasaur";
    }

    @Override
    public PokeCoord getSpecieCoord() {
        return new PokeCoord("Seed", 10, 0);
    }

    @Override
    public String getPokeDexId() {
        return "001";
    }

    @Override
    public double getAltura() {
        return 70;
    }

    @Override
    public double getPeso() {
        return 6.9;
    }

    @Override
    public PokeType getType() {
        return PokeType.GRASS;
    }

    @Override
    public PokeType getSubType() {
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
    public ImageIcon getLocation() {
        return new ImageIcon("src/resources/pokemons/bulbasaur.png");
    }
}
