package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Pidgey
implements IPokemon {
    @Override
    public String getName() {
        return "Pidgey";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Tiny Bird", 30, 1.9, -45, 0);
    }

    @Override
    public String getDexId() {
        return "016";
    }

    @Override
    public ITypes getType() {
        return ITypes.NORMAL;
    }

    @Override
    public ITypes getSubType() {
        return ITypes.FLYING;
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
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/pidgey.png");
    }
}
