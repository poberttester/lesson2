package com.company;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//    результат после каждой итерации запишите в лог-файл.
public class BubbleSort {

    public void sortArray() throws IOException {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);


        int[] arr = new int[]{2, 9, 1, 8, 5, 4, 3, 7, 6};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j + 1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info("Сортировка " + i + " элемента массива");
        }

        for (int a:arr) {
            System.out.println(a);
        }
        logger.info("Вывод отсортированных по возрастанию значений в консоль");


    }

}
