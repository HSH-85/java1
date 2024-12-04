package basic.exam;

public class 문제5 {
    public static void main(String[] args) {
        int money = 3780;
        int th=1000;//1000원 단위
        int fh=500;//500원 단위
        int h=100;//100원 단위
        int t=10;//10원 단위
        int temp;

        th = money / th;
        temp = money - (th * 1000);
        System.out.println("1000원 : "+th+"개");
        System.out.println("남은 금액 : "+temp+"원");

        fh = temp / fh;
        temp=temp-(fh*500);
        System.out.println("500원 : "+fh+"개");
        System.out.println("남은 금액 : "+temp+"원");

        h = temp / h;
        temp = temp - (h * 100);
        System.out.println("100원 : "+h+"개");
        System.out.println("남은 금액 : "+temp+"원");

        t = temp / t;
        temp = temp - (t * 10);
        System.out.println("10원 : "+t+"개");
        System.out.println("남은 금액 : "+temp+"원");

    }
}
