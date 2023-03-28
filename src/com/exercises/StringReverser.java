package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class StringReverser {

    public StringReverser(){

    }

    public static String reverseString2(String inputString) {
        char[] chars=inputString.toCharArray();
        StringBuilder sb = new StringBuilder(inputString.length());
        for (int i=chars.length-1;i>=0;i--) {
            sb.append(chars[i]);
        }
        return sb.toString();

    }
    public static String reverseString(String inputString) {


        List<String> splitStringToArray = new ArrayList<>(List.of(inputString.split("")));
        StringBuilder reversedString = new StringBuilder();


        for(int i=splitStringToArray.size()-1; i>= 0; i-- ){
            reversedString.append(splitStringToArray.get(i));
        }

        return reversedString.toString();


    }




}
