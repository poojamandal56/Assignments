package Basics;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number One");
        int number1 = in.nextInt();
        System.out.println("Enter Number Two");
        int number2 = in.nextInt();
        int sum = Math.addExact(number1,number2);
        System.out.println(sum);

    }
}
