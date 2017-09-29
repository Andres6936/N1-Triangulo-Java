package org.jabs.triangulo.test;

import org.jabs.triangulo.mundo.Punto;
import junit.framework.TestCase;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class PuntoTest extends TestCase
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Punto a probar
     */
    private Punto punto;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public PuntoTest()
    {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el Punto
     */
    private void setupEscenario1( )
    {
        punto = new Punto( );
        punto.inicializar( 1, 1 );
    }

    /**
     * Prueba 1 - Valor X
     */
    public void testValorX( )
    {
        setupEscenario1( );

        //Prueba el valor X
        assertEquals( "El valor X debe estar inicializado en 1", 1, punto.darX( ), 0 );
        punto.cambiarX( 25 );
        assertEquals( "El valor X debe ser 25", 25, punto.darX( ), 0 );
    }

    /**
     * Prueba 2 - Valor Y
     */
    public void testValorY( )
    {
        setupEscenario1( );

        //Prueba el valor Y
        assertEquals( "El valor Y debe estar inicializado en 1", 1, punto.darY( ), 0 );
        punto.cambiarY( 25 );
        assertEquals( "El valor Y debe ser 25", 25, punto.darY( ), 0 );
    }
}
