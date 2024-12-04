package basic.exam;

import java.util.Scanner;

public class 문제13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (24 <= A || A < 0) {
            System.out.println("잘못 된 시간을 입력하였습니다.");
            return;
        }
        if (B >= 60 || B < 0) {
            System.out.println("잘못 된 시간을 입력하였습니다.");
            return;
        }
        if (C > 1000 || C < 0) {
            System.out.println("잘못 된 시간을 입력하였습니다.");
            return;
        }

        int tempA;
        int tempB;
        int tempH;
        int tempM;
        tempH = C / 60;
        tempA = A + tempH;
        tempM = C % 60;
        tempB = B + tempM;
        if (tempB >= 60) {
            tempB = tempB - 60;
            tempA = tempA + 1;
        }
        if (tempA >= 24) {
            tempA = tempA - 24;
        }
        System.out.println(tempA+" "+tempB);
    }
}
