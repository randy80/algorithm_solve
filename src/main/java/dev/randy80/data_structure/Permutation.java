package dev.randy80.data_structure;

import java.util.Arrays;

public class Permutation {
    public boolean check(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        char[] sortedStr1 = str1.toCharArray();
        Arrays.sort(sortedStr1);

        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr2);

        for(int i = 0; i < sortedStr1.length; i++) {
            if(sortedStr1[i] != sortedStr2[i])
                return false;
        }

        return true;
    }
}
