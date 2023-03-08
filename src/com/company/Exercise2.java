package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Exercise2 {

    public static void extractFromFile() {
        BufferedReader br = null;

        try {
            File file = new File("journal.txt");

            if (file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("journal.txt"));
            String line;

//  На этом моменте не знаю что дальше делать
            while ((line = new String(br.readLine())) != null){
                String [] valuesSplit = line.split(",");

            }

        } catch (IOException e){
            System.out.println("Error:" + e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error:" + e);
            }
        }
    }
}
