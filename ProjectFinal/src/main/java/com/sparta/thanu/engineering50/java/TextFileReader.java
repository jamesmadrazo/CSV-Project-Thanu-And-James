package com.sparta.thanu.engineering50.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TextFileReader {
    String within = "";
    public  void readFileToString(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
           String line;
           int up = 0;
            while ((line = reader.readLine()) != null) {
                if(up == 0){
                    up++;
                    continue;
                }
                within = line + within;
                String[] array = line.split(",");
                Employees employees = new Employees(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8],array[9]);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
