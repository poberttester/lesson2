package com.company;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//    результат после каждой итерации запишите в лог-файл.
        BubbleSort homework1 = new BubbleSort();
        homework1.sortArray();

/* 2. Дана строка (получение через обычный текстовый файл!!!)
        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

      Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
      Студент [фамилия] получил [оценка] по предмету [предмет].
*/

// 3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//    (возвращает boolean значение).

        Palindrom palindrom = new Palindrom();
        boolean answer = palindrom.isPalindrom("профессор");
        System.out.println(answer);
    }
}
