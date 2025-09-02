package org.example;
import java.util.Scanner;
public class A040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] dp = new int[41];
            dp[1] = 1;
            dp[2] = 1;
            for(int i = 3; i < 41; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            for (int i = 0; i < n; i++) {
                int M = sc.nextInt();
                System.out.println(dp[M]);
            }


        }
    }
}
