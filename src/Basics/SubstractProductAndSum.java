package Basics;

import java.util.Scanner;

public class SubstractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = n % 10;
//        System.out.println(a);
//        int b = (n/10)%10;
//        System.out.println(b);
//        int c = ((n/10)/10)%10;
//        System.out.println(c);
//        int product = a * b * c;
//        int sum = a + b + c;
//        int result = product - sum;
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while (n>0){
            int a = n%10;
             product *= a;
             sum += a;
             n = n/10;
//           int result = product - sum;

        }
        int result = product - sum;
        System.out.println(result);
    }
}
