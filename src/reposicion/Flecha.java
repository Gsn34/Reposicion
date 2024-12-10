package reposicion;

import java.util.Random;

/**
 *
 * @author guill
 */
public class Flecha {

    private int[][] matriz;
    private Random ran = new Random();
    String suma = "";

    public Flecha(int impar) {

        matriz = new int[impar][impar];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int random = ran.nextInt(10);
                matriz[i][j] = random;
            }
        }
    }

    public void Suma() {
        int sumaNumeros = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == (matriz.length / 2) && j < matriz.length / 2) {
                    suma += matriz[i][j] + " + ";
                    sumaNumeros += matriz[i][j];
                }
            }
        }
        int numero = 0;
        for (int i = 0; i <= 2; i++) {
            while (numero+i < matriz.length - i) {               
                suma += matriz[numero+i][(matriz.length / 2) + i]+" + ";
                sumaNumeros+=matriz[numero+i][(matriz.length / 2) + i];
                numero++;                
            }            
            numero=0;
        }
        System.out.println();
        System.out.println("|Suma total|");       
        System.out.println(suma.substring(0, suma.length()-2)+": "+sumaNumeros);

    }

    public void ImprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    public void ImprimirFlecha() {
        char[][] ejemplo = new char[matriz.length][matriz.length];
        System.out.println();
        System.out.println("|Flecha|");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == (matriz.length / 2) && j < matriz.length / 2) {
                    ejemplo[i][j] = (char) (matriz[i][j] + 48);
                }else{
                    ejemplo[i][j]=' ';
                }
            }
        }
       int numero = 0;
        for (int i = 0; i <= 2; i++) {
            while (numero+i < matriz.length - i) {                                   
                ejemplo[numero+i][(matriz.length / 2) + i] = (char) (matriz[numero+i][(matriz.length / 2) + i]+48);               
                numero++;                                
            }            
            numero=0;
        }
        for (int i = 0; i < ejemplo.length; i++) {
            for (int j = 0; j < ejemplo.length; j++) {
                System.out.print(ejemplo[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}


