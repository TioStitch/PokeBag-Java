package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Pidgeotto
implements IPokemon {
    @Override
    public String getName() {
        return "Pidgeotto";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Bird", 1.10, 30, -15, 0);
    }

    @Override
    public String getDexId() {
        return "017";
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
        description.add("Pidgeotto reivindica uma grande área como seu próprio território.");
        description.add("Este Pokémon voa, patrulhando seu espaço de vida. Se seu território");
        description.add("é violado, não mostra piedade de punir completamente@o inimigo com");
        description.add("suas garras afiadas.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/pidgeotto.png");
    }
}
