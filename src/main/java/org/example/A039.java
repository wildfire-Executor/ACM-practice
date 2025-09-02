package org.example;
import java.util.Scanner;
public class A039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                int suma = 0;
                if(a > 1){
                    suma = 1;
                   for(int j = 2; j*j < a; j++){
                       if(a % j==0){
                           suma += j;
                       }
                       if (j != a / j) {
                           suma += a / j;
                       }
                   }
                }

                int sumb = 0;
                if(b > 1){
                    sumb = 1;
                    for(int j = 2; j*j < b; j++){
                        if(b % j==0){
                            sumb += j;
                        }
                        if (j != b / j) {
                            suma += b / j;
                        }
                    }
                }
                if(suma == b&&sumb == a){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}


