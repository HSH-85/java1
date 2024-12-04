package basic.mypackage;

import java.io.PrintStream;

public class OperationEx02 {
    public static void main(String[] args) {
        //상수 선언
        final double PI = 3.14;

        int a = 8;

        long b = 20;

        System.out.println(a + b);

        //b의 값을 5로 변경하고
        b = 5;

        //a와 b를 곱해서 출력한다.
        long x = a * b;

        System.out.println("a * b = " + x);

        //a / b = 결과를 result에 담아서 출력
        double result = (double) a / b;
        System.out.println("a / b = "+ result);

        int numberA = 3;
        int numberB = 7;
        int answer = numberA % numberB;
        System.out.println(numberA+" 을 "+numberB+" 로 나눈 나머지는? " + answer + "입니다.");

    }
}
