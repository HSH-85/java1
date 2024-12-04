package basic.exam;

import java.util.Scanner;

public class 문제15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("아이디 : ");
            String ID = scanner.next();
            System.out.print("비밀번호 : ");
            int PW = scanner.nextInt();
            //로그인 확인 용도의 변수
            boolean login = false;


            if ("admin".equals(ID) && PW == 1111) {
                while (true) {
                    System.out.println("======================");
                    System.out.println("메뉴를 선택하세요");
                    System.out.println("======================");
                    System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기 4. 종료하기");

                    int A = scanner.nextInt();
                    switch (A) {
                        case 1:
                            System.out.println("안녕하세요");
                            break;
                        case 2:
                            System.out.println("삐끼삐끼 춤입니다.");
                            break;
                        case 3:
                            System.out.println("맛나게 먹었습니다.");
                            break;
                        case 4:
                            System.out.println("프로그램을 종료합니다.");
                            return;
                    }
                }

            } else {
                System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
            }
        }

    }
}