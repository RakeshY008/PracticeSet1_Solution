
package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String KWM = "Welcome, ";
        Scanner scanner = new Scanner(System.in);
        String shizuka = scanner.next();

        System.out.println(KWM + "" + shizuka + "!");

        scanner.close();
    }
}
