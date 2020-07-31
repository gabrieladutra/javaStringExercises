
package questions_10_20;

public class Question19 {
    public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog.";
    int result = 0;
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char c : alphabet) {
            result = getCharactersOf(str, c);
            System.out.print("\t" + c + "=" + result + "");
        }
}
    public static int getCharactersOf(String str, char search){
        char[] array = str.toCharArray();
        int indexOf = 0;
        for (char c : array) {
            if (c == search) {
                indexOf = c + indexOf;
                break;
            }
        }
        return indexOf;
    }
    }


