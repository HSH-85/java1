package basic.condition;

public class DoLoopTest {
    public static void main(String[] args) {
        //while(조건) ---하는 동안
        //Do(실행문) ~ While(조건) ---(하는 동안 해라)
        //while 구문
        int i = 1;
        int sum = 0;
        while (i<=10) {
            sum+=i;
            i++;
            System.out.println(i);
            System.out.println("출력");
        }

        i=1;
        sum=0;
        do {
            sum+=i;
            i++;
        } while (sum<=10);
        System.out.println(sum);
    }
}
