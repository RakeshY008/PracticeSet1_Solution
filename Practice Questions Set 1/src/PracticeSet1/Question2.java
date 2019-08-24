package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        var num1 = myObj.nextInt();
        var num2 = myObj.nextInt();
        var Sum = num1 + num2;
        var Sub = num1 - num2;
        var product = num1 * num2;
        var division = num1 / num2;
        var Module = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + Sum + "\n" + num1 + " - " + num2 + " = " + Sub + "\n" + num1 + " * " + num2 + " = " + product + "\n" + num1 + " / " + num2 + " = " + division + "\n" + num1 + " % " + num2 + " = " + Module);

    }
}
