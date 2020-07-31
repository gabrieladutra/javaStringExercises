package question12;

public class Question11 {
    public static void main(String[] args) {
        char[] array = new char[] {'1', '2', '3','4'};
        System.out.println(newChar(array));
     }
    public static String newChar(char[] ch){
        return String.copyValueOf(ch,1,3);
    }
}
