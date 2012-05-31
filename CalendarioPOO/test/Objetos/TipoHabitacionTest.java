/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class TipoHabitacionTest {
    
    public TipoHabitacionTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        String expResult = "Suite";
        String result = tipoHabitacion.getTipo();
        assertEquals(expResult, result);
        assertFalse(tipoHabitacion.errorObject);
    }
    
    @Test
    public void QueLogeeLosValoresNull() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion(null);
        System.out.println("En caso de valores null el flag de valores nulos se activa y detiene los procesos");
        assertTrue(tipoHabitacion.errorObject);
    }
    
}
