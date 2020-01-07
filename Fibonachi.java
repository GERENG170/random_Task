package com.company;
import java.util.Scanner;

public class Fibonachi {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первые ДВА числа: ");
        int x0 = scan.nextInt();
        int x1 = scan.nextInt();
        int x2;
        for (int i = 0; i < 15; i++) {
            x2 = x0 + x1;
            System.out.println(x2 + " ");
            x0 = x1;
            x1 = x2;
        }
        System.out.println();









    }
}
