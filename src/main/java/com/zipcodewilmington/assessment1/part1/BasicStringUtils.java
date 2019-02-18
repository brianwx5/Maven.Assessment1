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
        String result = str.substring(0,1).toUpperCase() + str.substring(1);
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String result = (sb.substring(0,1).toUpperCase() + sb.substring(1)).toString();
        return result;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,(str.length()-1));
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] invertCasing = str.toCharArray();
        for(int i =0; i<invertCasing.length; i++) {
            char comparison = invertCasing[i];
            if(Character.isUpperCase(comparison)) {
                invertCasing[i] = Character.toLowerCase(comparison);
            }
            else {
                invertCasing[i] = Character.toUpperCase(comparison);
            }
        } return new String(invertCasing);
    }
}
