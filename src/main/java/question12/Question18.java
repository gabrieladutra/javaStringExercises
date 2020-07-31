package question12;

public class Question18 {
    public static void main(String[] args) {
        System.out.println(getIdentifier("Python Exercises."));
    }
    public static String getIdentifier(String str){
        return "The hash for " + str + " is " + str.hashCode();
    }
}
