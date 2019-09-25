package crud;

import java.util.Scanner;

public class CRUD {
 
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String dato1 =  scan.next();
        System.out.println("Ingrese apellido");
        String dato2 =  scan.next();
        bd.Agregar(dato1, dato2);
        System.out.println("Qué dato desea eliminar?");
        String datoE = scan.next();
        bd.Eliminar(datoE);
    }
    
}
