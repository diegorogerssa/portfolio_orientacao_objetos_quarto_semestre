/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

import com.mycompany.gerenciabanco.interfaces.IMenu;
import java.sql.Array;
import java.util.Scanner;

/**
 *
 * @author diego_rogers
 */
public class Menu implements IMenu {
    
    public String[] menu = {"1 - Consultar Saldo", "2 - Depositar", "3 - Sacar", "4 - Sair"};

    public void exibir() {
        System.out.println("-------  MENU ------- ");
        System.out.println("Escolha uma opcao:");
        for(String opcao : menu) {
            System.out.println(opcao);
        }
        System.out.println("--------------------- ");
    }  
}
