package questions_20_30;

public class Question25 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(replaceString(str));

    }
    public static String replaceString(String str){
        return str.replace("d", "f");
    }
    public static int indexOfString(String str){
       return str.lastIndexOf(str);
    }
}
