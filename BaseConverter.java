package com.company;

public class BaseConverter {
    //конвертер градусов
    public static void convert (int celsius){
        // перевод в кельвин
         double Kelvin = celsius +  273.15;
         // перевод в по фаренгейту
        System.out.println("по Фаренгейту: " +Kelvin);
          int Fahrenheit = (celsius * (9/5)+32);
        System.out.println("В Кельвина: " + Fahrenheit);
    }


    public static void main (String [] args) {
        convert(0);
    }
}

