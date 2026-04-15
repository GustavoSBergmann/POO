/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Cliente
 */
public class Pessoa {
    private String nome;
    private double altura;
    private Data dataDeNascimento;
    
    public Pessoa(String nome, double altura, Data dataDeNascimento){
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public Data getDataDeNascimento(){
        return dataDeNascimento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void imprimir(){
        System.out.println("####################################");
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de Nascimento: " + dataDeNascimento.getData());
    }
    
    public int calcularIdade(Data atual){
        return dataDeNascimento.calcularDiferenca(atual);
    }
}
