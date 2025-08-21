package org.example;
import java.util.Scanner;
public class A008 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n= sc.nextInt();
            double[] numbers=new double[n];
            int positiveCounts =0;
            int negativeCounts =0;
            int zeroCounts=0;
            if(n!=0){
                for(int i=0;i<n;i++){
                    numbers[i]=sc.nextDouble();
                 if(numbers[i]>0){
                     positiveCounts++;
                 } else if (numbers[i]<0) {
                     negativeCounts++;
                 }else{
                     zeroCounts++;
                 }
                }
                System.out.println(negativeCounts+" "+zeroCounts+" "+positiveCounts);
            }else{
                break;
            }
        }
    }
}
