package com.company;

import java.io.IOException;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {

    // 1. задание
        BubbleSort homework1 = new BubbleSort();
        homework1.sortArray();

    // 2. задание
        Exercise2 file = new Exercise2();
        Exercise2 file2 = new Exercise2();
        Exercise2 file3 = new Exercise2();

        String str = file2.extractFromFile();
        Map map = file.takeValueFrom(str);
        file3.getInfo(map);


    // 3. задание
        Palindrom palindrom = new Palindrom();
        boolean answer = palindrom.isPalindrom("профессор");
        System.out.println(answer + "\n");
    }
}
