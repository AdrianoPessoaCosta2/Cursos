package br.com.abc.javacore.Tdatas.test;

import sun.util.calendar.CalendarSystem;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt - portuguese, en = ingles, US = Estados Unidos
        Locale locItaly = new Locale("it");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndiaa = new Locale("hi", "HI");
        Locale locJapao = new Locale("ja");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 26);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3  = DateFormat.getDateInstance(DateFormat.FULL, locIndiaa);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);


        System.out.println("Italia "+df.format(c.getTime()));
        System.out.println("Suiça "+df2.format(c.getTime()));
        System.out.println("India "+df3.format(c.getTime()));
        System.out.println("Japão "+df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage(locIndiaa));
        System.out.println(locJapao.getDisplayLanguage(locItaly));
        System.out.println(locSuica.getDisplayCountry(locItaly));




    }
}
