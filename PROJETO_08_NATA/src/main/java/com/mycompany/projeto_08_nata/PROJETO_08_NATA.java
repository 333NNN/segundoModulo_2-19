/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_08_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class PROJETO_08_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos descobrir qual o desempenho de um país a partir do número de medalhas conquistadas!");
        System.out.print("Digite a quantidade de medalhas de ouro: ");
        int ouro = ler.nextInt();
        System.out.print("Digite a quantidade de medalhas de prata: ");
        int prata = ler.nextInt();
        System.out.print("Digite a quatidade de medalhas de bronze: ");
        int bronze = ler.nextInt();
        
        
        if (ouro > 5 && ouro + prata + bronze > 30){
            System.out.println("O país obteve um desempenho extraórdinário!");
        }
        else if(ouro > 10) {
            System.out.println("O país obteve um ótimo desempenho!");
        }
        else if (ouro >= 10 && ouro <= 5){
            System.out.println("O país teve um bom desempenho.");
        }
        else if (ouro + prata + bronze > 20) {
            System.out.println("O país teve um desempenho regular.");
        }
        else if (ouro + prata + bronze <= 20){
            System.out.println("O país teve um desempenho fraco.");
        }
        
    }
}
