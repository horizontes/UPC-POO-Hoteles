package pruebasControles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableRenderer {
    
    public void inicio(){
        JFrame con = new JFrame();
        con.setTitle("Dos");
        con.setSize(200, 200);
        JTable table = new JTable();
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
//Creatamos un contenedor para la Tabla
        JScrollPane scrollPane = new JScrollPane(table);
//Agregamos nuestra tabla al contenedor
        con.add(scrollPane, BorderLayout.CENTER);
        new MyTableCellRender().getTableCellRendererComponent(table, "13", true, true, 0, 0);
        con.setVisible(true);
    }
    
}

class MyTableCellRender extends DefaultTableCellRenderer {

    public MyTableCellRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
    boolean isSelected, boolean hasFocus, int row, int column) {

        String number = (String) value;
        int val = Integer.parseInt(number);

        if (val > 5) {
            if (val >= 5000) {
                setForeground(Color.black);
                setBackground(Color.red);
            } else {
                setForeground(Color.black);
                setBackground(Color.yellow);
            }
        } else {
            setBackground(Color.white);
            setForeground(Color.black);
        }
        setText(value != null ? value.toString() : "");
        return this;
    }
    
    public static void main(String[] args) {
        new TableRenderer().inicio();
    }
    
}