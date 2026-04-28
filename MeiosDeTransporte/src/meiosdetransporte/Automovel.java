/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Cliente
 */
public class Automovel extends Veiculo{
    private double potenciaDoMotor;

    public Automovel(String marca, String modelo, int qtdRodas, double potenciaDoMotor) {
        super(marca, modelo, qtdRodas);
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Potencia do motor: " + potenciaDoMotor);
    }
    
}
