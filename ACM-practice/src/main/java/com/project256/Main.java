package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 11:46
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            System.out.printf("%.2f\n", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        }
    }

}
