package com.collectionobjects;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("d");
        stringSet.add("e");
        stringSet.add("b");

        //print the size of a  set
//        System.out.println(stringSet.size());
        //print all the elements from a set

//        Iterator iterator=stringSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //remove the elments from a set
//        stringSet.remove("d");
//        System.out.println(stringSet.size());

        //check if the element is exist in teh set
        System.out.println(stringSet.contains("d"));
    }
}
