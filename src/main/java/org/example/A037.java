package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class A037 {//贪心算法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            int[][] programs = new int[n][2];

            for(int i = 0; i < n; i++){
                programs[i][0] = sc.nextInt();
                programs[i][1] = sc.nextInt();
            }

            Arrays.sort(programs,(a,b)->a[1]-b[1]);
            int count = 0;
            int endTime = -1;
            for(int i = 0; i < n; i++){
                if(programs[i][0] >= endTime){
                    count ++;
                    endTime = programs[i][1];
                }
            }
            System.out.println(count);
        }
    }
}
