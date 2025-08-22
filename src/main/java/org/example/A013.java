package org.example;
import java.util.Scanner;
public class A013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int peaches = 1;

            for (int i = 1; i <= n - 1; i++) {
                peaches = 2 * (peaches + 1);
            }

            System.out.println(peaches);
        }
    }
}