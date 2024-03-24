package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Charizard
implements IPokemon {
    @Override
    public String getName() {
        return "Charizard";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Dragon", 1.70, 90.5, -25, 0);
    }

    @Override
    public String getDexId() {
        return "006";
    }

    @Override
    public ITypes getType() {
        return ITypes.FIRE;
    }

    @Override
    public ITypes getSubType() {
        return ITypes.FLYING;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Charizard voa pelo céu em busca de oponentes");
        description.add("poderosos. Ele respira um calor tão grande que derrete");
        description.add("qualquer coisa. No entanto nunca dá um sopro ardente a");
        description.add("qualquer oponente mais fraco que ele.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/charizard.png");
    }
}
