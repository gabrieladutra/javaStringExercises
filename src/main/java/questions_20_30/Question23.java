package questions_20_30;

public class Question23 {
    public static void main(String[] args) {
        String str = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        System.out.println(regionMatches(str,str2,0, 28, 8));
    }
    public static boolean regionMatches(String str, String str2 ,  int toffset , int offset , int len){
        return str.regionMatches(toffset, str2, offset, len);
    }
}
