package questions_20_30;

public class Question26 {
    public static void main(String[] args) {
        String str = "Red is favorite color. starts with Red?";
        System.out.println(startsWith(str, "Red"));
    }
public static boolean startsWith(String str, String search){
    return str.startsWith(search);
}
}
