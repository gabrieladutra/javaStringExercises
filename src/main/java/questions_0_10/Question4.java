package questions_0_10;

public class Question4 {
    public static void main(String[] args) {

        System.out.println(countUnicode("w3resource . com", 0, 11));
    }
    public static String countUnicode(String str, int beginIndex, int endIndex){
        System.out.println("Original String : " + str);
        return "Code point count = " + str.codePointCount(beginIndex,endIndex);
    }
}
