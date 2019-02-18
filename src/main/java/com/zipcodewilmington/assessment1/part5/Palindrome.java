package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        String sub = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = 1; j <= input.length() - i; j++) {
                sub = input.substring(i, j + i);

                if(isPalindromic(sub))
                {
                    count++;
                }
            }
        }

        return count;
    }

    public Boolean isPalindromic(String str) {
        String rev = BasicStringUtils.reverse(str);
        boolean result = true;

        for(int i = 0; i < str.length(); i++)
        {
            if(!(str.charAt(i) == rev.charAt(i)))
            {
                result = false;
            }
        }

        return result;
    }
}
