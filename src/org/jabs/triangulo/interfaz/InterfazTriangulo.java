package org.jabs.triangulo.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.geom.Line2D;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jabs.triangulo.mundo.Punto;
import org.jabs.triangulo.mundo.Triangulo;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class InterfazTriangulo extends JFrame
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Triángulo
     */
    private Triangulo triangulo;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Panel de los botones
     */
    private PanelBotones panelBotones;

    /**
     * Panel de visualización del triángulo
     */
    private PanelTriangulo panelTriangulo;

    /**
     * Panel de extensiones
     */
    private PanelOpciones panelOpciones;

    /**
     * Panel con el encabezado
     */
    private PanelImagen panelImagen;

    /**
     * Diálogo de cambio de puntos
     */
    private DialogoPuntos dialogoPuntos;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Constructor de la interfaz
     */
    public InterfazTriangulo( )
    {
        //Crea el triángulo
        triangulo = new Triangulo( );

        //Crea el punto 1
        Punto punto1 = new Punto( );
        punto1.inicializar( 120, 20 );

        //Crea el punto 2
        Punto punto2 = new Punto( );
        punto2.inicializar( 220, 200 );

        //Crea el punto 1
        Punto punto3 = new Punto( );
        punto3.inicializar( 20, 200 );

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

        //Crea la interfaz
        setTitle( "Triángulo" );
        getContentPane( ).setLayout( new BorderLayout( ) );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        panelBotones = new PanelBotones( this );
        getContentPane( ).add( panelBotones, BorderLayout.WEST );
        panelTriangulo = new PanelTriangulo( triangulo );
        getContentPane( ).add( panelTriangulo, BorderLayout.CENTER );

        panelOpciones = new PanelOpciones( this );
        getContentPane( ).add( panelOpciones, BorderLayout.SOUTH );

        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, BorderLayout.NORTH );

        pack( );
        repintar( );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

}
