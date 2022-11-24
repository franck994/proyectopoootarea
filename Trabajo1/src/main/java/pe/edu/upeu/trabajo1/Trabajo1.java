/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.trabajo1;

import pe.edu.upeu.trabajo1.template.Cricket;
import pe.edu.upeu.trabajo1.template.Football;
import pe.edu.upeu.trabajo1.template.Game;

/**
 *
 * @author JICAR
 */
public class Trabajo1 {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
