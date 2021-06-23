package main.java.tasks.day3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime {

    public void dateTime(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("Сейчас на дворе:\ndd MMMM, yyyy, HH часа mm минут");
        System.out.println(dateFormat.format(date));
    }
}
