package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char Ex = scanner.next().charAt(0);
        if ((int) Ex >= 48 && (int) Ex <= 57) {
            System.out.println("digit");
        } else if ((Ex >= 65 && Ex <= 90) || (Ex >= 97 && Ex <= 122)) {
            System.out.println("alphabet");
        } else {
            System.out.println("special character");
        }
        scanner.close();

    }
}
