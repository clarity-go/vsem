package kash.edu.theory;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  MyLocalDate
  @version  1.0.0 
  @since 17.03.2021 - 20.44
**/

public class MyLocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, Month.JANUARY, 11);
        System.out.println(date.getDayOfWeek());
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusDays(100).getDayOfWeek());

        // Day of Programmers
        System.out.println(LocalDate.of(2021, Month.JANUARY, 1).plusDays(255));

        // Days I has lived
        LocalDate birthday = LocalDate.of(1998, Month.JULY, 1);
        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDate.now()));
    }
}
