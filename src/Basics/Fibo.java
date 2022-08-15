package Basics;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = in.nextInt();
//        System.out.println("enter number");
        int count = 2;
        while (count<n){
            int temp = b;
             b = b + a;
             a = temp;
             count++;
        }
        System.out.println("Fibonacci Value is");
        System.out.println(b);
    }
}
