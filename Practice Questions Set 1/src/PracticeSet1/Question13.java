package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question13 {

    public static void Revers(int DBC) {

        int reversenum = 0;
        int EX = DBC;

        // Syntax to find Reverse of any number.
        while (DBC != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + DBC % 10;
            DBC = DBC / 10;
        }

        // Statements to check if number is Palindrome.

        if (EX == reversenum) {
            System.out.println(EX + " is a palindrome.");
        } else System.out.println(EX + " is not a palindrome.");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MyObj = scanner.nextInt();

        Revers(MyObj);  //method call
    }
}
