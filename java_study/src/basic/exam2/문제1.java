package basic.exam2;

public class 문제1 {
    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;   //최댓값 위치
        int minIndex = 0;   //최솟값 위치

        for (int i = 1; i < arr.length; i++) {  //최댓값 구하기
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("최댓값은 "+max+"이고, 이 값은 "+(maxIndex+1)+"번째 수이다.");
        System.out.println("최댓값은 "+min+"이고, 이 값은 "+(minIndex+1)+"번째 수이다.");
    }
}
