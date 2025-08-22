package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 16:17
 */
public class A2013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = 1;
            for (int i = 1; i < n; i++) {
                sum = (sum + 1) * 2;
            }
            System.out.println(sum);
        }
    }

}
