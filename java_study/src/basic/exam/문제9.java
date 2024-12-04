package basic.exam;

import java.util.Scanner;

public class 문제9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int a = star; a >= 1; a--) {
            for (int b = a; b >= 1; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
