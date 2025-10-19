/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gerenciabanco.interfaces;

import com.mycompany.gerenciabanco.Usuario;

/**
 *
 * @author diego_rogers
 */
public interface IAcao {
    public void executar(int numeroOpcao, Usuario usuario);
    public void executar(int numeroOpcao, Usuario usuario, double valor);
}
