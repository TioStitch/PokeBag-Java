package org.tiostitch.pokebag;

import lombok.RequiredArgsConstructor;
import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.others.PokeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@RequiredArgsConstructor
public final class PokePanel
extends JPanel {

    private ImageIcon imageIcon = new ImageIcon("src/resources/SummaryScreen.png");
    private final IPokemon pokemonInfo;

    @Override
    public void paint(Graphics graphics) {
        Graphics2D g2D = (Graphics2D) graphics;

        //Limite de letras: 32 caractéres.
        //Representação da PokeBag.
        g2D.drawImage(imageIcon.getImage(), 0, 0, 600, 400, null);
        g2D.drawImage(pokemonInfo.getLocation().getImage(), 60, 100, 100, 100, null);

        g2D.drawImage(PokeType.getLocation(pokemonInfo.getType()).getImage(), 350, 130, 100, 40, null);
        if (pokemonInfo.getSubType() != null) {
            g2D.drawImage(PokeType.getLocation(pokemonInfo.getSubType()).getImage(), 450, 130, 100, 40, null);
        }

        g2D.setFont(new Font("Early_GameBoy", Font.BOLD, 26));

        g2D.setColor(new Color(200,200,160,255));
        write3D(g2D, pokemonInfo.getPokeDexId(), 303, 75);
        write3D(g2D, pokemonInfo.getName(), 352, 75);

        write3D(g2D, pokemonInfo.getSpecieCoord().getSpecie(), 335 + pokemonInfo.getSpecieCoord().getX(), 118);

        writeHeight(g2D, pokemonInfo.getAltura() + "'", 465, 205);
        writeHeight(g2D, pokemonInfo.getPeso() + "'", 485, 243);

        ArrayList<String> description = pokemonInfo.getDescription();
        if (description.isEmpty()) return;
        for (int linhas = 0; linhas <= description.size()-1; linhas++) {
            write(g2D, description.get(linhas), 125, 300 + (linhas * 25));
        }
    }

    private void write3D(Graphics2D g2D, String string, int x, int y) {
        g2D.setColor(new Color(200,200,160,255));
        g2D.drawString(string, x-2, y-2);

        g2D.setColor(new Color(96,96,96,255));
        g2D.drawString(string, x, y);
    }

    private void write(Graphics2D g2D, String string, int x, int y) {
        g2D.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        g2D.setColor(new Color(23, 23, 23,255));
        g2D.drawString(string, x, y);
    }

    private void writeHeight(Graphics2D g2D, String string, int x, int y) {
        g2D.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        g2D.setColor(new Color(23, 23, 23,255));
        g2D.drawString(string, x, y);
    }
}
