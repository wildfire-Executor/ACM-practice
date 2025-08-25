package org.example;
import java.util.Scanner;
import java.lang.Math;
public class A022 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){

            int m=sc.nextInt();
            int n=sc.nextInt();
            int currentMax=0;
            int maxOrigin=0;
            int maxRow=0;
            int maxCol=0;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){

                    int MM_score=sc.nextInt();
                    int MM_score_ab=Math.abs(MM_score);

                    if(MM_score_ab>currentMax) {
                        currentMax = MM_score_ab;
                        maxOrigin = MM_score;
                        maxRow = i;
                        maxCol = j;
                    }else if(MM_score_ab==currentMax){
                        if(i<maxRow){
                            maxRow=i;
                        }else if(j<maxCol){
                            maxCol=j;
                        }
                    }
                }
            }
            System.out.println((maxRow+1)+" "+(maxCol+1)+" "+maxOrigin);
        }
    }
}
