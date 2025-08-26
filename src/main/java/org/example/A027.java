package org.example;
import java.util.Scanner;
public class A027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().toLowerCase();
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                switch (c) {
                    case 'a': countA++; break;
                    case 'e': countE++; break;
                    case 'i': countI++; break;
                    case 'o': countO++; break;
                    case 'u': countU++; break;
                }
            }

            System.out.println("a:" + countA);
            System.out.println("e:" + countE);
            System.out.println("i:" + countI);
            System.out.println("o:" + countO);
            System.out.println("u:" + countU);

            if (i < n - 1) {
                System.out.println();
            }
        }
    }
}
