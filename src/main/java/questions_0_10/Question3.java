package questions_0_10;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(getCharPoint("w3resource.com" , 1));

    }
    public static String getCharPoint(String str, int index){
    System.out.println("Original String : " + str);
        return "Character(unicode point) = " + str.codePointBefore(index);
    }
}
