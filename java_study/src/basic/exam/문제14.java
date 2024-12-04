package basic.exam;

import java.util.Scanner;

public class 문제14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int price = 0;

        if (A > 6 || A <= 0 || B > 6 || B <= 0 || C > 6 || C <= 0) {
            System.out.println("잘못 된 주사위 눈을 입력하였습니다.");
        }

        //같은 눈 3개 나와는 경우
        if (A == B && B == C) {
            price = 10000 + (A * 1000);
        }
        //같은 눈 2개 나오는 경우
        else if (A == B || B == C || A == C) {
            if (A == B) {
                price = 1000 + (100 * A);
            }
            if (B == C) {
                price = 1000 + (100 * B);
            }
            if (A == C) {
                price = 1000 + (100 * C);
            }
            //모두 다른 눈이 나오는 경우
        } else {
            if (A > B && A > C) {
                price = A * 100;
            }
            if (B > A && B > C) {
                price = B * 100;
            }
            if (C > A && C > B) {
                price = C * 100;
            }
        }
        System.out.println(price);
    }
}
