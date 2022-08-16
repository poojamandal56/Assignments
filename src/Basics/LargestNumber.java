package Basics;
//Take integer inputs till the user enters 0 and print the largest number from all
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int n = in.nextInt();
        n =1;
        int large=0;
        while (n!=0){
//            System.out.println("Enter Number");
//            int a = in.nextInt();
            System.out.println("Enter Another Number");
            int b = in.nextInt();
//            if(b>n){
//                large = b;
//            }
//            else {
//                 large = n;
//            }
            large = Math.max(b, n);

            System.out.println("Enter Another number");
            n = in.nextInt();
        }
        System.out.println(large);
    }
}
