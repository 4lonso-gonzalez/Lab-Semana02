/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author alons
 */
public class Triangular_Inferior {
    
    public void TriangularInferior() { // Metodo para hacer la matriz triangular inferior
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { // Evalua, si la fila es mayor que la columna es 1, todo lo demas es 0
                if (i > j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}