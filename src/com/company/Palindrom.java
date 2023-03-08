package com.company;

public class Palindrom {

    public boolean isPalindrom(String text) {

        StringBuilder invert = new StringBuilder();
        char[] plain = text.toCharArray();


        for (int i = plain.length - 1; i >= 0; i--) {
            invert.append(plain[i]);

        }

        return (invert.toString()).equals(text);
    }
}
