package crud;

import java.util.Scanner;

public class CRUD {
 
    public static void main(String[] args) {
        BaseDeDatos lista = new BaseDeDatos();
        Dato dato;
        dato = new Dato("RETS", "dato1");
        lista.Agregar(dato);
        dato = new Dato("GTDS", "dato2");
        lista.Agregar(dato);
        dato = new Dato("JDBJ", "dato3");
        lista.Agregar(dato);
        dato = new Dato("JDBJ", "dato4");
        lista.Modificar(dato);
    }
    
}
