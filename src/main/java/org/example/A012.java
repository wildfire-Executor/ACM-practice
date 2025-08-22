package org.example;
import java.util.Scanner;

public class A012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }

            boolean allPrime = true;
            for (int n = x; n <= y; n++) {
                int val = n * n + n + 41;

                boolean isPrime = true;
                for (int i = 2; i*i <= val; i++) {
                    if (val % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (!isPrime) {
                    allPrime = false;
                    break;
                }
            }

            System.out.println(allPrime?"OK":"Sorry");
            }
        }


    }


