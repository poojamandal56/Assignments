package Basics;

import java.util.Scanner;
//Input a number and print all the factors of that number
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                //if n is divided by i then i is the factor
                System.out.print(i+" ");
            }
            i++;

        }
    }
}
