package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String Alp1 = myObj.next();
        String Alp2 = myObj.next();
        int x = Alp1.compareTo(Alp2);
        ;

        if (x > 0) {
            System.out.println(Alp2 + " " + Alp1);
        } else {
            System.out.println(Alp1 + " " + Alp2);
        }

    }
}
