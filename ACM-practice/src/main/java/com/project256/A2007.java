package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 15:05
 */
public class A2007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long m = scanner.nextInt();
            long n = scanner.nextInt();

            if (m > n) {
                long temp = m;
                m = n;
                n = temp;
            }

            long odd = 0;
            long even = 0;
            for (long i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    even += i * i;
                    continue;
                }
                odd += i * i * i;
            }
            System.out.printf("%d %d\n", even, odd);
        }
    }

}
