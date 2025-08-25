package org.example;
import java.util.Scanner;
public class A019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] numbers=new int[n];
            int m=sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }

            for(int i=0;i<n;i++){
                numbers[i]=sc.nextInt();
            }

            int i=0;
            while (i < n && numbers[i] < m) {
                System.out.print(numbers[i] + " ");
                i++;
            }

            System.out.print(m);
            while (i < n) {
                System.out.print(" " + numbers[i]);
                i++;
            }
            System.out.println();
        }

    }
}
