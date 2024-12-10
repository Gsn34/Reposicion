package reposicion;


import java.util.Random;

/**
 *
 * @author guill
 */
public class Conjuntos {
    private int [] arregloA;
    private int [] arregloB;
    Random ran = new Random();
    public Conjuntos(){
        int tamano = 10+ran.nextInt(10);
        arregloA = new int[tamano];
        arregloB = new int [tamano];
        for (int i = 0; i < arregloA.length; i++) {
            int numeroRanA = 1+ran.nextInt(20);
            int numeroRanB = 1+ran.nextInt(20);
            arregloB[i]=numeroRanB;
            arregloA[i]=numeroRanA;
        
        }
    }
    public void Union(){
        
    }
    
    public void Intereccion(){
        int coincidencias = 0;
        for (int i = 0; i < arregloA.length; i++) {
            if (arregloA[i] == arregloB[i]) {
                coincidencias++;
            }
        }
        int j;
        int [] interseccion = new int[coincidencias];
        for (int i = 0; i < interseccion.length; i++) {
            for (j = 0; j < arregloA.length; j++) {
                if (arregloA[j] == arregloB[j]) {
                    interseccion[i]=arregloA[j];
                }
            }
        }
        System.out.println();
        System.out.println("|Interseccion|");
        System.out.print("Conjunto: {");
        for (int i = 0; i < interseccion.length; i++) {
            System.out.print(interseccion[i]+", ");
        }
        System.out.print("}");
        System.out.println("");
    }
    public void ImprimirArreglos(){
        System.out.print("Conjunto A: {");
        String arreglo = "";
        for (int i = 0; i < arregloA.length; i++) {
            arreglo+=arregloA[i]+", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length()-2));
        System.out.print("}");
        System.out.println();
        arreglo="";
        System.out.print("Conjunto B: {");
        for (int i = 0; i < arregloA.length; i++) {
            arreglo+=arregloB[i]+", ";
        }
        System.out.print(arreglo.substring(0, arreglo.length()-2));
        System.out.print("}");    }
}
