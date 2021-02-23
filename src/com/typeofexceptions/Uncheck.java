package com.typeofexceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Uncheck {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch(NullPointerException n){
            System.out.println(n.getMessage());
        }catch (IndexOutOfBoundsException i) {
            System.out.println(i.getMessage());
        }
        catch(Exception e){
            System.out.println("Gener");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("100 % code will");
        }
    }
}
