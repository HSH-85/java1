package basic.exam2;

public class 문제2 {
    public static void main(String[] args) {
        int[] count = new int[13];

        for (int i=0 ; i < 36000; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            count[sum]++;
        }
        for (int sum = 2; sum <= 12; sum++) {
            double temp = (double) count[sum] / 36000;
            System.out.println(sum+ " : "+count[sum]+"("+temp+")");
        }
    }
}
