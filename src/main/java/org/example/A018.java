package org.example;
import java.util.Scanner;
public class A018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){

            int[] cows=new int[55];

            cows[1]=1;
            cows[2]=2;
            cows[3]=3;

            for(int i=4;i<55;i++){
                cows[i]=cows[i-1]+cows[i-3];
            }

            int n=sc.nextInt();
            if(n==0){
                break;
            }
            System.out.println(cows[n]);
        }
    }
}
