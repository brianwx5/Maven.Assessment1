package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        String[] stringArray = input.split("");
        String[] reversedStringArray = new String[stringArray.length];
        int counter =0;
        int length = stringArray.length-1;
        for( int i = length; i>=0; i--) {
            reversedStringArray[length-i] = stringArray[i];
        }

            if(stringArray == reversedStringArray) {
                counter++;


        } return counter;
    }
}
