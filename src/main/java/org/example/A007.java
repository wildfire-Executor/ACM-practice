package org.example;
import java.util.Scanner;
public class A007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int init1 = 0;
            int init2 = 0;
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    init1 += i * i;
                } else {
                    init2 += i * i * i;
                }
            }
            System.out.println(init1 + " " + init2);
        }
    }
}
