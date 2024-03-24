package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.PokeCoord;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.util.ArrayList;

public final class Charmander
implements IPokemon {
    @Override
    public String getName() {
        return "Charmander";
    }

    @Override
    public PokeCoord getSpecieCoord() {
        return new PokeCoord("Lizard", -15, 0);
    }

    @Override
    public String getPokeDexId() {
        return "004";
    }

    @Override
    public double getAltura() {
        return 60;
    }

    @Override
    public double getPeso() {
        return 8.5;
    }

    @Override
    public PokeType getType() {
        return PokeType.FIRE;
    }

    @Override
    public PokeType getSubType() {
        return null;
    }

    @Override
    public ArrayList<String> getDescription() {
        final ArrayList<String> description = new ArrayList<>();
        description.add("A chama que queima na ponta da cauda é uma");
        description.add("indicação de suas emoções. A chama tremula");
        description.add("quando Charmander está se divertindo. Se o");
        description.add("Pokémon se enfurecer, a chama queima ferozmente.");
        return description;
    }

    @Override
    public ImageIcon getLocation() {
        return new ImageIcon("src/resources/pokemons/charmander.png");
    }
}
