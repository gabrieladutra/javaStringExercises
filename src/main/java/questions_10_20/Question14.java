package questions_10_20;

public class Question14 {
    public static void main(String[] args) {
        System.out.println(equalsIgnoreSome("Stephen Edwin King", "stephen edwin king"));
    }
    public static boolean equalsIgnoreSome(String str, String str2){
        return str.equalsIgnoreCase(str2);
    }
}
