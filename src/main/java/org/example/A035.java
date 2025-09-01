package org.example;
import java.util.Scanner;
public class A035 {//快速幂
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0){
                break;
            }
            if (B == 0) {
                System.out.println(1);
                continue;
            }
            long base = A;
            long exponent = B;
            long result = 1;
            long mod = 1000;
            base %= mod;
            while(exponent > 0){
                if((exponent & 1) == 1){
                    result = (result*base)%mod;
                }
                base = (base*base)%mod;
                exponent >>= 1;
            }
            System.out.println(result);
        }
    }
}
