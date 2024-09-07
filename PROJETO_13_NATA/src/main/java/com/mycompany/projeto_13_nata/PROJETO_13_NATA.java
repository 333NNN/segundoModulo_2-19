/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class PROJETO_13_NATA {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int tamanho = 0;

        try {
            System.out.println("Digite o tamanho do vetor: ");
            tamanho = ler.nextInt();
            
            int[] nums = new int[tamanho];
            int[] result = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                System.out.println("Digite o número que ocupará a  posição "+ i );
                nums[i] = ler.nextInt();
            }

            System.out.println("Posições dos números:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Índice " + i + ": " + nums[i]);
            }
            
            int operacao = 0;
            
            while (true){
                System.out.println("Escolha a operação desejada \n1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão: ");
                operacao = ler.nextInt();
                
                if (operacao < 1 || operacao > 4) {
                    System.out.println("Operação inválida. Tente novamente.");
                }
                else {
                    break;
                }
            }
            
            System.out.print("Digite o primeiro índice: ");
            int indice1 = ler.nextInt();
            System.out.print("Digite o segundo índice: ");
            int indice2 = ler.nextInt();

            
            try {
                switch (operacao) {
                    case 1: 
                        result[indice1] = nums[indice1] + nums[indice2];
                        System.out.println("Resultado da adição: " + result[indice1]);
                        break;
                    case 2: 
                        result[indice1] = nums[indice1] - nums[indice2];
                        System.out.println("Resultado da subtração: " + result[indice1]);
                        break;
                    case 3: 
                        result[indice1] = nums[indice1] * nums[indice2];
                        System.out.println("Resultado da multiplicação: " + result[indice1]);
                        break;
                    case 4: 
                        try {
                            result[indice1] = nums[indice1] / nums[indice2];
                            System.out.println("Resultado da divisão: " + result[indice1]);
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora dos limites do vetor.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
        }
    }
}
