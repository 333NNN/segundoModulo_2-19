 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_nata;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Nata e Julia
 */
public class PROJETO_14_NATA {

    public static void main(String[] args) throws IOException {
        
        DataInputStream input = new DataInputStream(System.in);
        int[][] matriz = new int[5][5];
        int[] vetor = new int[25];
        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

        System.out.println("Digite os valores para preencher uma matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(input.readLine());
                vetor[i * 5 + j] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\nMatriz ordenada:");
        for (int i = 0; i < 25; i++) {
            System.out.print(vetor[i] + "\t");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        System.out.println("\nNúmeros repetidos:");
        boolean repetidosEncontrados = false;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (i > 0 && vetor[i] == vetor[i - 1]) {
                continue;
            }
            int contador = 1;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }
            if (contador > 1) {
                System.out.println(vetor[i] + " aparece " + contador + " vezes");
                repetidosEncontrados = true;
            }
        }
        if (!repetidosEncontrados) {
            System.out.println("Nenhum número repetido encontrado.");
        }

        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][4 - i];
        }
        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        System.out.println("\nMatriz com números primos substituídos por -1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = matriz[i][j];
                boolean primo = true;
                if (num <= 1) {
                    primo = false;
                } 
                else {
                    for (int k = 2; k <= Math.sqrt(num); k++) {
                        if (num % k == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) {
                    matriz[i][j] = -1;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
