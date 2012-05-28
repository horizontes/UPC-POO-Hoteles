/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package pruebasControles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class SimpleTable4 extends JFrame {
    
    public JLabel texto1= new JLabel("Rojo");

    public SimpleTable4() {
        super("SimpleTable4");
        MyTableModel myModel = new MyTableModel();
        JTable table = new JTable(myModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
//Creatamos un contenedor para la Tabla
        JScrollPane scrollPane = new JScrollPane(table);
//Agregamos nuestra tabla al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class MyTableModel extends AbstractTableModel {

        final String[] columnNames = {"Nombre",
            "Apellido",
            "Pasatiempo",
            "Años de Practica",
            "Soltero(a)"};
        
        
        final Object[][] data = {
            {"Mary", "Campione",
                "Esquiar", texto1, new Boolean(false)},
            {"Lhucas", "Huml",
                "Patinar", new Integer(3), new Boolean(true)},
            {"Kathya", "Walrath",
                "Escalar", new Integer(2), new Boolean(false)},
            {"Marcus", "Andrews",
                "Correr", new Integer(7), new Boolean(true)},
            {"Angela", "Lalth",
                "Nadar", new Integer(4), new Boolean(false)}
        };
//únicamente retornamos el numero de elementos del
//array de los nombres de las columnas

        public int getColumnCount() {
            return columnNames.length;
        }
//retormanos el numero de elementos
//del array de datos

        public int getRowCount() {
            return data.length;
        }
//retornamos el elemento indicado

        public String getColumnName(int col) {
            return columnNames[col];
        }
//y lo mismo para las celdas

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }
        /*
* Este metodo sirve para determinar el editor predeterminado
* para cada columna de celdas
*/

        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
        /*
* No tienes que implementar este método a menos que
* las celdas de tu tabla sean Editables
*/

        public boolean isCellEditable(int row, int col) {
            return true;
        }
        /*
* No tienes que implementar este método a menos que
* los datos de tu tabla cambien
*/

        public void setValueAt(Object value, int row, int col) {
            data[row][col] = value;
            fireTableCellUpdated(row, col);
        }
    }

    public static void main(String[] args) {
        SimpleTable4 frame = new SimpleTable4();
        frame.texto1.setBackground(Color.red);
        frame.pack();
        frame.setVisible(true);
    }
}