package org.example;
import java.util.Scanner;
public class A002 {
    public static double PI=3.1415926;
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
        double r=sc.nextDouble();
        double result=((4.0/3.0)*PI*Math.pow(r,3));
        System.out.printf("%.3f\n",result);
    }
    }
}
