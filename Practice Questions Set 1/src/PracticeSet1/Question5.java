package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        var Check = myObj.nextDouble();

        System.out.println(((Check % 2 == 0) ? "Even" : "Odd"));

    }
}
