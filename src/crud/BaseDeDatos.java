package crud;

import java.util.ArrayList;

public class BaseDeDatos {
    Dato d = new Dato();
    ArrayList<Dato> datos = new ArrayList<>();
    
    public ArrayList<Dato> Agregar(Dato d){       
        double r = Math.random()*40;
        d.setId(String.valueOf(r));
        d.setData(d);
        datos.add(d);
        return datos;
    }
    public static void Eliminar(Dato d){
        
    }
    public static Dato Listar(){
        
    }
    
    public static void Modificar (Dato d){
    }
}
