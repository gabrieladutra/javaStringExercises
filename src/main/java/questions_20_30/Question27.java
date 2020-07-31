package questions_20_30;

public class Question27 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(substring(str));
    }

    public static String substring(String str) {
        return str.substring(10,25);
    }

    }