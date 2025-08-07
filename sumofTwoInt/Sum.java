package sumofTwoInt;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first num :");
        int num1=input.nextInt();
        System.out.print("Enter Second num:");
        int num2=input.nextInt();
        int sum =num1 + num2;
        System.out.println("Sum="+ sum);
    input.close();
    }
}
