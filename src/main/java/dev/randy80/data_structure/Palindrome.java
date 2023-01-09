package dev.randy80.data_structure;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public boolean check(String str) {
        str = str.replace(" ", "");
        Map<Character, Integer> counter = new HashMap<>();
        for(char item: str.toCharArray()) {
            if(counter.containsKey(item)) {
                counter.put(item, counter.get(item) + 1);
            } else {
                counter.put(item, 1);
            }
        }

        if(str.length() % 2 == 0) {
            for(char item: counter.keySet()) {
                if(counter.get(item) % 2 != 0) {
                    return false;
                }
            }
        } else {
            int oddCnt = 0;
            for(char item: counter.keySet()) {
                if(counter.get(item) % 2 != 0) {
                    oddCnt++;
                }
            }
            if(oddCnt > 1) {
                return false;
            }
        }
        return true;
    }
}
