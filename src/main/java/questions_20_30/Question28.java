package questions_20_30;

public class Question28 {
    public static void main(String[] args) {
        String str = "Java Exercises.";
        System.out.println(toCharArrayLogic(str));
    }
    public static char[] toCharArray(String str){
        return str.toCharArray();
    }
    public static char[] toCharArrayLogic(String str){
        char[] stringChar = new char[str.length()];
        for(int i = 0; i< str.length(); i++){
           stringChar[i] = str.charAt(i);
        }
        return  stringChar;
    }
}
