package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 12:51
 */
public class A2003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double r = scanner.nextDouble();
            System.out.printf("%.2f\n", Math.abs(r));
        }
    }

}
