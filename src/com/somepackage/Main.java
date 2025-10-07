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
        constants();
        arithmetics();
        moreArithmetivs();
        casting();
        maths();
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

    public static void matrixArray() //void because it doesn't need to return anything 
    {
        int[][] matrixArray = new int[5][4];
        int[][] secondMatrixArray = { {1,2,2,5}, {3,7,5} };
        System.out.println("matrixArray");
        for (int k=0; k< secondMatrixArray.length; k++){
            System.out.println(secondMatrixArray[k]);
        }
        System.out.println(Arrays.deepToString(secondMatrixArray)); //needed to print multi dimentional arrays 
    }

    public static void constants()
    {
        final float pi = 3.14F; //F for float - final to declare constants  
        System.out.println(pi);
    }

    public static void arithmetics()
    {
        int num1 = 5;
        int num2 = 2;
        int res = num1/num2; // will output 2 cause the division of 2 ints are an int as result 
        double res2 = (double)num1/num2; // casting so we have a double for result 
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res + res2);
    }

    public static void moreArithmetivs()
    {
        int comp = 1;
        int x = 1;
        System.out.println(x);
        int y = x++; //prints 1
        System.out.println(y);
        int x2 = 1;
        int z = ++x2; //prints 2 
        System.out.println(z);
        //compound assignement operators
        comp *= 2; //mtiply the value of comp by 2
        System.out.println(comp);
    }

    public static void casting()
    {
        // Implicit casting
        short x = 1;
        int y = x + 2;
        System.out.println(y);   
        //short = 2 bytes ; int = 4 bytes so short is auto coonverted into int 
        //implicit casting happens when we won't loose data 
        //byte > short > int > long > float > double      
        // explicit casting
        double x2 = 1.2;
        int y2 = (int)x2 + 2;
        System.out.println(y2);
        //if x2 was a string we couldn't cast a string into a doouble. We need those variables to be compatible 
        // solution -> parseInt 
        String x3 = "3";
        double y3 = Double.parseDouble(x3) + 3;
        System.out.println(y3);
        //Beware String is case sensitive ! 
    }

    public static void maths()
    {
        float x=1.2F;
        int res=Math.round(x);
        System.out.println(res); 

        float y=5.25F;
        int res2=(int)Math.ceil(y); //we need to cast because base math round returns a double
        System.out.println(res2); //ceil returns a number higher than the base eg ceil 3.3 is 4 

        float z=87.3F;
        int res3= (int)Math.floor(z);
        System.out.println(res3);
    }
}

