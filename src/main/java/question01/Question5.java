package question01;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(compare("This is Exercise 1","This is Exercise 2"));
    }
    public static String compare(String firstStr, String secondStr) {
        System.out.println("String 1: " + firstStr);
        System.out.println("String 2: " + secondStr);

        if (firstStr.length() <= secondStr.length()) {
        return "\"" + firstStr + " is less than " + secondStr;
        } else
            return secondStr + " is less than " + firstStr;
    }
}
