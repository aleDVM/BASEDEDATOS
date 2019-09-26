package crud;

import java.util.ArrayList;

public class BaseDeDatos {
  
    private ArrayList<Dato> datos ;

    public BaseDeDatos() {        
        this.datos = new ArrayList<>();
    }

    public boolean Agregar(Dato dato){
        return this.datos.add(dato);
    }
    
    public boolean Modificar(Dato dato){
        for(int i=0; i < datos.size(); i++){
            if(datos.get(i).getId().equals(dato.getId())){
              datos.get(i).setId(dato.getId());
              datos.get(i).setData(dato.getData());
              return true;
            }
        }  
        return false;
    }    
    
    public ArrayList<Dato> Listar(){
        return this.datos;
    }
    
    public boolean Eliminar(String id){
        for(int i=0; i < datos.size(); i++){
            if(datos.get(i).getId().equals(id)){
                datos.remove(i);
                return true;
            }
        }  
        return false;
    }
}
