package basic.arrayTest;

public class ArrayEx02 {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 4;
        nums[1] = 5;
        for (int i = 0; i < nums.length; i++) {        //. 찍으면 길이 구하는 함수가 나옴 ()가 들어가는 함수들은 뭔가 기능을 수행하는것들, length와 배열의 총갯수는 1차이 나니까 등호쓰면 안됨
            System.out.println(nums[i]);
        }

        //advanced for 구문
        for (int x : nums) {    //int 타입인 x 에다가 nums에서 하나씩 꺼내서 집어넣어준다. 길이 몇인지 몰라도 된다 // 지가 알아서 맨 앞에서부터 하나씩 넣어줌
            System.out.println(x);
        }
    }
}
