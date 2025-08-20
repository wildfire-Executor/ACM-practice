package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 12:52
 */
public class A2004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int s = scanner.nextInt();
            if (0 <= s && s <= 59) {
                System.out.println("E");
                continue;
            }
            if (60 <= s && s <= 69) {
                System.out.println("D");
                continue;
            }
            if (70 <= s && s <= 79) {
                System.out.println("C");
                continue;
            }
            if (80 <= s && s <= 89) {
                System.out.println("B");
                continue;
            }
            if (90 <= s && s <= 100) {
                System.out.println("A");
                continue;
            }
            System.out.println("Score is error!");
        }
    }

}
