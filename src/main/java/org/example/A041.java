package org.example;
import java.util.Scanner;
public class A041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                int sheep = 3;
                for (int j = 0; j < a; j++) {
                    sheep = (sheep - 1) * 2;
                }

                System.out.println(sheep);
            }

        }
    }
}
