package org.example;
import java.util.Scanner;
public class A004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double score=sc.nextDouble();
            if(score>=0&&score<=100){
                if (score >= 90) {
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else if (score >= 70) {
                    System.out.println("C");
                } else if (score >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }else{
                System.out.println("Score is error!");
            }
        }
    }
}
