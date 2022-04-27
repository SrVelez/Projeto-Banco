/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import java.util.Scanner;

/**
 *
 * @author arTTh
 */
public class ContaBanco {
        public int numBanco;
        private String dono;
        private String tipo;
        private float saldo;
        private boolean status;
        
        public void estadoAtual(){
            System.out.println("-----------------------------");
            System.out.println("Conta:" + this.getNumBanco());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " + this.getStatus() );
        }

        public ContaBanco() {
            this.setSaldo(0);
                this.setStatus(false);
        }
        
        public int getNumBanco(){
            return numBanco;
        }
        
        public void setNumBanco(int numBanco){
            this.numBanco = numBanco;
        }
        
        public String getDono(){
            return dono;
        }
        
        public void setDono(String dono){
            this.dono = dono;
        }
        
        public String getTipo(){
            return tipo;
        }
        
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        
        public float getSaldo(){
            return saldo;
        }
        
        public void setSaldo(float saldo){
            this.saldo = saldo;
        }
        
        public boolean getStatus(){
            return status;
        }
        
        public void setStatus(boolean status){
            this.status = status;
        }
        
        public void abrirConta(String t){
            this.setStatus(true);
            this.setTipo(t);
            
           
                if (t == "CC"){
                   this.setSaldo(50);
                    }else if (t == "CP"){
                       this.setSaldo(150);
                        }
                System.out.println("Conta aberta com Sucesso!!");
                }
        
        public void fecharConta(){
            
            
            if(this.getStatus() == true){  
                if (this.getSaldo() >0 ){
                      System.out.println("Indisponivel o fechamento tem dinheiro em conta");
                }   else if (this.getSaldo() <0){
                      System.out.println("Conta em Debito");
                }
            }else {
                this.status = false;
            }
            System.out.println("Conta fechada com Sucesso!!");
        }
        
        public void depositar(float v){
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Deposito realizado na conta de " + this.getDono());
            } else {
                System.out.println("Deposito Indisponivel em uma conta fechada");
                
            }
        }
        
        public void sacar(float v){
            if (this.getStatus()){
                if (this.getSaldo()>=v){
                   this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                }else if (this.getSaldo() <0){
                    System.out.println("Saldo insuficiente para saque");
                }
            } else {
                System.out.println("Impossivel sacar de uma conta fechada!!");
            }
        }
        
        public void pagarMensal(){
            int v ;
            if (this.getTipo() == "cc") {
                v = 12;
            } else {
                v = 20;
            }
            
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com Sucesso por " + this.getDono());
            }
        }
}
