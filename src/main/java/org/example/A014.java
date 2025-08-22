package org.example;
import java.util.Scanner;
public class A014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] score=new int[n];

        int max=0;
        int min=100;
        int sum=0;
        while (sc.hasNext()){
            for(int i=0;i<n;i++){
                score[i]=sc.nextInt();
                sum+=score[i];
              if(score[i]>max){
                  max=score[i];
              }
              if(score[i]<min){
                    min=score[i];
              }

            }
            double avg = (sum - max - min)*1.0/(n - 2);
            System.out.printf("%.2f%n", avg);
        }


    }

}
