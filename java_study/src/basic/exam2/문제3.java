package basic.exam2;

public class 문제3 {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 5, 3};
        int minIndex;
//arr[0]이랑 arr[1~4]까지 한번씩 비교
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;   //가장 작은 값의 인덱스 저장
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {   //맨 앞의 수와 그 뒤의 수들을 비교해서
                    minIndex = j;               //가장 작은 수의 인덱스를 저장
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.print((i+1)+"단계 : ");
            for (int k=0; k < arr.length; k++) {
                System.out.print(arr[k]+"  ");
            }
            System.out.println();

        }
    }
}