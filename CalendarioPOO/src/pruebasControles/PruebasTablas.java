/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasControles;

/**
 *
 * @author cgarrido
 */
public class PruebasTablas {
    
    public void Tablas(){
        int[] habitaciones = {102,103,104,105,106};
        int[][] habitaciones1= new int[habitaciones.length][1];
        
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones1[i][0] = habitaciones[i];
        }
        for (int i = 0; i < habitaciones1.length; i++) {
            System.out.println(habitaciones1[i][0]);
            
        }
    }
        
    public static void main(String[] args) {
        new PruebasTablas().Tablas();
    }
            
}
