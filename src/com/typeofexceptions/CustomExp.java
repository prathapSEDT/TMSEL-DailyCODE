package com.typeofexceptions;

public class CustomExp extends RuntimeException{
    private String message;
    CustomExp(String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return "CustomExp{" +
                "message='" + message + '\'' +
                '}';
    }
}
