package questions_20_30;

public class Question24 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(replaceWithF(str));
    }
    public static String replaceWithF(String str){
        return str.replace("d", "f");
    }
}
