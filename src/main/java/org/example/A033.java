package org.example;
import java.util.Scanner;
public class A033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 0;i < n; i++){
                int AH = sc.nextInt();
                int AM = sc.nextInt();
                int AS = sc.nextInt();
                int BH = sc.nextInt();
                int BM = sc.nextInt();
                int BS = sc.nextInt();

                int NH = AH + BH;
                int NM = 0;
                int NS = 0;
                if(AM + BM >= 60){
                    NH += 1;
                    NM = (AM + BM) % 60;
                }else{
                    NM = AM + BM;
                }
                if(AS + BS >= 60){
                    NM += 1;
                    NS = (AS + BS) % 60;
                }else{
                    NS = AS + BS;
                }
                System.out.println(NH + " " + NM + " " + NS);
            }

        }
    }
}
