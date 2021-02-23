package com.strings.tasks;

public class GetTheSum {

    public static  String checkNumeric(String data){
        String temp="";
        for(char c : data.toCharArray()){
            if(Character.isDigit(c)){
                temp=temp+c;
            }
        }
        return temp;
    }



    public static void main(String[] args) {
        String str = "AB65BC76DE890";
        System.out.println(str.replaceAll("[^0-9]","@"));



//        //65+76+890
//        /*
//        1.Understand object well
//        2.Observe the objective how it is available on the given string
//        3.see if we have any delimiter available, if available take refference
//        of it then use appropriate method
//        4.when you dont find any delimiter, try inserting delimiter and get the value
//         */
//        String temp = "";
//        for (int i = 0; i <= str.length() - 1; i++) {
//            char c = str.charAt(i);
//            if(i+1!=str.length()){
//                char next = str.charAt(i + 1);
//
//                if ((Character.isLetter(c) && Character.isDigit(next)) || Character.isLetter(next) && Character.isDigit(c)) {
//                    temp = temp + c + "@";
//                } else {
//                    temp = temp + c;
//                }
//
//
//
//            }else {
//                temp = temp + c;
//            }
//
//
//        }
//
//       String[] arr=temp.split("@");
//        int sum=0;
//        for (String data:arr) {
//            String result=checkNumeric(data);
//            if (result.length()>0){
//                sum=sum+Integer.valueOf(result);
//            }
//        }
//
//        System.out.println(sum);

    }
}
