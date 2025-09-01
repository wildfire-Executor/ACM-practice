package org.example;
import java.util.Scanner;
public class A036 {//鞋带公式
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] x = new int[n];
            int[] y = new int[n];

            for(int i = 0; i < n; i ++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < n; i++) {
                int next = (i + 1) % n;
                sum1 +=  x[i] * y[next];
                sum2 +=  y[i] * x[next];
            }
            double area = Math.abs(sum1 - sum2) / 2.0;
            System.out.printf("%.1f\n", area);
        }
    }
}
