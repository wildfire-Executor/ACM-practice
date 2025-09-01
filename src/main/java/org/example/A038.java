package org.example;
import java.util.Scanner;
public class A038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();

                if(s1+s2>s3&&s2+s3>s1&&s1+s3>s2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}
