package Basics;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter diagonal1");
        int diagonal1 = in.nextInt();
        System.out.println("Enter diagonal2");
        int diagonal2 = in.nextInt();
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("The area of triangle");
        System.out.println(area);
    }
}
