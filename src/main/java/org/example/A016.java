package org.example;
import java.util.Scanner;
public class A016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int[] string=new int[n];
            int min=0;
            for(int i=0;i<n;i++){
                string[i]=sc.nextInt();
                if(string[i]<string[min]){
                    min=i;
                }

            }
            int temp=string[0];
            string[0]=string[min];
            string[min]=temp;

            for (int i=0; i<n;i++) {
                System.out.print(string[i]+" ");
            }
            System.out.println();
        }
    }
    }

