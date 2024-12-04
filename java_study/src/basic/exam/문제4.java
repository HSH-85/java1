package basic.exam;

public class 문제4 {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        int result = 0;
        for (int m = 1; m <= n; m++){
            result+=m;
            sum+=result;
        }
        System.out.println(sum);
    }
}