package questions_0_10;

public class Question3 {
    public static int getCharPoint(String str, int index) {
        System.out.println("Original String : " + str);
        return +str.codePointBefore(index);
    }

}
