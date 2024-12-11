package reposicion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Reportes {

    ArrayList<CompilacionDatos> compilacion;
    Scanner sc = new Scanner(System.in);

    public Reportes(ArrayList<CompilacionDatos> compilacionDatos) {
        this.compilacion = compilacionDatos;
    }

    public void Reporte() {
        boolean ciclo = true;

        while (ciclo) {
            System.out.println();
            System.out.println("-----Menu Reportes-----");
            System.out.println("Ingrese su opcion");
            System.out.println("0. Terminar");
            System.out.println("1. Promedio Edad");
            System.out.println("2. Cantidad de personas con el apellido [Hernandez]");
            System.out.println("3. Nombre de las personas de apellido [Lopez] que tengan mas de 30");
            System.out.println("4. Edad de las pesoanas cuyo nombre sea mayor a 6 caracteres ");
            System.out.println("5. Cantidad de personas que sean de la tercera edad");
            System.out.println("6. Nombre de personas de apellido [Martines] que la edad < 40");
            System.out.print("R: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("|Promedio de la edades|");
                    int suma = 0;
                    for (int i = 0; i < compilacion.size(); i++) {
                        suma += compilacion.get(i).GetEdad().get(i);
                    }
                    suma = suma / compilacion.size();
                    System.out.println("Promedio de la suma de edades: " + suma);
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("|Lista Nombres|");
                    int contador = 0;
                    for (int i = 0; i < compilacion.size(); i++) {
                        if (compilacion.get(i).GetApellido().get(i).equalsIgnoreCase("hernandez")) {
                            contador++;
                        }
                    }
                    System.out.println("La cantidad de Hernandez en la lista es de: " + contador);
                }

                case 3 -> {
                    System.out.println("");
                    System.out.println("|Lista Nombres|");
                    for (int i = 0; i < compilacion.size(); i++) {
                        if (compilacion.get(i).GetApellido().get(i).equalsIgnoreCase("lopez") && compilacion.get(i).GetEdad().get(i) > 30) {
                            System.out.println(compilacion.get(i).GetNombre().get(i));
                        }
                    }
                }
                case 4 -> {
                    System.out.println("");
                    System.out.println("|Lista de Edades|");
                    for (int i = 0; i < compilacion.size(); i++) {
                        if (compilacion.get(i).GetNombre().get(i).length() > 6) {
                            System.out.println("Edad: " + compilacion.get(i).GetEdad().get(i));
                        }
                    }
                }
                case 5 -> {
                    int suma = 0;
                    System.out.println("");
                    System.out.println("|Tercera Edad|");
                    for (int i = 0; i < compilacion.size(); i++) {
                        int edad = compilacion.get(i).GetEdad().get(i);
                        if (edad > 60) {
                            suma++;
                        }
                    }
                    System.out.println("El total de las personas de tercera edad: " + suma);

                }
                case 6 -> {
                    System.out.println("");
                    System.out.println("|Lista Nombres|");
                    int contador = 0;
                    for (int i = 0; i < compilacion.size(); i++) {
                        if (compilacion.get(i).GetApellido().get(i).equalsIgnoreCase("martinez") && compilacion.get(i).GetEdad().get(i) < 40) {
                            System.out.println(compilacion.get(i).GetNombre().get(i));
                        }
                    }
                }
                case 0 -> {
                    ciclo = false;
                }

                default -> {
                    System.out.println("Opcion Incorrecta");
                }
            }

        }
    }
}
