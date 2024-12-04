package basic.exam;

public class 문제1 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
        i = 0;
        while (i < 10) {
            i++;
            if (i==6) {
                continue;
            }

            System.out.println(i);
        }
    }
}
