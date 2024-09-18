/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.automatas;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EjemploAutomatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean menu = true;
        Scanner consola = new Scanner(System.in);
        int opcion;
        String cadena;
        AutomataEnteroPositivo automataEntero = new AutomataEnteroPositivo();
        AutomataNombreVariables automataVariables = new AutomataNombreVariables();
        AutomataTarea automataTarea = new AutomataTarea();
        AutomataBinariosPares automataBinario = new AutomataBinariosPares();

        while (menu) {
            System.out.println("1. Validar expresion regular tarea.");
            System.out.println("2. Validar expresion binarios pares.");
            System.out.println("3. Validar expresion nombres de varialbes");
            System.out.println("4. Validar expresion enteros positivos y negativos");
            System.out.println("5. Salir");

            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cadena que cumpla con a*(ab|b)*");
                    cadena = consola.next();
                    System.out.println(automataTarea.parsear(cadena));
                    break;
                case 2:
                    System.out.println("Ingrese cadena que cumpla con (1|0)*0");
                    cadena = consola.next();
                    System.out.println(automataBinario.parsear(cadena));
                    break;
                case 3:
                    System.out.println("Ingrese cadena que cumpla con [a-zA-Z]([a-zA-Z_0-9])*");
                    cadena = consola.next();
                    System.out.println(automataVariables.parsear(cadena));
                    break;
                case 4:
                    System.out.println("Ingrese cadena que cumpla con [-+]?(0-9)+");
                    cadena = consola.next();
                    System.out.println(automataEntero.parsear(cadena));
                    break;
                case 5:
                    System.out.println("Programa terminado.");
                    menu = false;
                    break;
                default:
                    System.out.println("Ingresar una opcion valida");
            }
        }

    }

}
