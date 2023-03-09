package com.company;

public class Palindrom {

// 3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//    (возвращает boolean значение).
    public boolean isPalindrom(String text) {

        StringBuilder invert = new StringBuilder();
        char[] plain = text.toCharArray();


        for (int i = plain.length - 1; i >= 0; i--) {
            invert.append(plain[i]);

        }

        return (invert.toString()).equals(text);
    }
}
