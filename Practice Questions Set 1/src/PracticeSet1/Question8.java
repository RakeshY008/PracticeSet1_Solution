package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        int age = scanner.nextInt();
        if (gender == "male") {
            if (age <= 58 && age >= 1) {
                System.out.println("8.4%");
            } else {
                System.out.println("10.5%");
            }

        } else {
            if (age <= 58 && age >= 1) {
                System.out.println("8.2%");
            } else {
                System.out.println("9.2%");
            }
        }
        scanner.close();
    }
}

