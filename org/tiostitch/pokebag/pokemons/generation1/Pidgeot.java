package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Pidgeot
implements IPokemon {
    @Override
    public String getName() {
        return "Pidgeot";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Bird", 1.50, 39.5, -15, 0);
    }

    @Override
    public String getDexId() {
        return "018";
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
        description.add("Este Pokémon tem uma plumagem deslumbrante de penas");
        description.add("maravilhosamente brilhantes. Muitos treinadores são cativados");
        description.add("pela impressionante beleza das penas em sua cabeça,");
        description.add("obrigando-os a escolher Pidgeot como seu Pokémon.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/pidgeot.png");
    }
}
