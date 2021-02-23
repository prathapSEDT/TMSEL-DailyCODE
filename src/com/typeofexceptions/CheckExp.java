package com.typeofexceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExp {
    public static void main(String[] args) throws FileNotFoundException {
//        File f=new File("abc.txt");
//        FileInputStream fis=new FileInputStream(f);

        int a=10;
        int b=20;
        if(a<b){
            throw new CustomExp("A is less than B, can not proceed further");
        }
    }
}
