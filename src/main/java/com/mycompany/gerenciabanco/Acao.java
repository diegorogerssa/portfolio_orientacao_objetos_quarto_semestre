/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import com.mycompany.gerenciabanco.interfaces.IAcao;

/**
 *
 * @author diego_rogers
 */
public class Acao implements IAcao {
    
     public void executar(int numeroOpcao, Usuario usuario) {
         switch (numeroOpcao) {
            case 1:
                 usuario.conta.consultarSaldo();
                break; 
            case 4: 
                PrintResponse.imprimir("Obrigado pela preferência, volte sempre!");
                break;
            default:
                PrintResponse.imprimir("Opção inválida!");
                break;
        }
    }
     
    public void executar(int numeroOpcao, Usuario usuario, double valor) {
        switch (numeroOpcao) {
            case 2:
                usuario.conta.depositar(valor);
                break;
            case 3:
                usuario.conta.sacar(valor);
                break;
            default:
                PrintResponse.imprimir("Opção inválida!");
                break;
        }
    }
}
