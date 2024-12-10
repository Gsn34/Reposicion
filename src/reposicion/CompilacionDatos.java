package reposicion;

import java.util.ArrayList;

/**
 *
 * @author guill
 */
public class CompilacionDatos {
    private ArrayList<String> nombre;
    private ArrayList<String> apellido;
    private ArrayList<Integer> edad;
    private ArrayList <String> dato;
    private ArrayList <String> valor;
    
    public CompilacionDatos(ArrayList<String> nombre, ArrayList<String> apellido, ArrayList<Integer> edad, ArrayList<String> dato, ArrayList<String> valor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dato = dato;
        this.valor = valor;
    }
    
    public ArrayList<String> GetNombre (){
        return nombre;
    }
    public void setNombre (ArrayList<String> nombre){
        this.nombre = nombre;
    }
    public ArrayList<String> GetApellido (){
        return apellido;
    }
    public void setApellido (ArrayList<String> apellido){
        this.apellido = apellido;
    }
    public ArrayList<String> Getdato (){
        return dato;
    }
    public void setdato (ArrayList <String> dato){
        this.dato = dato;
    }
    public ArrayList<String> GetValor (){
        return valor;
    }
    public void setValor (ArrayList <String> valor){
        this.valor = valor;
    }
    public ArrayList<Integer> GetEdad (){
        return edad;
    }
    public void setEdad (ArrayList <Integer> edad){
        this.edad = edad;
    }
}
