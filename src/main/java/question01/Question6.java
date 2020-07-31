package question01;

public class Question6 {
    public static void main(String[] args) {

        System.out.println(compareIgnoringCase("This is exercise 1", "This is exercise 1"));
    }
    public static String compareIgnoringCase(String str, String str2){
       if (str.compareToIgnoreCase(str2) < 0){
           return str + " is less than " + str2;
       } else if (str.compareToIgnoreCase(str2) == 0) {
           return str + " is equal than " + str2;
       } else  return  str + " is bigger than " + str2;
    }
}