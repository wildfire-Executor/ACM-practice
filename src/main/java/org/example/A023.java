package org.example;
 import java.lang.Math;
 import java.util.Scanner;

public class A023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int scores[][] = new int[n][m];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m;j++){
                   scores[i][j] = sc.nextInt();
                }
            }

            double[] studentAverages = new double[n];
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += scores[i][j];
                }
                studentAverages[i] = sum / m;
            }

            double[] courseAverages = new double[m];
            for(int i = 0; i < m; i++){
                double sum = 0;
                for(int j = 0; j < n; j++){
                    sum += scores[i][j];
                }
                courseAverages[i]=sum / m;
            }

            int number = 0;
            for (int i = 0; i < n; i++) {
                boolean aboveAverage = true;
                for (int j = 0; j < m; j++) {
                    if (scores[i][j] < courseAverages[j]) {
                        aboveAverage = false;
                        break;
                    }
                }
                if (aboveAverage) {
                    number++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.printf("%.2f", studentAverages[i]);
                System.out.print(" ");
            }
            System.out.println();

            for (int j = 0; j < m; j++) {
                System.out.printf("%.2f", courseAverages[j]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println(number);
            System.out.println();
        }

    }
}


