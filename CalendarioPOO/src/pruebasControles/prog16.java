/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasControles;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class prog16 {
//declaracion, creacion e inicializacion de componentes, objetos y variables
    static JFrame ventana = new JFrame();
    static JPanel p1 = new JPanel();
    static JPanel p2 = new JPanel();
    static String[] lista = {"municipios", "tecate", "tijuana", "ensenada", "tecate"};
    static JComboBox municipios = new JComboBox(lista);
    static JTextField jt1 = new JTextField(15);
    static JButton jb1 = new JButton("OK");
// parte principal de programa

    public static void main(String[] args) { // area de definicion de propiedades de el objeto
        ventana.setTitle("mi programa");
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.getContentPane().setLayout(new GridLayout(2, 0));
//cargando panel1 con combobox y definiendo titulo
        p1.setLayout(new GridLayout(1, 0));
//observar que index cero es el titulo (aunque es un elemento mas)
        municipios.setSelectedIndex(0);
        p1.add(municipios);
//cargando segundo panel con jbutton y jtextfield
        p2.add(jb1);
        p2.add(jt1);
        ventana.getContentPane().add(p1);
        ventana.getContentPane().add(p2);
        ventana.pack();
        ventana.setVisible(true);
        jb1.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
// la propiedad getselecteditem() regresa un objeto
                jt1.setText(String.valueOf(municipios.getSelectedItem()));
            }
        });
    }
; // termina main
} // termina clase[1]
