package Basics;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base");
        int base = in.nextInt();
        System.out.println("Enter height");
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle");
        System.out.println(area);

    }
}
