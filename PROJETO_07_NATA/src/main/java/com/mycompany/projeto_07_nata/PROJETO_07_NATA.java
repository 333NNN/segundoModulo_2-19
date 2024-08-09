/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_07_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class PROJETO_07_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos calcular seu IMC (Índice de Massa Corporal).");
        System.out.println("Para começar, digite seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite seu peso: ");
        float peso = ler.nextFloat();
        System.out.print("Agora, digite sua altura: ");
        float alt = ler.nextFloat();
        
        float imc = peso/(alt*alt);
        System.out.println("Seu IMC é: " + imc);
        
        if (imc < 18.5) {
            System.out.println(nome + ", você está abaixo do peso ideal.");
        }
        else if (imc >= 18.5 || imc <= 24.9){
            System.out.println(nome + ", você está no peso ideal.");
        } 
        else if (imc >= 25.0 || imc <= 29.9){
            System.out.println(nome + ", você está com escesso de peso.");
        }
        else if (imc >= 30.0 || imc <= 34.9) {
            System.out.println(nome + ", você está com Obesidade Classe I");
        }
        else if (imc >= 35.0 || imc <= 39.9) {
            System.out.println(nome + ", você está com Obesidade Classe II");
        } 
        else if (imc > 40){
            System.out.println(nome + ", você está com Obesidade Classe III");
        }
    }
}
