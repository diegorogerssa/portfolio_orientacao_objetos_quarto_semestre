/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author diego_rogers
 */
public class PrintResponse {
        public static void imprimir(String frase){
            System.out.println("");
            System.out.printf(frase);
            System.out.println("");
        }
    
        public static void imprimir(String frase, double valor){
            System.out.println("");
            System.out.printf(frase, valor);
            System.out.println("");
    }
}
