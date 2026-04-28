/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Cliente
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int qtdRodas;
    private int velocidade;
    
    public Veiculo(String marca, String modelo, int qtdRodas){
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        velocidade = 0;
    }
    
    public void acelerar(int valor){
        velocidade += valor;
    }
    
    public void frear(int valor){
        velocidade -= valor;
    }
    
    public void imprimirInformacoes(){
        System.out.println("######################################");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Quantidade de rodas: " + qtdRodas);
        System.out.println("Velocidade: "+ velocidade);
        //System.out.println("######################################");
    }
}
