package basic.arrayTest;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
//        System.out.println(nums[3]);
        System.out.println("=="+nums.length+"==");
        for (int i = 0; i < nums.length; i++) {        //. 찍으면 길이 구하는 함수가 나옴 ()가 들어가는 함수들은 뭔가 기능을 수행하는것들, length와 배열의 총갯수는 1차이 나니까 등호쓰면 안됨
            System.out.println(nums[i]);
        }
    }
}
