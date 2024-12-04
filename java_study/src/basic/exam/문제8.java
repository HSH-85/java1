package basic.exam;

import java.util.Scanner;

public class 문제8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int a=1; a <= star; a++){
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String strStar = "";
        for (int a = 1; a <= star; a++) {
            strStar = strStar + "*";
        }

    }
}
