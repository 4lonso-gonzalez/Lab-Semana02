/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author alons
 */
public class Diagonal_Principal { // Asignacion de los atributos para la clase
    private int columna;
    private int fila;
    
    public int getColumna(){ // Metodos get y set para cada atributo
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
    
    public void DiagonalPrincipal() { // Metodo para hacer la matriz diagonal principal
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) { // Evalua la matriz y si las filas y las columnas son iguales se les asigna un 1, de no ser asi un 0
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 4; i++) { // Imprime cada fila con un salto de linea, asi se facilita diferenciar las filas
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}