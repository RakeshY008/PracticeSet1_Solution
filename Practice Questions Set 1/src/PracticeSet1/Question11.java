
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */
package PracticeSet1;

import java.util.Scanner;

public class Question11 {
    public static void Prime(int xDbc) {
        int NO = 0, pNum = 0;
        pNum = xDbc / 2;
        if (xDbc == 0 || xDbc == 1) {
            System.out.println(xDbc + " is not a prime number");
        } else {
            for (int L = 2; L <= pNum; L++) {
                if (xDbc % L == 0) {
                    System.out.println(xDbc + " is not a prime number");
                    NO = 1;
                    break;
                }
            }
        }
        if (NO == 0) {
            System.out.println(xDbc + " is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NUMBER = scanner.nextInt();
        Prime(NUMBER);
    }

}
