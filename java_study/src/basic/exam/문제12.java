package basic.exam;

import java.util.Scanner;

public class 문제12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (24 <= H || H < 0) {
            System.out.println("잘못 된 시간을 입력하였습니다.");
            return;
        }
        if (M >= 60 || M < 0) {
            System.out.println("잘못 된 시간을 입력하였습니다.");
            return;
        }
        int tempH, tempM;
        tempM = M - 45;
        tempH = H;
        if (tempM < 0) {
            tempM = tempM + 60;
            tempH = tempH - 1;
        }
        if (tempH < 0) {
            tempH = tempH + 24;
        }
        System.out.println(tempH+" "+tempM);

    }
}
