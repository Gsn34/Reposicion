package reposicion;

import java.util.ArrayList;

/**
 *
 * @author guill
 */
public class Reportes {
    CompilacionDatos compilacion;
    ArrayList <CompilacionDatos> baseDatos;
    public Reportes(ArrayList <CompilacionDatos> compilacionDatos){
        baseDatos = new ArrayList<>();
        this.baseDatos = compilacionDatos;
    }
    public void Reporte (){
        int suma =0;
        for (Integer GetEdad : compilacion.GetEdad()) {
            suma += GetEdad;
        }
        suma = suma/compilacion.GetEdad().size();
        System.out.println("Promedio De las Sumas: "+suma);
    }
    
}
