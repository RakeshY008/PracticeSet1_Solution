package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Morni = scanner.nextInt();
        int Result = Sum(Morni);
        System.out.println(Result);
    }

    @Contract(pure = true)
    public static int Sum(int myEx) {
        int yourEx = 0;
        while (myEx != 0) {
            yourEx = yourEx + myEx % 10;
            myEx = myEx / 10;
        }
        return yourEx;

    }
}
