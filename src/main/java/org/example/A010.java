package org.example;
import java.util.Scanner;
public class A010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            boolean ifFound=false;

            for (int i = m; i <= n; i++) {
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;

                if(a*a*a+b*b*b+c*c*c==i){
                   System.out.print(i+" ");
                    ifFound = true;
                }

            }
            if (!ifFound) {
                System.out.print("no");
            }
                System.out.println();

        }
    }
}
