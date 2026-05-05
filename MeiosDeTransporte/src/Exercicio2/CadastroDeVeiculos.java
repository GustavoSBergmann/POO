/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;
import Exercicio1.Veiculo;

/**
 *
 * @author Cliente
 */
public class CadastroDeVeiculos {
    private Veiculo[] veiculos;
    private int numeroDeVeiculos;
    
    public CadastroDeVeiculos(int tamanho){
        veiculos = new Veiculo[tamanho];
        numeroDeVeiculos = 0;
    }
    
    public CadastroDeVeiculos(){
        this(10);
    }
    
    public void inserir(Veiculo v){
        if(numeroDeVeiculos == veiculos.length){
            //Cria uma nova array com o dobro do tamanho
            Veiculo[] novoArray = new Veiculo[veiculos.length * 2];
            
            //Copia os elementos de novoArray para veiculos, um a um
            for(int i = 0; i < veiculos.length; i++){
                novoArray[i] = veiculos[i];
            }
            //Faz com que veiculos agora tenha o mesmo tamanho que novo array
            veiculos = novoArray;
            
        }
        //Insere o novo veículo e incrementa o numeroDeVeiculos
        veiculos[numeroDeVeiculos++] = v;
    }
    
    public Veiculo remover(int posicao){
        Veiculo v = null;
        if(posicao >= 0 && posicao < numeroDeVeiculos){
            v = veiculos[posicao];
            for(int i = posicao; i < numeroDeVeiculos-1; i++){
                veiculos[i] = veiculos[i+1];
            }
            numeroDeVeiculos--;
        }
        return v;
    }
    
    public Veiculo retornaItem(int posicao){
        if(posicao >= 0 && posicao < numeroDeVeiculos){
            return veiculos[posicao];
        }
        return null;
    }
    
    public int tamanho(){
        return numeroDeVeiculos;
    }
    
    public void imprimir(){
        System.out.println("############ Cadastro de Veiculos: ############");
        for(int i = 0; i < numeroDeVeiculos; i++){
            System.out.println(veiculos[i]);
        }
    }
}
