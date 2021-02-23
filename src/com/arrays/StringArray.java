package com.arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] names=new String[5];
        names[0]="Raj";
        names[1]="krish";
        names[2]="rahul";
        names[3]="Raj";
        names[4]="rakesh";


//       for(int i=0;i<=names.length-1;i++){
//           System.out.println(names[i]);
//       }

        for( String empname:names){
            System.out.println(empname);
        }



    }
}
