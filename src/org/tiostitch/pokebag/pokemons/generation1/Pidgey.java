package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.PokeCoord;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.util.ArrayList;

public final class Pidgey
implements IPokemon {
    @Override
    public String getName() {
        return "Pidgey";
    }

    @Override
    public PokeCoord getSpecieCoord() {
        return new PokeCoord("Tiny Bird", -45, 0);
    }

    @Override
    public String getPokeDexId() {
        return "016";
    }

    @Override
    public double getAltura() {
        return 30;
    }

    @Override
    public double getPeso() {
        return 1.9;
    }

    @Override
    public PokeType getType() {
        return PokeType.NORMAL;
    }

    @Override
    public PokeType getSubType() {
        return PokeType.FLYING;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Pidgey tem um senso de direção extremamente");
        description.add("nitído. Ela é capaz de voltar para o seu ninho de");
        description.add("forma infalíível, por mais longe que possa ser");
        description.add("removida de seu ambiente familiar.");
        return description;
    }

    @Override
    public ImageIcon getLocation() {
        return new ImageIcon("src/resources/pokemons/pidgey.png");
    }
}
