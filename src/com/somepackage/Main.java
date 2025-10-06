//This will allow us to import as a package all the classes and their methods below
package com.somepackage;
import java.lang.reflect.Array;
import java.util.Arrays;

import com.secondarypackage.*;

public class Main {
    //Main function should always be static and public to be accessible 
    public static void main(String[] args){
        System.out.println("Hello world");
        com.secondarypackage.NewClass.callingLines(5);
        com.secondarypackage.NewClass.referenceType();
        arrayEx();
        matrixArray();
    }

    public static void printLines(int numberOfLines){
        for (int i=0; i < numberOfLines; i++) {
            System.out.println("Testing lines");
        }
    }

    //careful in JAVA arrays size is fixed 
    public static void arrayEx(){
        int[] nexArray = new int[7]; //numbers in our array
        nexArray[2] = 300;
        for (int n=0; n < nexArray.length ; n++){
            System.out.println(nexArray[n]);
        }
        System.out.println("nexArray");
        System.out.println(Arrays.toString(nexArray)); //it will print the adress in memory
    }

    public static void matrixArray(){
        int[][] matrixArray = new int[5][4];
        int[][] secondMatrixArray = { {1,2,2,5}, {3,7,5} };
        System.out.println("matrixArray");
        for (int k=0; k< secondMatrixArray.length; k++){
            System.out.println(secondMatrixArray[k]);
        }
        System.out.println(Arrays.deepToString(secondMatrixArray)); //needed to print multi dimentional arrays 
    }
}

