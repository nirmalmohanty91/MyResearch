package com.cdk.standaloneprograms.WorkingWithDates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class WorkingWithDate {

  public static void main(String[] args) {

    //    System.out.println(MyEnum.get(MyEnum.NIRMAL));
    //    System.out.println(MyEnum.NIRMAL.getClass());
    // Working with LocalDate

    //    System.out.println(LocalDate.of(1991, 06, 05));
    //    System.out.println(LocalDate.of(1991, Month.JUNE, 05));

    LocalDate today = LocalDate.now();
    LocalDate nextDay = today.plusDays(1);
    LocalDate previousDay = today.minusDays(1);
    LocalDate previousMonthSameDay = today.minus(1, ChronoUnit.MONTHS);
    LocalDate nextMonthSameDay = today.plus(1, ChronoUnit.MONTHS);
    DayOfWeek dayOfWeek = LocalDate.parse("1991-06-05").getDayOfWeek();
    int dayOfTheMonth = LocalDate.parse("1991-06-05").getDayOfMonth();
    // System.out.println(dayOfWeek+":"+dayOfTheMonth);
    boolean isLeapYear = LocalDate.now().isLeapYear();
    //System.out.println(isLeapYear);
    //System.out.println(LocalDate.of(1991, 06, 05).isLeapYear());
    // WorkingWithDate.printDate(today, nextMonthSameDay);
    boolean isAfter = LocalDate.parse("1991-06-05").isAfter(LocalDate.parse("1891-06-05"));
    //System.out.println(isAfter);
    boolean isBefore = LocalDate.parse("1991-06-05").isAfter(LocalDate.parse("1991-06-05"));
   // System.out.println(isBefore);
    LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
    LocalDate firstDayOfMonth =
        LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
    //System.out.println(beginningOfDay);
    //System.out.println(firstDayOfMonth);
    // Working with LocalTime

    LocalTime timeNow = LocalTime.now();
    WorkingWithDate.printTime(timeNow);

      ZoneId zoneId = ZoneId.of("Europe/Paris");
    System.out.println(zoneId);
  }

  private static void printDate(LocalDate today, LocalDate localDate) {
   // System.out.println(today);
    //System.out.println(localDate);
  }

  private static void printTime(LocalTime time) {
    System.out.println(time);
  }
}
