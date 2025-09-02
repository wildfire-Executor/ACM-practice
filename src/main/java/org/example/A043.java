package org.example;
import java.util.Scanner;
public class A043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] room = new int [51];
        room[1] = 1;
        room[2] = 1;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = 3; j < 50; j ++){
                room[j] = room[j - 2] + room[j - 1];
            }

            System.out.println(room[b - a + 1]);
        }
    }
}
