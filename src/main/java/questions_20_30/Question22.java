package questions_20_30;

public class Question22 {
    public static void main(String[] args) {
        String str = "example.com";
        System.out.println(getLengthLogic(str));
        System.out.println(getLength(str));
    }
    public static int getLengthLogic(String string){
        int count = 0;
        for(int i = 0; i < string.length();i++){
            count++;
        }
        return count;
    }
    public static int getLength(String string){
        return string.length();
    }

}
