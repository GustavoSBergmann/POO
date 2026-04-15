/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Cliente
 */
public class Elevador {
    private int andarAtual, totalAndares, capacidadeElevador, qtdPessoasElevador;
    
    public Elevador(int capacidadeElevador, int totalAndares){
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdPessoasElevador = 0;
    }
    
    public void entra(){
        if(qtdPessoasElevador < capacidadeElevador){
            qtdPessoasElevador++;
            System.out.println("Pessoas no elevador: " + qtdPessoasElevador);
        } else {
            System.out.println("Elevador lotado!");
        }
    }
    
    public void sai(){
        if(qtdPessoasElevador > 0){
            qtdPessoasElevador--;
            System.out.println("Pessoas no elevador: " + qtdPessoasElevador);
        } else {
            System.out.println("Elevador vazio!");
        }
    }
    
    public void sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Andar atual: " + andarAtual);
        } else {
            System.out.println("Elevador no ultimo andar!");
        }
    }
    
    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Andar atual: " + andarAtual);
        } else{
            System.out.println("Elevador no terreo!");
        }
    }
}
