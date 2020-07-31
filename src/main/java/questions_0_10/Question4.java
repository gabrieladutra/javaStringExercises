package questions_0_10;

public class Question4 {
    public static void main(String[] args) {

        System.out.println(countUnicode("w3resource.com", 0, 11));
    }
    public static int countUnicode(String str, int beginIndex, int endIndex){
        System.out.println("Original String : " + str);
        return  + str.codePointCount(beginIndex,endIndex);
    }
}
