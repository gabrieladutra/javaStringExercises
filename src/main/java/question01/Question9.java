package question01;

public class Question9 {
    public static void main(String[] args) {

        System.out.println(compare("Example.com", "example.com"));
    }
    public static boolean compare(String str, String str2){
        return str.contentEquals(str2);
    }
}
