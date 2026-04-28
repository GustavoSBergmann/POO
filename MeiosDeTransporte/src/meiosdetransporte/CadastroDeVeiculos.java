/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Cliente
 */
public class CadastroDeVeiculos {
    private Veiculo[] veiculos;
    private int posicao;
    
    public CadastroDeVeiculos(int tamanhoInicial){
        if(tamanhoInicial > 0){
            this.veiculos = new Veiculo[tamanhoInicial];
            posicao = 0;
        } else{
            System.out.println("Tamanho invalido");
        }
    }
    
    public void inserir(Veiculo v){
        
    }
}
