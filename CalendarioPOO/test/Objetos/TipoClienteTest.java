/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControlesGenerales;
import modelos.TipoPasajero;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class TipoClienteTest {

    public TipoClienteTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        String expResult = "VIP";
        String result = tipoCliente.getTipoPasajero();
        assertFalse(tipoCliente.errorObject);
        assertEquals(expResult, result);
    }
    
    @Test
    public void QueLogeeLosValoresNull() {
        TipoPasajero tipoCliente = new TipoPasajero(null);
        System.out.println("En caso de valores null el flag de valores nulos se activa y detiene los procesos");
        assertTrue(tipoCliente.errorObject);
    }
    
}