package org.example;
import java.util.Scanner;
public class A032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int triangle[][] = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                    if(j == 0||j == i){
                        triangle[i][j] = 1;
                    }else{
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i -1][j];
                    }

                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j]);
                    if (j < i) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

