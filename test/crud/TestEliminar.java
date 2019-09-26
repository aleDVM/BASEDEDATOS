package crud;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String id = "DAD";
        Dato dato = new Dato("DAD", "sfa");
        BaseDeDatos instance = new BaseDeDatos();
        instance.Agregar(dato);
        boolean esperado = true;
        dato = new Dato("DAD", "sfa");
        boolean obtenido = instance.Eliminar(id);
        Assert.assertEquals(esperado, obtenido);
    }
}
