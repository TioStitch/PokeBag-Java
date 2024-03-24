package org.tiostitch.pokebag.utilities;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;
import lombok.val;
import org.tiostitch.pokebag.pokemons.IPokemon;

import javax.jws.Oneway;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public final class PokeReflections {

    private static final HashMap<Integer, IPokemon> registered = new HashMap<>();

    public void init() {
        val file = new File("src/org/tiostitch/pokebag/pokemons/generation1");

        for (String clStr : file.list()) {
            val className = clStr.replace(".java", "");
            val pokeClass = (IPokemon) getPokemonByClass(className);

            int pokeId = Integer.parseInt(pokeClass.getDexId());
            registered.put(pokeId, pokeClass);
        }

        for (int i : registered.keySet().stream().sorted().collect(Collectors.toList())) {
            System.out.println(i + "# " + registered.get(i).getName());
        }
    }

    public Object getPokemonByClass(String className) {
        try {
            Class<?> classe = Class.forName("org.tiostitch.pokebag.pokemons.generation1." + className);
            return classe.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            return null;
        }
    }
}
