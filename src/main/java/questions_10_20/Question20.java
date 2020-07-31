
package questions_10_20;

public class Question20 {
    public static void main(String[] args) {

        String a = "Java Exercises";
        String b = new StringBuffer("Java").append(" Exercises").toString();
        String c = b.intern();
        System.out.println(getCanonicalRepresentation(a,c));
    }

    public static boolean getCanonicalRepresentation(String str1, String str2) {
       return str1.intern().equals(str2.intern());
    }
}
