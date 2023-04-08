package com.practice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class task4 {

        public static void main(String[] args) {
            String formattedDate = "26-03-1968T09:24";
            DateTimeFormatter formator_we = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");

            LocalDateTime now = LocalDateTime.parse(formattedDate, formator_we);

            Instant instant = now.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(now));
            System.out.println(instant);
            System.out.println(instant);
            System.out.println(instant);
            

        }
    }
