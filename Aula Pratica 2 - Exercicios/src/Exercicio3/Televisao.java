/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author Cliente
 */
public class Televisao {
    private int volume, canal;
    
    public Televisao(){
        volume = 0;
        canal = 0;
    }
    
    public void aumentarVolume(){
        if(volume < 100){
            volume++;
        } else {
            System.out.println("Volume esta no maximo!");
        }
    }
    
    public void diminuirVolume(){
        if(volume > 0){
            volume--;
        } else {
            System.out.println("Volume esta no minimo!");
        }
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        if(canal > 1){
            canal--;
        }
    }
    
    public void setCanal(int canal){
        if(canal > 0){
            this.canal = canal;
        } else {
            System.out.println("Canal invalido!");
        }
        
    }
    
    public void mostrarCanalEVolume(){
        System.out.println("#####################");
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}
