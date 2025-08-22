package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 15:31
 */
public class A2010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            String res = "";
            for (int i = m; i <= n; i++) {
                int low = i % 10;
                int mid = (int) Math.floor((double) (i % 100) / 10);
                int high = (int) Math.floor((double) (i % 1000) / 100);
                if (i == low * low * low + mid * mid * mid + high * high * high) {
                    res += i + " ";
                }
            }

            if (res.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println(res.trim());
            }
        }
    }

}
