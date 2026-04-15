/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Cliente
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data hoje = new Data(14, 4, 2026);
        Data d1 = new Data(18, 10, 2006);
        Pessoa p1 = new Pessoa("Gustavo", 1.75, d1);
        
        p1.imprimir();
        System.out.println("Idade: " + p1.calcularIdade(hoje));
        
        Pessoa p2 = new Pessoa("Maria", 1.73, new Data(20, 5, 2001));
        p2.imprimir();
    }
    
}
