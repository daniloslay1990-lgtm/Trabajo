/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_busqueda2d.java;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class Programa2_Ordenacion2DJava {

    
     public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]); // Ordena la fila en orden ascendente
        } else {
            System.out.println("Número de fila no válido.");
        }
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Declarar una matriz 3x3
        int[][] matriz = {
                {24, 14, 15},
                {34, 16, 32},
                {28, 12, 72}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenar la segunda fila (índice 1)
        ordenarFila(matriz, 1);

        System.out.println("\nMatriz con la fila 1 ordenada:");
        imprimirMatriz(matriz);
    }
}    
        
        
        
    

