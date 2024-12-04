package basic.mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class JuminCheck2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호 13자리를 연속해서 입력하시오.(-제외)");
        String[] strJumin= scanner.next().split("");//입력받은 문자열을 개별문자열로 나누어 배열에 넣음.


        //정수 담는 연속배열 13개를 선언
        int[] jumin = new int[strJumin.length]; //13개가 아닌 입력받은 배열의 길이로 동적으로 생성
        for (int i = 0; i < strJumin.length; i++) {
            jumin[i] = Integer.parseInt(strJumin[i]);   //문자 배열을 정수배열로 변환
        }//각 자릿수에다가 2,3,4,5,6,7,8,9,2,3,4,5 곱하기
        for (int i = 0; i < jumin.length - 1; i++) {
            if (i < 8) {
                result = result + (jumin[i] * (i + 2));
            } else {
                result = result + (jumin[i] * (i - 6));
            }
        }
        //결과 = 11로 나눈 나머지
        //11-결과
        //결과를 10으로 나눈 나머지
        result = (11 - (result % 11)) % 10;
        if (result == jumin[12]) {
            System.out.println("올바른 주민번호입니다.");
        } else {
            System.out.println("잘못 된 주민번호입니다.");
        }

        System.out.println(Arrays.toString(jumin));
    }
}
