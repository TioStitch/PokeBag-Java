package org.tiostitch.pokebag.pokemons.generation1;

import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.ISpecies;
import org.tiostitch.pokebag.utilities.others.ITypes;

import javax.swing.*;
import java.util.ArrayList;

public final class Ivysaur
implements IPokemon {
    @Override
    public String getName() {
        return "Ivysaur";
    }

    @Override
    public ISpecies getISpecie() {
        return new ISpecies("Seed", 1.0, 13, 10, 0);
    }

    @Override
    public String getDexId() {
        return "002";
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
        description.add("Há um bruto nas costas desse Pokémon. Para suportar seu peso,");
        description.add("as pernas e o tronco de Ivysaur ficam grossos e fortes. Se começar");
        description.add("a passar mais tempo deitado sob a luz do sol é um sinal de que o broto");
        description.add("florescerá em uma flor grande em breve.");
        return description;
    }

    @Override
    public ImageIcon getPath() {
        return new ImageIcon("src/resources/pokemons/ivysaur.png");
    }
}
