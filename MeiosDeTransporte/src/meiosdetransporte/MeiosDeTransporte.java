/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meiosdetransporte;
import meiosdetransporte.Veiculo;
import meiosdetransporte.Carro;
import meiosdetransporte.Moto;
import meiosdetransporte.Bicicleta;

/**
 *
 * @author Cliente
 */
public class MeiosDeTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("VW", "Fusca", 4, 96, 4);
        veiculos[1] = new Moto("Yamaha", "MT-03", 2, 300, true);
        veiculos[2] = new Bicicleta("Caloi", "Barra Forte", 2, 1, true);
        
        for(int i = 0; i < veiculos.length; i++){
            veiculos[i].imprimirInformacoes();
        }
        
    }
    
}
