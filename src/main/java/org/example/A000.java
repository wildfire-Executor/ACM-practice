package org.example;
import java.util.Scanner;
public class A000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char a = s.charAt(0);
            char b = s.charAt(1);
            char c = s.charAt(2);
            if (a > b) {
                char temp = a;
                a = b;
                b = temp;
            }
            if (a > c) {
                char temp = a;
                a = c;
                c = temp;
            }
            if (b > c) {
                char temp = b;
                b = c;
                c = temp;
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}