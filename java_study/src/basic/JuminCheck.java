package basic;

public class JuminCheck {
    public static void main(String[] args) {
        int[] jumin = {1, 4, 0, 4, 1, 6, 4, 1, 4, 0, 8, 1, 8};
        int[] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;
        int sum2 = 0;
        Math.random();

        for (int i = 0; i <= 11; i++) {
            sum = sum + (jumin[i] * check[i]);
        }
        int result = (11 - (sum % 11)) % 10;
        if (result == jumin[12]) {
            System.out.println("일치합니다.");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
