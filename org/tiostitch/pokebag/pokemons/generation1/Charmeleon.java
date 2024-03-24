package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Charmeleon
implements IPokemon {
    @Override
    public String getName() {
        return "Charmeleon";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Lizard",  1.1, 19, -25, 0);
    }

    @Override
    public String getDexId() {
        return "005";
    }

    @Override
    public ITypes getType() {
        return ITypes.FIRE;
    }

    @Override
    public ITypes getSubType() {
        return null;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Chameleon impiedosamente destrói seus inimigos usando suas garrafas");
        description.add("afiadas. Se encontrar um inimigo forte, ele se torna agressivo. Nesse estado");
        description.add("excitado a chama na ponta de sua cauda brilha com");
        description.add("uma cor branca azulada.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/charmeleon.png");
    }
}
