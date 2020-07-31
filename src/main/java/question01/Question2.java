package question01;

public class Question2 {
    public static void main(String[] args) {

        System.out.println(getUnicodeChar("w3resource.com", 3));
    }
    public static String getUnicodeChar(String str, int index){
        System.out.println("Original String : " + str);
        return "Character(unicode point) = " + str.codePointAt(index);
    }
}
