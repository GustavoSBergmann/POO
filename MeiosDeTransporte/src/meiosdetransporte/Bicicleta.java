/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Cliente
 */
public class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(String marca, String modelo, int qtdRodas, int numMarchas, boolean bagageiro) {
        super(marca, modelo, qtdRodas);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Numero de marchas: " + numMarchas);
        System.out.println("Tem bagageiro? " + (bagageiro ? "Sim" : "Nao"));
    }
}
