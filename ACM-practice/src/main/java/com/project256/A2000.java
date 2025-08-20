package com.project256;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 11:36
 */
public class A2000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] sa = s.split("");
            System.out.println(String.join(" ", Arrays.stream(sa).sorted().collect(Collectors.toList())));
        }
    }

}
