package questions_20_30;

public class Question21 {
    public static void main(String[] args) {
        var name = "The quick brown fox jumps over the lazy dog.";
        System.out.println(reverseString(name));
        System.out.println(lastIndexOfAlphabet(name, 'a'));
        System.out.println("---");
        System.out.println(lastIndexOfWord(name, "fox"));
        int result = 0;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < alphabet.length;i++){
            result = lastIndexOfAlphabet(name, alphabet[i]);
            System.out.print("\t" + alphabet[i] + "=" + result+ "");
        }
    }

    public static String reverseString(String stringParam) {
        char[] stringParamArray = stringParam.toCharArray();
        StringBuilder invertedString = new StringBuilder();
        for (int i = 0; i < stringParamArray.length; i++) {
            invertedString.insert(0, stringParamArray[i]);
        }
        return invertedString.toString();
    }

    public static int lastIndexOfAlphabet(String stringParam, char charSearch) {
        var reverseString = reverseString(stringParam);
        var indexOf = 0;

        for (int i = 0; i < reverseString.length(); i++) {
            char charIndexOf = reverseString.charAt(i);
            if (charIndexOf == charSearch) {
                indexOf = reverseString.length() - reverseString.indexOf(charIndexOf);
                break;
            }
        }
        return indexOf;
    }
    public static int lastIndexOfWord(String stringParam, String stringSearch) {
        var reverseString = reverseString(stringParam);
        var reverseWord = reverseString(stringSearch);
        var indexOf = 0;

        if (reverseString.contains(reverseWord)){
            indexOf = (reverseString.length() - reverseString.indexOf(reverseWord)) - reverseWord.length();
        }
        return indexOf;
    }
}
