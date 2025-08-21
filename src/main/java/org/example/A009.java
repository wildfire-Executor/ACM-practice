package org.example;
import java.util.Scanner;
import java.lang.Math;
public class A009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            double init=n;
            double sum=0;
            for(int i=0;i<m;i++){
               sum+=init;
               init=Math.sqrt(init);
            }
            System.out.printf("%.2f\n",sum);
        }
    }
}
