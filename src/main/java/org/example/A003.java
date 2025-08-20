package org.example;

import java.util.Scanner;

public class A003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double a=sc.nextDouble();
            if(a<0){
                System.out.printf("%.2f\n",-a);
            }else{
                System.out.printf("%.2f\n",a);
            }
        }
    }
}
