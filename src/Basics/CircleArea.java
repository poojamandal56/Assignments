package Basics;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter the value of Radius");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
