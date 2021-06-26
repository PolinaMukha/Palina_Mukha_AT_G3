package main.java.tasks.day3;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringRunner {

    public static void main(String[] args) throws IOException, ParseException {
        //new DuplicatedWords().DeleteDuplicates();
        //new ConversionText().ConvertTextWithNumbers();
        //new DateTime().dateTime();

        final String INPUT_PATERN = "E MMM dd HH:mm:ss z yyyy";
        final String OUTPUT_PATERN = "dd.MM.yyyy";

        final String DATE_TEXT = "Mon Jul 02 00:00:00 UZT 2018";

        DateTimeFormatter formater = DateTimeFormatter.ofPattern(INPUT_PATERN).withLocale(Locale.US);
        ZonedDateTime localeDate = ZonedDateTime.parse(DATE_TEXT, formater);
        System.out.println(localeDate.format(DateTimeFormatter.ofPattern(OUTPUT_PATERN)));

        new SimpleDateFormat("dd.MM.yyyy").parse("02.07.2018");





    }
}
