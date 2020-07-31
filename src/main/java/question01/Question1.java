package question01;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(getCharacter("Java Exercises!", 0));
    }

    public static String getCharacter(String str, int index) {
        System.out.println("Original String = " + str);
        return "The character at position " + index + " is " + str.charAt(index);

    }
}
