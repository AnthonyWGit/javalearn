//This will allow us to import as a package all the classes and their methods below
package com.somepackage;
import com.secondarypackage.*;

public class Main {
    //Main function should always be static and public to be accessible 
    public static void main(String[] args){
        System.out.println("Hello world");
        com.secondarypackage.NewClass.callingLines(5);
    }

    public static void printLines(int numberOfLines){
        for (int i=0; i < numberOfLines; i++) {
            System.out.println("Testing lines");
        }
    }
}

