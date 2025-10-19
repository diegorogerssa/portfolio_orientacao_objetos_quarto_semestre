/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author diego_rogers
 */
public class Usuario {
    
    public String nome;
    public String sobrenome;
    public String cpf;
    public Conta conta;
    
    public Usuario(String nome, String sobrenome, String cpf, Conta conta){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }         
}
