//This will allow us to import as a package all the classes and their methods below
package com.somepackage;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import com.secondarypackage.*;

public class Main {
    //Main function should always be static and public to be accessible 
    public static void main(String[] args)
    {
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
        formattingNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of scanner do you want ? 1 or 2 ? Type your answer here:");
        String choice = scanner.nextLine();
        System.out.println("You entered " + choice);
        if (choice.equals("1")) // In java we need to use equals for string because == compares if object is the same in memory 
        // it compares object references
        {
            scanner();
        }
        else if (choice.equals("2"))
        {
            scannerTwo();
        }
        else
        {
            numerals();
            credit();
            ternary();
            admin();
            String choiceTwo = scanner.next().toLowerCase();
            switch(choiceTwo)
                {
                    case "for":
                        loopFor();
                        break;

                    case "while":
                        loopWhile();
                        break;
                        
                }
        }
        scanner.close();
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

        int res4 = Math.max(res2, res3);
        System.out.println(res4);

        int res5 = Math.min(res,res3);
        System.out.println(res5);

        double randomValue = Math.random(); //random takes double  - result betwwen 0 and 1     
        System.out.println(randomValue);

        int funnyResult = (int)Math.round(Math.random() * 100) ;
        System.out.println(funnyResult);
    }

    public static void formattingNumbers()
    {
        Locale usLocale = Locale.US;
        Locale frLocale = Locale.FRANCE;
        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(usLocale); //NumberFormat is an abstract class so we can't use new to instanciate an objecct of this class
        NumberFormat currencyFR = NumberFormat.getCurrencyInstance(frLocale);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String res2 = percent.format(4);
        String res = currencyUS.format(1248465.69);
        String res3 = currencyFR.format(1248465.69);
        System.out.println(res + " currency");
        System.out.println(res2); 
        System.out.println(res3);
    }

    public static void scanner()
    {
        Scanner scanner = new Scanner(System.in); //Beware the syntax !! System not system 
        System.out.print("Age: ");
        try 
        {
            Byte someByte = scanner.nextByte();
            System.out.println("You are: " + someByte);
            scanner.close();
        } 
        catch (java.util.InputMismatchException e) 
        {
            // Display error message
            System.out.println("Error: Please enter a valid number between -128 and 127!");
        }
    }

    public static void scannerTwo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name ?");
        String someString = scanner.nextLine().trim(); //remove white spaces 
        System.out.println("You are " + someString);
        scanner.close();
    }

    public static void numerals()
    {
        int temperature = 25;
        boolean isWarm = temperature >= 20 && temperature <= 30;
        System.out.println(isWarm);
    }

    public static void credit()
    {
        boolean hasGoodCredit = true;
        boolean hasHighIncome = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord; // || or operator like many other languages
        //To be eligible someone has to have goodCredit or Hihgh incomome AND NOT having a criminal record
        System.out.println(isEligible); //very descriptive variables names
    }

    public static void ternary()
    {
        int income = 150_000;
        String className = income > 100_000 ? "Rich" : "Economy"; // ternary operator 
        boolean hasHighIncome = income > 150_000;
    }

    public static void admin()
    {
        String role = "admin";
        // if (role == "admin")
        //     System.out.println("Your are an admin");
        // else if (role == "moderator")
        //     System.out.println("You are a mod");
        // else 
        //     System.out.println("You are a peasant");
        switch (role) {
            case "admin":
                System.out.println("You are admin");
                break;
            case "mod":
                System.out.println("You are a mod");
                break;
            default:
                System.out.println("You are nothing");
                break;
        }
    }
    public static void loopFor()
    {
        //a for loop
        for (int i = 0; i <5 ; i++)
            System.out.println("increment : for loop");
        
        int i = 5;
    }

    public static void loopWhile()
    {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) // Can't use the != because it will compare the adresses in memory and not the actual values
        {
            System.out.println("Input : ");
            input = scanner.nextLine().toLowerCase(); //This is how to store a strig in Java |if next and not nextLine then it will take only one word 
            System.out.println(input);
        }
        scanner.close();
    }
}

