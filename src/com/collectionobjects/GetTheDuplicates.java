package com.collectionobjects;

import java.util.HashMap;
import java.util.Map;

public class GetTheDuplicates {
    public static void main(String[] args) {
        String data="abbbbcccssaaaabbbbwwsssdfffaaa";

        //print count of each character
        //print non repeated characters

        char[] arr=data.toCharArray();
        Map<Character,Integer> charMap=new HashMap<>();

        for(char c : arr){

            /// for getting ount of each char
            if(!charMap.containsKey(c)){
                charMap.put(c,1);
            }else {
                charMap.put(c,charMap.get(c)+1);
            }



        }
        System.out.println(charMap);

        //check for non repaeated

        for(Map.Entry<Character,Integer> ref:charMap.entrySet()){
            if(ref.getValue()==1){
                System.out.println(ref.getKey());
            }
        }


    }
}
