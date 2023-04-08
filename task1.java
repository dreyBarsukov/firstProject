package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class task1 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2020, 6, 25,19,47);

        LocalDateTime second = now.plusDays(3L);

        LocalDate localDate = second.toLocalDate();
        LocalTime localTime = second.toLocalTime();

        System.out.println(localTime);
        System.out.println();
        System.out.println(localDate);
    }
}
