package org.tiostitch.pokebag;

import lombok.val;
import org.tiostitch.pokebag.pokemons.IPokemon;
import org.tiostitch.pokebag.utilities.PokeReflections;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public final class PokeMain
extends JFrame {

    private PokeMain(IPokemon pokemon) {
        setTitle("PokeBag Java - v0.2");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new PokePanel(pokemon));

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        val gE = GraphicsEnvironment.getLocalGraphicsEnvironment();
        val font = new File("src/resources/fonts/Early_GameBoy.ttf");
        try {
            val customFont = Font.createFont(Font.TRUETYPE_FONT, font);
            gE.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("[PokeBag] Olá, seja bem-vindo ao PokeBag!");
        System.out.println("[PokeBag] Por favor, digite o nome do Pokémon no qual deseja ver as informaçõ§es:");

        val sc = new Scanner(System.in);
        new PokeReflections().init();

        try {
            Object instance = new PokeReflections().getPokemonByClass(sc.nextLine()).getClass().newInstance();
            new PokeMain((IPokemon) instance);
        } catch (NullPointerException | InstantiationException | IllegalAccessException e) {
            System.out.println("[PokeBag] Pokémon inexistente, tente novamente!");
        }
    }
}