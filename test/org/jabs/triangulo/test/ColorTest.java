package org.jabs.triangulo.test;

import junit.framework.TestCase;
import org.jabs.triangulo.mundo.Color;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class ColorTest extends TestCase
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Color a probar
     */
    private Color color;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public ColorTest()
    {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el Color
     */
    private void setupEscenario1( )
    {
        color = new Color( );
        color.inicializar( 1, 1, 1 );
    }

    /**
     * Prueba 1 - Rojo
     */
    public void testRojo( )
    {
        setupEscenario1( );

        //Prueba el color Rojo
        assertEquals( "El rojo debe estar inicializado en 1", 1, color.darRojo( ) );
        color.cambiarRojo( 25 );
        assertEquals( "El rojo debe ser 25", 25, color.darRojo( ) );
    }

    /**
     * Prueba 1 - Verde
     */
    public void testVerde( )
    {
        setupEscenario1( );

        //Prueba el color Verde
        assertEquals( "El verde debe estar inicializado en 1", 1, color.darVerde( ) );
        color.cambiarVerde( 25 );
        assertEquals( "El verde debe ser 25", 25, color.darVerde( ) );
    }

    /**
     * Prueba 1 - Azul
     */
    public void testAzul( )
    {
        setupEscenario1( );

        //Prueba el color Azul
        assertEquals( "El azul debe estar inicializado en 1", 1, color.darAzul( ) );
        color.cambiarAzul( 25 );
        assertEquals( "El azul debe ser 25", 25, color.darAzul( ) );
    }
}
