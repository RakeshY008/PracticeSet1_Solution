package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Gender:");
        String BABU = myObj.next();
        BABU = BABU.toUpperCase();
        System.out.println("Enter Your AGE : ");
        int SONA = myObj.nextInt();
        if (BABU == "MALE") {
            if (SONA > 0 & SONA < 59) {
                System.out.println("8.4%");
            } else if (SONA > 58 & SONA < 101) {
                System.out.println("10.5%");
            }
        } else if (BABU == "FEMALE") {
            if (SONA > 0 & SONA < 59) {
                System.out.println("8.2%");
            } else if (SONA > 58 & SONA < 101) {
                System.out.println("9.2%");
            }
        }

    }
}
