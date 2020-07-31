package questions_0_10;

public class Question10 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("example.com");

        System.out.println(compareStrBuffer("example.com",str));
    }
    public static boolean compareStrBuffer(String str, StringBuffer str2){
        return str.contentEquals(str2);

    }
}
