package org.example;
import java.util.Scanner;
public class A015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();

            int count=0;
            int sum=0;

            for(int i=1;i<=n;i++){
                int number=2*i;
                sum+=number;
                count++;

                if(count==m||i==n){
                    System.out.print(sum / count+" ");
                    sum = 0;
                    count = 0;
                }
            }
            System.out.println();
        }

    }
}
