package org.tiostitch.pokebag.utilities.others;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.*;

@Getter
@AllArgsConstructor
public enum ITypes {
    NORMAL, FIRE, ELETRIC, GRASS, FLYING, PYSICHC, GHOST, POISON, WATER;

    public static ImageIcon getPath(ITypes type) {
        return new ImageIcon("src/resources/types/" + type.name().toLowerCase() + ".png");
    }
}
