package dev.randy80.data_structure;

public class URLify {
    public char[] convert(char[] str, int strLen) {
        int spaceCnt = 0;
        for(char item: str) {
            if(item == ' ') {
                spaceCnt++;
            }
        }

        int returnLen = strLen + (spaceCnt * 2);
        char[] convertedStr = new char[returnLen];
        int returnIdx = 0;
        for(int i = 0; i < strLen; i++) {
            if(str[i] == ' ') {
                convertedStr[returnIdx++] = '%';
                convertedStr[returnIdx++] = '2';
                convertedStr[returnIdx++] = '0';
            } else {
                convertedStr[returnIdx++] = str[i];
            }
        }

        return convertedStr;
    }
}
