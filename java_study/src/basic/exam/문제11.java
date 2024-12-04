package basic.exam;

import java.util.Scanner;

public class 문제11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score= scanner.nextInt();

        if (0 > score || score > 100) {
            System.out.println("잘못 된 점수를 입력하셨습니다.");
            return;
        }

        int temp = score / 10;
        switch (temp) {
            case 10 :
                System.out.println("A");
                break;
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
