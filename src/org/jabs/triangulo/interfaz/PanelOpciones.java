package org.jabs.triangulo.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Creado por Familia Buriticá en 9/28/2017.
 */
public class PanelOpciones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando Opción 1
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opción 2
     */
    private static final String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazTriangulo padre;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Botón Opción 1
     */
    private JButton btnOpcion1;

    /**
     * Botón Opción 2
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param elPadre Ventana principal
     */
    public PanelOpciones( InterfazTriangulo elPadre )
    {
        padre = elPadre;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 2 ) );

        //Botón opción 1
        btnOpcion1 = new JButton( "Opción 1" );
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        //Botón opción 2
        btnOpcion2 = new JButton( "Opción 2" );
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones
     * @param e Acción que generó el evento.
     */
    public void actionPerformed( ActionEvent e )
    {
        if( OPCION_1.equals( e.getActionCommand( ) ) )
        {
            padre.reqFuncOpcion1( );
        }
        else if( OPCION_2.equals( e.getActionCommand( ) ) )
        {
            padre.reqFuncOpcion2( );
        }
    }
}
