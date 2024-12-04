package basic;

public class OperationEx03 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(1 == 1);
        System.out.println(1 != 1);
        System.out.println(2 >= 1);
        //논리연산자
        //and(&&), or(||), not(!)
        //3<4<5
        System.out.println(3 < 4 && 4 < 5);

        String pass = "합격";
        String fail = "불합격";
        System.out.println(pass+" / "+fail);

        String equals = 3 == 4 ? "같아" : "틀려";
        System.out.println(equals);
        int aaa = 3 == 4 ? 0 : 1;

        //성적을 국어점수(kor)라는 변수에 담아요 --51
        //영어점수(eng) --80
        //조건1. 두 점수 중 한가지만 60이상이면 합격
        //조건1 결과 : 합격
        //조건2. 두 점수 모두 60점 넘으면 합격
        //조건2 결과 : 불합격
        //출력조건은
        int kor, eng;
        kor = 51;
        eng = 80;

        System.out.println(kor >= 60 || eng >= 60 ? "조건 1 결과 : " + pass : fail); // 결과가 남지않음

        System.out.println(kor >= 60 && eng >= 60 ? "조건 2 결과 : " + pass : "조건 2 결과 : "+fail);

        String con1 = kor >= 60 || eng >= 60 ? pass : fail;
        con1 = "조건 1 결과 : " + con1;
        System.out.println(con1); //결과가 저장됨, 나중에 쓸 수도 있음
        String con2 = kor >= 60 && eng >= 60 ? pass : fail;
        System.out.println("조건 2 결과 : "+con2);
        int i = 1;
        i = i + 1;
        i += 1;
        i++;
        //++i; 사용안함
        System.out.println("i = "+ i);
        }


    }