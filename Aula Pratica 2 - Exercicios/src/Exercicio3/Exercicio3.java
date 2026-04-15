/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author Cliente
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);
        
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.aumentarCanal();
        
        controle.diminuirVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        
        controle.mostrarCanalEVolume();
        
        controle.trocarCanal(39);
        
        controle.mostrarCanalEVolume();
    }
    
}
