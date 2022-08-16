package Basics;

import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n;
            System.out.println("Enter input");
            n = in.nextInt();
        }
        System.out.println("sum is" + " " + sum);
    }
}