package main.java.tasks.day3;

/*
2.5 написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
 и выводит в консоль в формате "September, 7, 2020 22:00"
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class DateTime2 {
    public void dateTime2(String date){
/*        DateFormat dateFormat = new SimpleDateFormat("hh.mm dd.MM.yyyy");
        System.out.println(dateFormat.format(date));
        Date d = null;*/

        Formatter f = new Formatter();
        Calendar cal = Calendar.getInstance();

        f = new Formatter();
        f.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(f);


/*        DateFormat dateFormat2 = new SimpleDateFormat("MMMM, dd, yyyy hh:mm", Locale.ENGLISH);
        System.out.println(dateFormat.format(date));*/
    }

}
