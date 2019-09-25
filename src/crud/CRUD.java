package crud;

import java.util.Scanner;

public class CRUD {
 
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese datos");
        String dato1 =  scan.next();
        System.out.println("Ingrese datos");
        String dato2 =  scan.next();
        bd.Agregar();
        bd.Eliminar(null);
    }
    
}
