package crud;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestAgregar {
        public TestAgregar() {
    }
    
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = new Dato("RET", "wesd");
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(dato);
        assertEquals(esperado, obtenido);
     
    }
}
