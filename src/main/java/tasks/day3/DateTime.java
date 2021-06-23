package main.java.tasks.day3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
2.4 написать метод, который выводит в консоль текущую дату и время в формате:
Сейчас на дворе:
19 сентября, 2020, 3 часа 13 минут
 */

public class DateTime {

    public void dateTime(){

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("Сейчас на дворе:\ndd MMMM, yyyy, HH часа mm минут");
        System.out.println(dateFormat.format(date));

        /*System.out.println("Сейчас на дворе:");

        GregorianCalendar calendar = new GregorianCalendar(2020, Calendar.SEPTEMBER , 19);
        calendar.set(Calendar.HOUR, 3);
        calendar.set(Calendar.MINUTE, 13);
        System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + " сентября,");
        //System.out.print(" " + calendar.get(Calendar.MONTH));
        System.out.print(calendar.get(Calendar.YEAR) + ",");
        System.out.print(" " + calendar.get(Calendar.HOUR) + " часа");
        System.out.print(" " + calendar.get(Calendar.MINUTE) + " минут");*/
    }
}
