package crud;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }   
    
      @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = new Dato("TDDJ", "sfa");
        BaseDeDatos instance = new BaseDeDatos();
        instance.Agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.Modificar(dato);
        dato = new Dato("RGDDJ", "ssaf");
        assertEquals(esperado, obtenido);
        
    } 
}
