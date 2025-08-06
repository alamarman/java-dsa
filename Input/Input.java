package Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter roll no.:");
        int rollno=input.nextInt();
         System.out.println("your Roll number is"+rollno);
         input.close();
    }
}
