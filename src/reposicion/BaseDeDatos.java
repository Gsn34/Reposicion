package reposicion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guill
 */
public class BaseDeDatos {

    private ArrayList <String> nombre;
    private ArrayList <String> apellido;
    private ArrayList <Integer> edad;
    private ArrayList <String> dato;
    private ArrayList <String> valor;
    private Scanner scan = new Scanner(System.in);

    public BaseDeDatos() {
        nombre = new ArrayList<>();
        apellido = new ArrayList<>();
        dato = new ArrayList<>();
        valor = new ArrayList<>();
        edad = new ArrayList<>();
    }

    public void menu() {
        char resp = 's';
        
        do {

            System.out.print("Ingrese Su nombre: ");
            String Nnombre = scan.nextLine();
            nombre.add(Nnombre);
            System.out.print("Ingrese su apellido: ");
            String Napellido = scan.nextLine();
            apellido.add(Napellido);
            System.out.print("Ingrese su edad: ");
            int Nedad = scan.nextInt();
            edad.add(Nedad);
            System.out.println("Desea agregar mas datos?[S/N]");
            System.out.print("R: ");
            resp = scan.next().charAt(0);

            if (resp == 'S' || resp == 's') {

                do {
                    System.out.print("Ingrese el nuevo dato: ");
                    String nuevoDato = scan.nextLine();
                    dato.add(nuevoDato);
                    System.out.print("Ingrese su " + nuevoDato + ": ");
                    String nuevoValor = scan.nextLine();
                    valor.add(nuevoValor);
                    System.out.println("Desea agregar mas datos?[S/N]");
                    System.out.print("R: ");
                    resp = scan.next().charAt(0);
                } while (resp == 'S' || resp == 's');
                
                System.out.println("Desea continuar?[S/N]");
                System.out.print("R: ");
                resp = scan.next().charAt(0);
                
                if (resp != 'S' || resp != 's') {
                    break;
                }
            }

        } while (resp =='s' || resp =='S');
    }

}
