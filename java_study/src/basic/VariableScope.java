package basic;

//beans
class HuhSungHun{
    static String address = "서울";
    String name = "허성훈";
    int age = 20;
    boolean smart = false;
}

public class VariableScope {

    static int b = 4;

    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        HuhSungHun huhSungHun = new HuhSungHun(); //new로 만들어진건 heap에 생성
        System.out.println(huhSungHun.age);     //age는 class 안에 있어서 huhsunghun에
        System.out.println(HuhSungHun.address); //address는 static이라서 HuhSungHun에
//        System.out.println(HuhSungHun.name);
//        System.out.println(HuhSungHun.);
    }
}
