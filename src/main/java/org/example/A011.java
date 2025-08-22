package org.example;

import java.util.Scanner;

public class A011 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();

        while(sc.hasNext()){

            for(int i=0;i<m;i++){
                int n=sc.nextInt();
                double sum = 0.0;

                for(int j=1;j<=n;j++){
                   sum+=(j%2==0?-1.0:1.0)/j;
                }

                System.out.printf("%.2f\n",sum);
            }

        }
    }
}
