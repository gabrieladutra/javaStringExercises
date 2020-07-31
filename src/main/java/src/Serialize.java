package src;


import java.util.Arrays;

public class Serialize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIntArray("1,2,3,4,5")));
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getString(array));
        getClassField("1,a,b,4,5");
        System.out.println(getClassField("1,a,b,4,5"));
    }

    public static int[] getIntArray(String str) {
        String[] array = str.split(",");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            intArray[i] = number;
        }
        return intArray;
    }

    public static String getString(int[] intArray) {
        String string = "";
        for (int i = 0; i < intArray.length; i++) {
            string += intArray[i];
        }
        String replace = string.replace("", ",");
        return replace.substring(1, replace.length() - 1);
    }

    public static boolean isNumeric(String value) {
         return value.matches("\\d*");
    }

    public static User getClassField(String str) {
        String[] splitArray = str.split(",");
        int[] intArray = new int[splitArray.length];
        String string = "";
        String[] stringArray = new String[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            if (!isNumeric(splitArray[i])) {
                stringArray[i] = stringArray[i];
            } else {
                int number = Integer.parseInt(splitArray[i]);
                intArray[i] = number;
            }
        }
        return new User(intArray, stringArray);
    }


}
