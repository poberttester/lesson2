package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 2. Дана строка (получение через обычный текстовый файл!!!)
        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

      Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
      Студент [фамилия] получил [оценка] по предмету [предмет].
*/

public class Exercise2 {

    public String extractFromFile() throws IOException {

        String fileName = "journal.txt";
        File file = new File(fileName);
        FileReader reader = new FileReader(file);

        char[] arrChar = new char[(int)file.length()-74];  // я не понимаю почему без этого числа остаётся пустое место
        reader.read(arrChar);
        //закрываем потоки после использования
        reader.close();


        StringBuilder text = new StringBuilder();
        for (int i = 0; i < arrChar.length; i++) {
            text.append(arrChar[i]);

        }

        return text.toString();
    }

    public Map takeValueFrom (String str){
        String new_str = str.replaceAll("\"", "");
        String[] arr = new_str.split(",");

        Map<String, String> hashMap = new HashMap<String, String>();

        for (String i :arr) {
            String stuData[] = i.split(":");
            String key = stuData[0].trim();
            String value = stuData[1].trim();

            // Add to map
            hashMap.put(key, value);
        }

        return hashMap;
    }

    public void getInfo(Map map){
        String soname = null;
        String number = null;
        String subject = null;


        for (int i = 0; i < 2; i++) {
            soname = (String)map.get("фамилия");
            number = (String)map.get("оценка");
            subject = (String)map.get("предмет");

            System.out.println("Студент " + soname + " получил " + number + " по предмету " + subject + ".\n");


        }

    }
}
