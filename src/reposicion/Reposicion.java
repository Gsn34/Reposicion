package reposicion;

import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Reposicion {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ciclo = true;
        while (ciclo) {
            System.out.println();
            System.out.println("----Menu----");
            System.out.println("0. Terminar");
            System.out.println("1. Flecha");
            System.out.println("2. Conjuntos");
            System.out.println("3. Base de datos");
            System.out.print("R: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 3 -> {
                    BaseDeDatos base = new BaseDeDatos();
                    base.menu();
                }
                case 1->{
                    Flecha flecha = new Flecha();
                    
                }
                case 2->{
                    Conjuntos conjunto = new Conjuntos();
                    conjunto.ImprimirArreglos();
                    conjunto.Union();
                    conjunto.Intereccion();
                }
                case 0->{
                    ciclo = false;
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        }
        
    }
    
}
