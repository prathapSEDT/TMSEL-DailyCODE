package com.collectionobjects;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer,String> testMap=new HashMap<Integer,String>();
        testMap.put(1,"Raj");
        testMap.put(2,"Krish");
        testMap.put(4,"Rahul");
        testMap.put(5,"OP");

//        System.out.println(testMap.get(5));

       // System.out.println(testMap.containsKey("9"));

        //iterate a map using entry set
        for(Map.Entry<Integer,String> ref:testMap.entrySet()){
            System.out.println(ref.getKey());
            System.out.println(ref.getValue());
        }


    }
}
