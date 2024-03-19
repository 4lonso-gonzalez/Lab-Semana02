/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author alons
 */
public class Triangular_Superior {
    private int columna;
    private int fila;
    
    public int getColumna(){
        return columna;
    }
    public void setColumna(int columna){
        this.columna = columna;
    }
    
    public int getFila(){
        return fila;
    }
    public void setFila(int fila){
        this.fila = fila;
    }
    
    public void TriangularSuperior() { // Metodo para hacer la matriz triangular superior
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) { // Evalua, si la fila es menor que la columna es 1, todo lo demas es 0
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

