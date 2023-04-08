package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(dateTimeFormatter);

        System.out.println(format);

    }
}
