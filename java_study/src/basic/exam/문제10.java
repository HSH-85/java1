package basic.exam;

import java.util.Scanner;

public class 문제10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();

        for (int a = 1; a <= 9; a++) {
            int b;
            b = N * a;
            System.out.println(N + " x " + a + " = " + b);
        }
    }
}
