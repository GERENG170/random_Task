package com.company;
import java.io.*;
import java.lang.Object;
import java.lang.String;
// поиск элемента в массиве

public class searchElement {
    public static void search(int [] arr,int element){
        for (int i =0;i<arr.length;i++){
            if (element==arr[i]) {
                System.out.println(i);
                System.out.println("true");


            }
        }

    }
    public static void main (String [] args){
        search(new int [] {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14},5);
    }
}
