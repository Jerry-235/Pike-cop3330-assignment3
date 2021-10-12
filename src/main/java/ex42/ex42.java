/*
 *  UCF COP3330 Fall 2021 Assignment 42 Solution
 *  Copyright 2021 Jeremiah Pike
 */
package ex42;
import java.io.*;
import java.util.*;
public class ex42 {

   public static void readNames(Scanner input, ArrayList<String> names) {

        //read and import text file
        while (input.hasNextLine()) {
            names.add(input.nextLine());
        }
    }

    public static void writeNames(ArrayList<String> names) throws IOException {

        FileWriter output = new FileWriter("exercise42_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        for (String i : names) {
            output.write(i + "\n");
        }
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File("exercise42_input.txt"));
        ArrayList<String> names = new ArrayList<>();
        readNames(inputFile, names);
        names.sort(String.CASE_INSENSITIVE_ORDER);
        inputFile.close();

        //try for success
        try {
            writeNames(names);
            System.out.println("Success");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}