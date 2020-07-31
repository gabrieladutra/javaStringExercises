package questions_0_10;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(concatenate("PHP Exercises and", "Python Exercises"));
    }
    public static String concatenate(String str, String str2){
        return str.concat(" " + str2);
    }
}

