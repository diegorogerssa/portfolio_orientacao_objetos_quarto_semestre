/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import com.mycompany.gerenciabanco.interfaces.IConta;

/**
 *
 * @author diego_rogers
 */
public class Conta implements IConta{
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void consultarSaldo() {
        PrintResponse.imprimir("Saldo da conta: R$ %.2f\n", this.saldo);
    } 
    
    public void depositar(double valor) {
        if(valor < 1) {
            PrintResponse.imprimir("O valor para deposito deve ser maior que zero");
        } else {
             this.saldo += valor;
              PrintResponse.imprimir("valor depositado: R$ %.2f\n", valor);
        }
    }
    
    public void sacar(double valor) {
        if(this.saldo < valor){
            PrintResponse.imprimir("Saldo insuficiente");
        } else {
            this.saldo -= valor;
             PrintResponse.imprimir("Saque de R$ %.2f\n  efetuado com sucesso", valor);
        }
    }
}
