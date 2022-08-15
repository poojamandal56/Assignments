package Basics;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter breadth");
        int breadth = in.nextInt();
        double area = length * breadth;
        System.out.println("The area of rectangle");
        System.out.println(area);
    }
}