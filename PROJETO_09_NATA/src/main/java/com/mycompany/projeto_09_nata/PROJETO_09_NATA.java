/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_09_nata;

import java.util.Random;
/**
 *
 * @author Nata e Julia
 */
public class PROJETO_09_NATA {

    public static void main(String[] args) {
        Random aleat = new Random();
        
        int carrosFila1 = aleat.nextInt(11), carrosFila2 = aleat.nextInt(11), carrosFila3 = aleat.nextInt(11);
        
        int carrosPassam1 = aleat.nextInt(31), carrosCongest1 = 0, tempoEspera1 = 0;
        int carrosPassam2 = aleat.nextInt(31), carrosCongest2 = 0, tempoEspera2 = 0;
        int carrosPassam3 = aleat.nextInt(31), carrosCongest3 = 0, tempoEspera3 = 0;
        
        int tempoTotal = 600;
        int cicloSemaforo = 80; // 30s verde, 5s amarelo, 45s vermelho

        for (int seg = 0; seg < tempoTotal; seg++) {
            int estadoSemaforo1 = seg % cicloSemaforo;
            int estadoSemaforo2 = seg % cicloSemaforo;
            int estadoSemaforo3 = seg % cicloSemaforo;

            if (seg % 15 == 0) {
                int novosCarros1 = aleat.nextInt(11);
                int novosCarros2 = aleat.nextInt(11);
                int novosCarros3 = aleat.nextInt(11);
                
                if (carrosFila1 + novosCarros1 > 10) {
                    carrosCongest1 += (carrosFila1 + novosCarros1 - 10);
                    carrosFila1 = 10;
                } 
                else {
                    carrosFila1 += novosCarros1;
                }

                if (carrosFila2 + novosCarros2 > 10) {
                    carrosCongest2 += (carrosFila2 + novosCarros2 - 10);
                    carrosFila2 = 10;
                } 
                else {
                    carrosFila2 += novosCarros2;
                }

                if (carrosFila3 + novosCarros3 > 10) {
                    carrosCongest3 += (carrosFila3 + novosCarros3 - 10);
                    carrosFila3 = 10;
                } 
                else {
                    carrosFila3 += novosCarros3;
                }
            }
            while (estadoSemaforo1 < 30 && carrosFila1 > 0) {
                carrosPassam1++;
                tempoEspera1 += seg;
                carrosFila1--;
            }
            while (estadoSemaforo2 < 30 && carrosFila2 > 0) {
                carrosPassam2++;
                tempoEspera2 += seg;
                carrosFila2--;
            }
            while (estadoSemaforo3 < 30 && carrosFila3 > 0) {
                carrosPassam3++;
                tempoEspera3 += seg;
                carrosFila3--;
            }
        }

        System.out.println("Interseção 1:");
        System.out.println("  Carros que passaram: " + carrosPassam1);
        System.out.println("  Tempo médio de espera: " + (carrosPassam1 == 0 ? 0 : tempoEspera1 / carrosPassam1) + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongest1);

        System.out.println("Interseção 2:");
        System.out.println("  Carros que passaram: " + carrosPassam2);
        System.out.println("  Tempo médio de espera: " + (carrosPassam2 == 0 ? 0 : tempoEspera2 / carrosPassam2) + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongest2);

        System.out.println("Interseção 3:");
        System.out.println("  Carros que passaram: " + carrosPassam3);
        System.out.println("  Tempo médio de espera: " + (carrosPassam3 == 0 ? 0 : tempoEspera3 / carrosPassam3) + " segundos");
        System.out.println("  Carros congestionados: " + carrosCongest3);
    }
}

