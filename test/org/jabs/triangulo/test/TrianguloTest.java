package org.jabs.triangulo.test;

import junit.framework.TestCase;
import org.jabs.triangulo.mundo.Punto;
import org.jabs.triangulo.mundo.Triangulo;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class TrianguloTest extends TestCase
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se harán las pruebas
     */
    private Triangulo triangulo;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public TrianguloTest()
    {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo Triangulo vacía
     *
     */
    private void setupEscenario1( )
    {
        //Crea el triángulo
        triangulo = new Triangulo( );

        //Crea el punto 1
        Punto punto1 = new Punto( );
        punto1.inicializar( 0, 4 );

        //Crea el punto 2
        Punto punto2 = new Punto( );
        punto2.inicializar( 0, 0 );

        //Crea el punto 1
        Punto punto3 = new Punto( );
        punto3.inicializar( 8, 4 );

        //Inicializa el color del relleno en Azul
        // Valor RGB = (0, 0, 150)
        org.jabs.triangulo.mundo.Color colorRelleno = new org.jabs.triangulo.mundo.Color( );
        colorRelleno.inicializar( 0, 0, 170 );

        //Inicializa el color de las líneas en negro
        // Valor RGB = (0, 0, 0)
        org.jabs.triangulo.mundo.Color colorLineas = new org.jabs.triangulo.mundo.Color( );
        colorLineas.inicializar( 0, 0, 0 );

        //Inicializa el triángulo
        triangulo.inicializar( punto1, punto2, punto3, colorRelleno, colorLineas );
    }

    /**
     * Prueba 1 - Área del triángulo
     */
    public void testArea( )
    {
        setupEscenario1( );

        assertEquals( "El Área debe ser 16", 16, triangulo.darArea( ), 0 );
    }

    /**
     * Prueba 2 - Perímetro del Triángulo
     */
    public void testPerimetro( )
    {
        setupEscenario1( );

        assertEquals( "El perímetro debe ser 20.94427190999916", 20.94427190999916, triangulo.darPerimetro( ), 0.0000000000001 );
    }

    /**
     * Prueba 3 - Altura del Triángulo
     */
    public void testAltura( )
    {
        setupEscenario1( );

        assertEquals( "La altura debe ser 8", 8, triangulo.darAltura( ), 0 );
    }
}
