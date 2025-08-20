package com.project256;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 15:19
 */
public class A2006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String l = scanner.nextLine().trim();
            if (l.isEmpty()) {
                continue;
            }
            String[] ls = l.split(" ");
            long product = Arrays.stream(ls).skip(1).mapToLong(Long::parseLong).filter(s -> s % 2 != 0).reduce(1, (a, b) -> a * b);
            System.out.println(product);
        }
    }

}
