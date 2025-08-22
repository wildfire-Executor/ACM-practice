package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 16:13
 */
public class A2014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
                sum += input;
            }
            System.out.printf("%.2f\n", (float) (sum - max - min) / (n - 2));
        }
    }

}
