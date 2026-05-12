/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

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
    
    @Override
    public String toString(){
        return "\n######################################" + 
               "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nQuantidade de rodas: " + qtdRodas +
               "\nVelocidade: " + velocidade;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Verificação de referência (se é o mesmo objeto)
        if (this == obj) {
            return true;
        }

        // 2. Verificação de nulo e tipos diferentes
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Cast para o tipo correto
        Veiculo outro = (Veiculo) obj;

        // 4. Comparação dos atributos relevantes (ex: sku)
        //return modelo.equals(outro.modelo);
        if (qtdRodas == outro.qtdRodas)
            return true;
        return false;
    }
}
