/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasControles;

/**
 *
 * @author cgarrido
 */
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.GridBagConstraints;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Prueba extends JPanel {

    private static final long serialVersionUID = 1L;
    private JComboBox jComboBox = null;

    /**
     * This is the default constructor
     */
    public Prueba() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridx = 0;
        this.setSize(300, 200);
        this.setLayout(new GridBagLayout());
        this.add(getJComboBox(), gridBagConstraints);
        
        jComboBox.addItem("France"); 
        jComboBox.addItem("Germany"); 
        jComboBox.addItem("Italy"); 
        jComboBox.addItem("Japan"); 
        
        addActions();
    }

    /**
     * This method initializes jComboBox    
     *     
     * @return javax.swing.JComboBox    
     */
    private JComboBox getJComboBox() {
        if (jComboBox == null) {
            jComboBox = new JComboBox();
        }
        return jComboBox;
    }
    
    public void addActions()
    {
        /*
         * ######################################
         *         ACCION DEL JCOMBOBOX
         * ######################################
         */
        final ItemListener changeClick = new ItemListener()
        {
            public void itemStateChanged(ItemEvent e) 
            {
                if(jComboBox.getSelectedItem().equals(e.getItem()))
                {
                    System.out.println("Hola "+e.getItem().toString());
                }
            }
        };
        
        this.jComboBox.addItemListener(changeClick);
    }
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.setVisible(true);
    }
}  
