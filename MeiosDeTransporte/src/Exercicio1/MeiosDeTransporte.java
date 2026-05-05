/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;
import Exercicio1.Veiculo;
import Exercicio1.Carro;
import Exercicio1.Moto;
import Exercicio1.Bicicleta;
import Exercicio2.CadastroDeVeiculos;

/**
 *
 * @author Cliente
 */
public class MeiosDeTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        **Aula do dia 28/04
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("VW", "Fusca", 4, 96, 4);
        veiculos[1] = new Moto("Yamaha", "MT-03", 2, 300, true);
        veiculos[2] = new Bicicleta("Caloi", "Barra Forte", 2, 1, true);
        
        **Aula do dia 04/05
        for(int i = 0; i < veiculos.length; i++){
            //veiculos[i].imprimirInformacoes();
            System.out.println(veiculos[i]);
        }
        */
        
        CadastroDeVeiculos lista = new CadastroDeVeiculos(2);
        lista.inserir(new Carro("VW", "Fusca", 4, 96, 4));
        lista.inserir(new Bicicleta("Caloi", "Barra Forte", 2, 1, true));
        //lista.inserir(new Moto("Yamaha", "MT-03", 2, 300, true));
        
        lista.imprimir();
        
    }
    
}
