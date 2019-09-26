package crud;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BaseDeDatosTest {
    
    public BaseDeDatosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Agregar method, of class BaseDeDatos.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = new Dato("RET", "wesd");
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(dato);
        assertEquals(esperado, obtenido);
     
    }

    /**
     * Test of Modificar method, of class BaseDeDatos.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = new Dato("TDDJ", "sfa");
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.Modificar(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Listar method, of class BaseDeDatos.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList<Dato> expResult = null;
        ArrayList<Dato> result = instance.Listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class BaseDeDatos.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "";
        BaseDeDatos instance = new BaseDeDatos();
        boolean expResult = false;
        boolean result = instance.Eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
