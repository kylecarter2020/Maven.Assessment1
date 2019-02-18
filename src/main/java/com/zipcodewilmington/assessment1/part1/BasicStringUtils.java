package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String result = "";
        result += str.toUpperCase().charAt(0);

        for (int i = 1; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversed = "";

        for (int i = 1; i <= str.length(); i++) {
            reversed += str.charAt(str.length() -i);
        }
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = reverse(str);
        str = camelCase(str);

        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String result = "";

        for (int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                result += str.toLowerCase().charAt(i);
            }
            else {
                result += str.toUpperCase().charAt(i);
            }
        }

        return result;
    }
}
