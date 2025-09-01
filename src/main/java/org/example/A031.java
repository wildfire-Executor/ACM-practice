package org.example;
import java.util.Scanner;
public class A031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            if(N == 0){
                System.out.println("0");
                continue;
            }

            boolean isNegative = false;
            if(N < 0){
                isNegative = true;
                N = -N;
            }

            StringBuilder sb =new StringBuilder();

            while(N > 0){
                int temp = N % R;
                if(temp > 0){
                    sb.append(temp);
                }else{
                    sb.append((char)('A' + temp - 10));
                }
                N = N / R;
            }

            if(isNegative){
                sb.append("-");
            }

            System.out.println(sb.reverse().toString());
        }
    }
}
