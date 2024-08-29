/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class PROJETO_12_NATA {
    
    public static Scanner ler = new Scanner(System.in);
    public static String nomeFilme;
    public static String[] dicas = new String[5];
    
    public static void main(String[] args) {
        
        System.out.println("JOGO: Qual o filme?");
       
        jogadorUm();
        jogadorDois();
    }
    
    public static void jogadorUm(){
        
        System.out.println("Jogador 1, digite seu nome: ");
        String nomeJogadorUm = ler.nextLine();
        System.out.println(nomeJogadorUm+", digite o nome do filme: ");
        nomeFilme = ler.nextLine();
        
        System.out.println(nomeJogadorUm+", digite 5 dicas para o filme: ");
                
        for (int i=0; i<5; i++){
            System.out.println("Dica "+(i+1)+": ");
            dicas[i] = ler.nextLine();
        }
    }
    
    public static void jogadorDois(){
        
        System.out.println("Jogador 2, digite seu nome");
        String nomeJogadorDois = ler.nextLine();
               
        while(true){
            
            for (int i=0; i<5; i++){
                
                System.out.println("Dica "+(i+1)+" "+dicas[i]);
                            System.out.println(nomeJogadorDois+", digite seu palpite");
                String palpite = ler.nextLine();
        
                if(palpite.equals(nomeFilme)){
                    System.out.println("Parabéns! Você acertou");
                    return;
                }
                else {
                    System.out.println("Tente novamente.");
                }
            }
        

        }      
    }
}    

    

