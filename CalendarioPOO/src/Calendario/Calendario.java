

package Calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class Calendario {

    public static void main(String[] args) {
     //   Calendar hoy = Calendar.getInstance();
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEEE' de 'dd' de 'MMMM' de 'yyyy", new Locale("es_ES"));
        System.out.println(simpleDate.format(new Date(112, 6, 12)));
        Calendar hoy = simpleDate.getCalendar();
        int j = 0;
        System.out.println(simpleDate.getCalendar().get(5));
        hoy.add(Calendar.DATE, 20);
        simpleDate.format(new Date(112, 6, 24));
        System.out.println(simpleDate.getCalendar().getTime().getDate());
        
//        while (j < 12) {
//
//            hoy.add(Calendar.DATE, 1);
//            System.out.println(simpleDate.format(hoy.getTime()));
//            j++;
//
//        }
    }
}
