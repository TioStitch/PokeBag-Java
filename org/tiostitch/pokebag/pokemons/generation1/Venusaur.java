package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Venusaur
implements IPokemon {
    @Override
    public String getName() {
        return "Venusaur";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Seed", 2.0, 100, 10, 0);
    }

    @Override
    public String getDexId() {
        return "003";
    }

    @Override
    public ITypes getType() {
        return ITypes.GRASS;
    }

    @Override
    public ITypes getSubType() {
        return ITypes.POISON;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("Há uma flor grande nas costas de Venusaur: Diz-se");
        description.add("que a flor adquire cores vivas se receber muita");
        description.add("nutrição e luz solar: O aroma de flor acalma as");
        description.add("emoções das pessoas.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/venusaur.png");
    }
}
