/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Cliente
 */
public class Data {
    public final int dia;
    public final int mes;
    public final int ano;
    
    public Data (int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        
    }
    
    public String getData(){
        String data = new String(dia + "/" + mes + "/" + ano);
        return data;
    }
    
    public int calcularDiferenca(Data atual){
        int diferenca = atual.ano - this.ano;
        if(atual.mes < this.mes){
            diferenca--;
        } else if(atual.dia < this.dia && atual.mes == this.mes) {
            diferenca--;
        }
        return diferenca;
    }
}
