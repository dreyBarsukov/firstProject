package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class task5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2020,7,7);

        Period between;
        between = Period.between(now,prevDate);
        long between1 = ChronoUnit.DAYS.between(prevDate, now);

        System.out.println(between1);
    }

}
