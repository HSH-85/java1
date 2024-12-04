package basic.exam;

import java.util.Scanner;

public class 문제7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        if (A > B) {
            int temp;
            temp = A;
            A = B;
            B = temp;
        }

        for (int i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
