package org.example;
import java.util.Scanner;
import java.lang.Math;
public class A020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (Math.abs(numbers[j]) < Math.abs(numbers[j + 1])) {
                        if (Math.abs(numbers[j]) < Math.abs(numbers[j + 1])) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                        }
                    }
                }
            }
                for (int i = 0; i < n; i++) {
                    System.out.print(numbers[i] + " ");
                }
            System.out.println();
            }
        }
    }
