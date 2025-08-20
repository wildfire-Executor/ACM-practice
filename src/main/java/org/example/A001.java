package org.example;
import java.util.Scanner;
import java.lang.Math;
public class A001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();


            double dx = x2 - x1;
            double dy = y2 - y1;
            double distance = Math.sqrt(dx * dx + dy * dy);

            System.out.printf("%.2f\n", distance);
        }

        sc.close();
    }
}
