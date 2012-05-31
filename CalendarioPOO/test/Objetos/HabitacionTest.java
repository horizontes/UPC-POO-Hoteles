/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.Habitacion;
import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class HabitacionTest {
    
    public HabitacionTest() {
    }

    @Test
    public void validarQueTodasTenganNumero() {
        Habitacion habitacion = new Habitacion(101);
        assertNotNull(habitacion.getNumHabitacion());
    }
    
    @Test
    public void validarQueTodasTenganTipo() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);
        assertNotNull(habitacion.getTipoHabitacion());
    }
    
    @Test
    public void validarQueSiSeCreaTipoQueCorresponda() {
        Habitacion habitacion = new Habitacion(101);
        habitacion.setTipoHabitacion(new TipoHabitacion("Suite"));
        assertSame(habitacion.getTipoHabitacion().toString(),"Suite");
    }
    
    @Test
    public void QueLogeeLosValoresNull() {
        Habitacion habitacion = new Habitacion(101);
        habitacion.setTipoHabitacion(new TipoHabitacion(null));
        assertFalse(habitacion.errorObject);
        assertNotNull(habitacion.getTipoHabitacion());
    }
    
    @Test
    public void QueLosNumerosSeanValidosNegativo() {
        Habitacion habitacion = new Habitacion(-1);
        System.out.println("En caso de valores null el flag de valores nulos se activa y detiene los procesos");
        assertTrue(habitacion.errorInt);
    }
    
    @Test
    public void QueLosNumerosSeanValidosCero() {
        Habitacion habitacion = new Habitacion(0);
        System.out.println("En caso de valores null el flag de valores nulos se activa y detiene los procesos");
        assertTrue(habitacion.errorInt);
    }
}
