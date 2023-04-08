package com.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2020,7,7);

        LocalDateTime localDateTime = now.atStartOfDay();
        LocalDateTime localDateTime1 = prevDate.atStartOfDay();

        long between = ChronoUnit.SECONDS.between(localDateTime1, localDateTime);

        Duration between1 = Duration.between(localDateTime1, localDateTime);

        System.out.println(between);
        System.out.println(between1.getSeconds());
    }
}
