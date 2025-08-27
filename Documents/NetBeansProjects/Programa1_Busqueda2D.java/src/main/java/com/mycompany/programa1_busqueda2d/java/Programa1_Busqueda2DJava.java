/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_busqueda2d.java;

/**
 *
 * @author USER
 */
public class Programa1_Busqueda2DJava {

    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    return new int[]{fila, columna}; // Retorna la posición encontrada
                }
            }
        }
        return new int[]{-1, -1}; // No se encontró el valor
    }

    public static void main(String[] args) {
        // Declarar una matriz 3x3
        int[][] matriz = {
                {15, 28, 23},
                {58, 25, 39},
                {54, 62, 91}
        };

        int valorBuscado = 25;
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("Valor " + valorBuscado +
                    " encontrado en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado en la matriz.");
        }
    }
}