package com.secondarypackage;
import com.somepackage.*;
import java.util.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NewClass {
    public void exampleFunction(){
        Main.main(new String[0]);
    }
    public static void callingLines(int nb){
        Main.printLines(nb);
    }

    public static void referenceType(){
        //Date are of reference type ; has to be converted to a String type to be readable in console;
        Date aDate = new Date();
        Instant instantDate = aDate.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instantDate, ZoneId.systemDefault());
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatedDate = localDateTime.format(dateFormat);
        System.out.println(formatedDate);
    }
}
