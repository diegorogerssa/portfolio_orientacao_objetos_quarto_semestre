/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author diego_rogers
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Acao acao = new Acao();
        Scanner leitorOpcao = new Scanner(System.in);
        Scanner leitorValor = new Scanner(System.in);
        
        Conta conta = new Conta(100);
        Usuario usuario_01 = new Usuario("Miriam", "da Silva Vidoto Santana", "38411282899", conta);
        
      
        
//        int escolha = leitor.nextInt();
        
        int opcao = 0;
        
        do{
             menu.exibir();
            opcao =  leitorOpcao.nextInt();
            if(opcao == 2 || opcao == 3) {
                    System.out.println("Digite o valor: ");
                    double valor = leitorValor.nextDouble();
                     acao.executar(opcao, usuario_01, valor);
            } else{
                 acao.executar(opcao, usuario_01);
            }
        }while(opcao != 4);
        leitorOpcao.close();
        leitorValor.close();
    }
}
