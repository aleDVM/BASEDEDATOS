package crud;

import java.util.ArrayList;

public class BaseDeDatos {
    Dato d = new Dato();
    ArrayList<Dato> datos = new ArrayList<>();
    
    public ArrayList<Dato> Agregar(String a, String b){       
        double r = Math.random()*40;
        d.setId(String.valueOf(r));
        d.setData(a);
        datos.add(d);
        d.setData(b);
        datos.add(d);
        return datos;
    }
    public void Eliminar(String d){
        datos.remove(d);
    }
    public String Listar(){
        return d.toString();
    }
    
    public static void Modificar (Dato d){
        
    }
}
