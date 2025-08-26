package org.example;
import java.util.Scanner;
public class A028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = sc.nextInt();
            }
            int result = numbers[0];
            for(int i = 1; i < n; i++){
                int current = numbers[i];

                int a = result;
                int b = numbers[i];

                while(b != 0){
                    int temp = b;
                    b = a%b;
                    a = temp;
                }
                int gcd = a;
                if(gcd == 0){
                    result = 0;
                }else{
                    result = Math.abs(result * current / gcd);
                }
            }
            System.out.println(result);
        }
    }
}
