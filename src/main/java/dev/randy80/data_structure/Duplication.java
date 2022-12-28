package dev.randy80.data_structure;

public class Duplication {
    public boolean check(String targetStr) {
        if (targetStr == null) {
            targetStr = "";
        }

        char[] characters = targetStr.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            for(int j = i + 1; j < characters.length; j++) {
                if(characters[i] == characters[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
