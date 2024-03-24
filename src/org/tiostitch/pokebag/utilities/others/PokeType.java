package org.tiostitch.pokebag.utilities.others;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.*;

@Getter
@AllArgsConstructor
public enum PokeType {
    NORMAL("Normal"),
    FIRE("Fogo"),
    ELETRIC("Elétrico"),
    GRASS("Planta"),
    FLYING("Voador"),
    PYSICHC("Psíquico"),
    GHOST("Fantasma"),
    WATER("Água");

    private final String translated;

    public static ImageIcon getLocation(PokeType type) {
        return new ImageIcon("src/resources/types/" + type.name().toLowerCase() + ".png");
    }
}
