/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Cliente
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elevador e1 = new Elevador(4, 5);
        
        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        e1.sai();
        
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.desce();
    }
    
}
