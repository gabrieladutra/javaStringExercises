package questions_0_10;

public class Question2 {
    public static String getUnicodeChar(String str, int index) {
        System.out.println("Original String : " + str);
        return "Character(unicode point) = " + str.codePointAt(index);
    }
}
