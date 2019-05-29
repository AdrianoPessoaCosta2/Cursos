package br.com.abc.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
//        c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
            System.out.println(c);
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.roll(Calendar.MONTH, 30);
        Date data2 = c.getTime();

        System.out.println(data2);

    }
}
