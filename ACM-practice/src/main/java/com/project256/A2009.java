package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 15:23
 */
public class A2009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            double n = scanner.nextInt();
            int m = scanner.nextInt();
            double sum = n;
            for (int i = 1; i < m; i++) {
                n = Math.sqrt(n);
                sum += n;
            }
            System.out.printf("%.2f\n", sum);
        }
    }

}
