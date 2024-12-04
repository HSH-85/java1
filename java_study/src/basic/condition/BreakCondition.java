package basic.condition;

public class BreakCondition {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++) {
            if (i==5) {
                return;
            }
            sum += i;//1부터 10까지 더하는 루프
        }
        System.out.println("sum = "+sum);//결과출력
    }
}
