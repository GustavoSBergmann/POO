/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Cliente
 */
public class Moto extends Automovel{
    private boolean partidaEletrica;
    
    public Moto(String marca, String modelo, int qtdRodas, double potenciaDoMotor, boolean partidaEletrica) {
        super(marca, modelo, qtdRodas, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Tem partida eletrica? " + (partidaEletrica ? "Sim" : "Nao"));
    }
    
    @Override
    public String toString(){
        return super.toString() +
               "\nTem partida eletrica? " + (partidaEletrica ? "Sim" : "Nao");
    }
    
}
