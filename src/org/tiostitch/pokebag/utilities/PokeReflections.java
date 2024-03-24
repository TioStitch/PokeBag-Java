package org.tiostitch.pokebag.utilities;

public final class PokeReflections {

    public static Object getReflectionClass(String className) {
        try {
            Class<?> classe = Class.forName("org.tiostitch.pokebag.pokemons.generation1." + className);
            return classe.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            return null;
        }
    }
}
