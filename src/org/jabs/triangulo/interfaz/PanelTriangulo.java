package org.jabs.triangulo.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

import org.jabs.triangulo.mundo.Triangulo;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class PanelTriangulo extends JPanel
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Triángulo a dibujar
     */
    private Triangulo triangulo;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param elTriangulo Triángulo a dibujar
     */
    public PanelTriangulo( Triangulo elTriangulo )
    {
        triangulo = elTriangulo;
        setPreferredSize( new Dimension( 270, 200 ) );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Método para pintar el triángulo
     * @param g Gráficas donde se debe pintar
     */
    protected void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        Graphics2D g2d = ( Graphics2D )g;

        //Crea un polígono y lo pinta
        Polygon poligono = new Polygon( );
        poligono.addPoint( ( int )triangulo.darPunto1( ).darX( ), ( int )triangulo.darPunto1( ).darY( ) );
        poligono.addPoint( ( int )triangulo.darPunto2( ).darX( ), ( int )triangulo.darPunto2( ).darY( ) );
        poligono.addPoint( ( int )triangulo.darPunto3( ).darX( ), ( int )triangulo.darPunto3( ).darY( ) );

        //Pinta el fondo
        g2d.setColor( new Color( triangulo.darColorRelleno( ).darRojo( ), triangulo.darColorRelleno( ).darVerde( ), triangulo.darColorRelleno( ).darAzul( ) ) );
        g2d.fill( poligono );

        //Pinta el borde
        g2d.setColor( new Color( triangulo.darColorLineas( ).darRojo( ), triangulo.darColorLineas( ).darVerde( ), triangulo.darColorLineas( ).darAzul( ) ) );
        g2d.draw( poligono );
    }
}
