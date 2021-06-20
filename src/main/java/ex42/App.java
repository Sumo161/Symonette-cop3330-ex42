package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.io.*;
import java.util.*;

public class App {

    public static void printDetails(String filename) {
        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0],temp[1],temp[2]);

            }
        }catch (FileNotFoundException  ex){
            System.out.println("Error: File not found");
        }
    }
    //define the function to print
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First","Salary");
        System.out.println("--------------------------------");
        emp.printDetails("exercise42_input.txt");

    }
}
