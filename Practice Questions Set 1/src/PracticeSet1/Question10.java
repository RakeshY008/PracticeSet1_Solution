package PracticeSet1;
/*
    @ Author: Rakesh Yadav
    @ Version: 12.0.2
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ClUB = scanner.nextInt();
        ClUB = ClUB + 1;

        int Pubs = scanner.nextInt();

        for (int i = ClUB; ClUB <= Pubs; ClUB++) {
            if (ClUB % 2 == 0) {
                System.out.println(ClUB + " \b");
            }
        }
    }
}
