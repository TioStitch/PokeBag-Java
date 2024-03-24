package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Blastoise
implements IPokemon {
    @Override
    public String getName() {
        return "Blastoise";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Shellfish", 1.60, 85.5, -65, 0);
    }

    @Override
    public String getDexId() {
        return "009";
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
        description.add("Blastoise tem bicos de água que se projetam de sua concha.");
        description.add("Os bicos de água são muito precisos. Eles podem disparar");
        description.add("balas de água com precisão suficiente para atingir");
        description.add("latas vazias a uma distância de mais de 60 metros.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/blastoise.png");
    }
}
