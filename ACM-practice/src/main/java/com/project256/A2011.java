package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 15:50
 */
public class A2011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                float sum = 1.0f;
                for (int i1 = 2; i1 <= input; i1++) {
                    if (i1 % 2 == 0) {
                        sum -= (float) (1.0 / i1);
                        continue;
                    }
                    sum += (float) (1.0 / i1);
                }
                System.out.printf("%.2f\n", sum);
            }
        }
    }

}
