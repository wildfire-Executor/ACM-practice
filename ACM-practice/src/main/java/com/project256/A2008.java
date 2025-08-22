package com.project256;

import java.util.Scanner;

/**
 * @author Xingchen.Lin
 * @date 2025/8/22 15:16
 */
public class A2008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int z = 0;
            int ne = 0;
            int po = 0;
            for (int i = 0; i < n; i++) {
                float input = scanner.nextFloat();
                if (input == 0) {
                    z++;
                }
                if (input < 0) {
                    ne++;
                }
                if (input > 0) {
                    po++;
                }
            }
            System.out.printf("%d %d %d\n", ne, z, po);
        }

    }

}
