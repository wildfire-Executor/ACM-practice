package com.project256;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 15:11
 */
public class A2005 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String d = scanner.next();
            LocalDate date = LocalDate.parse(d, DateTimeFormatter.ofPattern("yyyy/M/d"));
            System.out.println(date.getDayOfYear());
        }
    }

}
