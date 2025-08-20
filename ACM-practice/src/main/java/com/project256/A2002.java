package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/20 12:46
 */
public class A2002 {

    public static final double PI =  3.1415927;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double r = scanner.nextDouble();
            System.out.printf("%.3f\n", ((4.0/3.0) * PI * Math.pow(r, 3)));
        }
    }

}
