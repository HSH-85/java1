package basic.exam;

public class 문제2 {
    public static void main(String[] args) {
        int i;
        for (i=10; i >= 1; i--) {
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }
        i = 11;
        do {
            i--;
            if (i==3) {
                continue;
            }
            System.out.println(i);

        } while (i>1);
    }
}
