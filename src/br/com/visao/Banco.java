/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

import br.com.controle.ContaBanco;
import java.util.Scanner;


/**
 *
 * @author arTTh
 */
public class Banco {
    public static void main (String args[]){
        
   
        ContaBanco p1 = new ContaBanco();
        p1.setNumBanco(1111);
        p1.setDono("Arthur");
        p1.abrirConta("CC");
        p1.fecharConta();
        p1.depositar(550);
        p1.sacar(1000);
        p1.estadoAtual();
        
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumBanco(2222);
        p2.setDono("Diego");
        p2.abrirConta("CP");
        p2.depositar(50);
       p2.estadoAtual();
    }
}
