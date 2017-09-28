package org.jabs.triangulo.mundo;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class Triangulo
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Componente R de RGB (Red)
     */
    private int rojo;

    /**
     * Componente G de RGB (Green)
     */
    private int verde;

    /**
     * Componente B de RBG (Blue)
     */
    private int azul;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public Triangulo()
    {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el color
     * @param elRojo valor R de RGB
     * @param elVerde valor G de RGB
     * @param elAzul valor B de RGB
     */
    public void inicializar( int elRojo, int elVerde, int elAzul )
    {
        rojo = elRojo;
        verde = elVerde;
        azul = elAzul;
    }

    /**
     * Devuelve la cantidad de rojo (R) en el color
     * @return Cantidad de rojo
     */
    public int darRojo( )
    {
        return rojo;
    }

    /**
     * Cambia la cantidad de rojo (R) en el color
     * @param elRojo Nuevo valor
     */
    public void cambiarRojo( int elRojo )
    {
        rojo = elRojo;
    }

    /**
     * Devuelve la cantidad de verde (G) en el color
     * @return Cantidad de verde
     */
    public int darVerde( )
    {
        return verde;
    }

    /**
     * Cambia la cantidad de verde (G) en el color
     * @param elVerde Cantidad de verde
     */
    public void cambiarVerde( int elVerde )
    {
        verde = elVerde;
    }

    /**
     * Devuelve la cantidad de azul (B) en el color
     * @return Cantidad de azul
     */
    public int darAzul( )
    {
        return azul;
    }

    /**
     * Cambia la cantidad de azul (B) en el color
     * @param elAzul Cantidad de azul
     */
    public void cambiarAzul( int elAzul )
    {
        azul = elAzul;
    }

}
