/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class PROJETO_15_NATA {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int[] valorUsuario = new int[5];
        String nomeArquivo = "";
        Date data = new Date();
        boolean s = true;
        
        System.out.println("--- TABUADA ---");
        System.out.print("\nInforme um nome para o arquivo: ");
        nomeArquivo = read.next();
        read.nextLine();
        
        for (int i = 0; i < valorUsuario.length; i++) {
            boolean valorValido = false;
            while (!valorValido) {
                try {
                    System.out.print("\nInforme um valor para a posição " + (i + 1) + ": ");
                    valorUsuario[i] = read.nextInt();  
                    valorValido = true;  
                } 
                catch (InputMismatchException e) {
                    System.out.println("Erro: por favor, insira apenas números inteiros.");
                    read.next(); 
                }
            }
        }
        
        for (int valor : valorUsuario) {
            try (FileWriter arquivo = new FileWriter("C:\\Users\\ncunha\\Desktop\\TESTE_NOVA_PASTA\\" + nomeArquivo + "_tabuada_" + valor + ".txt");
                 PrintWriter gravar = new PrintWriter(arquivo)) {
                 
                gravar.printf("Tabuada do " + valor + " | " + data + "\n");
                gravar.printf("---------------\n");

                for (int i = 1; i <= 10; i++) {
                    gravar.printf(i + " x " + valor + " = " + (i * valor) + "\n");
                }
                gravar.printf("---------------\n");
                System.out.println("Arquivo para o valor " + valor + " gerado com sucesso!");
            } 
            catch (IOException e) {
                System.out.println("Erro ao gerar o arquivo: " + e.getMessage());
            }
        }
    }
}
