/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.trabajo1.template;

public class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("juego de futbol finalizado!");
   }

   @Override
   void initialize() {
      System.out.println("esta iniciando el juego de futbol entra para jugar.");
   }

   @Override
   void startPlay() {
      System.out.println("El juego esta empezando!");
   }
}
