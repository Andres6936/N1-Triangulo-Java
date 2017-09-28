package org.jabs.triangulo.mundo;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class Punto
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Valor X del punto
     */
    private double x;

    /**
     * Valor Y del punto
     */
    private double y;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public Punto()
    {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el punto con los valores iniciales <br>
     * @param x1 Valor X del punto
     * @param y1 Valor Y del punto <b>pre: </b> las coordenadas X1 y Y1 son validas ( no son negativas, son enteras) <br>
     *        <b>post: </b> un punto se ha creado
     */
    public void inicializar( double x1, double y1 )
    {
        x = x1;
        y = y1;
    }

    /**
     * Devuelve el valor X del punto
     * @return Valor X del punto
     */
    public double darX( )
    {
        return x;
    }

    /**
     * Cambia el valor X del punto
     * @param x1 Valor X del punto
     */
    public void cambiarX( double x1 )
    {
        x = x1;
    }

    /**
     * Devuelve el valor Y del punto
     * @return Valor Y del punto
     */
    public double darY( )
    {
        return y;
    }

    /**
     * Cambia el valor Y del punto
     * @param y1 Valor Y del punto
     */
    public void cambiarY( double y1 )
    {
        y = y1;
    }

}
