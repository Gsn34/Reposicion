package reposicion;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guill
 */
public class Conjuntos {

    private int[] arregloA;
    private int[] arregloB;
    Random ran = new Random();

    public Conjuntos() {
        int tamano = 10 + ran.nextInt(10);
        arregloA = new int[tamano];
        arregloB = new int[tamano];
        for (int i = 0; i < arregloA.length; i++) {
            int numeroRanA = 1 + ran.nextInt(20);
            int numeroRanB = 1 + ran.nextInt(20);
            arregloB[i] = numeroRanB;
            arregloA[i] = numeroRanA;

        }
    }

    public void Union() {
        ArrayList<Integer> interseccion = new ArrayList<>();
        int coincidencias = 0;
        for (int i = 0; i < arregloA.length; i++) {
            if (!interseccion.contains(arregloA[i]) && !interseccion.contains(arregloB[i])) {
                interseccion.add(arregloA[i]);
                interseccion.add(arregloB[i]);
            }
        }
        System.out.println();
        System.out.println("");
        String arreglo = "";
        System.out.println("|Union|");
        System.out.print("Conjunto: {");
        for (int i = 0; i < interseccion.size(); i++) {
            arreglo += interseccion.get(i) + ", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length() - 2));
        System.out.print("}");

    }

    public void Intereccion() {
        ArrayList<Integer> interseccion = new ArrayList<>();
        int coincidencias = 0;
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloB.length; j++) {
                if (arregloA[i] == arregloB[j]) {
                    if (!interseccion.contains(arregloA[i])) {
                        interseccion.add(arregloA[i]);
                    }
                }
            }
        }

        System.out.println();
        System.out.println("");
        String arreglo = "";
        System.out.println("|Interseccion|");
        System.out.print("Conjunto: {");
        for (int i = 0; i < interseccion.size(); i++) {
            arreglo += interseccion.get(i) + ", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length() - 2));
        System.out.print("}");
        System.out.println("");
    }

    public void ImprimirArreglos() {
        System.out.println("");
        System.out.print("Conjunto A: {");
        String arreglo = "";
        for (int i = 0; i < arregloA.length; i++) {
            arreglo += arregloA[i] + ", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length() - 2));
        System.out.print("}");
        System.out.println();
        arreglo = "";
        System.out.print("Conjunto B: {");
        for (int i = 0; i < arregloA.length; i++) {
            arreglo += arregloB[i] + ", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length() - 2));
        System.out.print("}");
    }
}
