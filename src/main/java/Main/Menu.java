/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;
import Matriz.Diagonal_Principal;
import Matriz.Triangular_Inferior;
import Matriz.Triangular_Superior;
// Importacion de las clases a utilizar en el programa

/**
 *
 * @author alons
 */

public class Menu {
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "LABORATORIO MATRICES"); // Comienzo del menu con una pantalla emergente (gracias a la clase JOptionPane)
    
    boolean continuar = true; // Gracias a la variable boolean el bucle while puede iniciar y preguntar al usuario si quiere continuar
    
    while (continuar) {
        int opcion;
        
        String menu = "1. Mostrar Matriz Diagonal Principal\n" +
                      "2. Mostrar Matriz Triangular Inferior\n" +
                      "3. Mostrar Matriz Triangular Superior\n" +
                      "ESCOJA UNA OPCION:";
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opcion) { // Switch nos permite seleccionar y encontrar el caso segun corresponda
            case 1: // Caso de la matriz diagonal principal
                Diagonal_Principal dp = new Diagonal_Principal();
                dp.DiagonalPrincipal();
                break;
                
            case 2: // Caso de la matriz triangular inferior
                Triangular_Inferior mi = new Triangular_Inferior();
                mi.TriangularInferior();
                break;
                
            case 3: // Caso de la matriz triangular superior
                Triangular_Superior ms = new Triangular_Superior();
                ms.TriangularSuperior();
                break;
                
            default: // Si no eligue una opcion entre 1 a 4, despliega este mensaje
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                break;
        }
        
            int respuesta = JOptionPane.showConfirmDialog(null, "¿DESEA MOSTRAR OTRA MATRIZ?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA");
                continuar = false; // Pregunta al usuario si quiere continuar, de no ser asi finaliza el programa
            }
        }
    }
}
