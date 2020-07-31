package questions_10_20;

public class Question16 {
    public static void main(String[] args) {

        String str = "This is a sample String";
        System.out.println(getNewString(str));
    }
    public static String getNewString(String str){
        byte[] b  = str.getBytes();
        String newString = new String(b);
            return "The new string is equal to "+ newString;
    }
}
