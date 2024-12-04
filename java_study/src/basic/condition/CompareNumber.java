package basic.condition;

public class CompareNumber {
    public static void main(String[] args) {
        int intA=4;
        int intB=7;
        String result = "intA = " + intA + ", intB = " + intB;
        int intC;
        System.out.println(result);

        if (intA<intB){
            intC = intA;
            intA = intB;
            intB = intC;
        }
        result = "intA = " + intA + ", intB = " + intB;
        System.out.println(result);

    }
}
