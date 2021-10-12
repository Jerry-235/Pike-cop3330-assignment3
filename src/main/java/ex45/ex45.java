/*
 *  UCF COP3330 Fall 2021 Assignment 45 Solution
 *  Copyright 2021 Jeremiah Pike
 */
package ex45;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex45 {

    public static void main(String[] args) throws IOException {

        File file = new File("exercise45_input.txt");
        Scanner sc = new Scanner(file);
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter name of file : ");

        String outputName = s.next();
        FileWriter writer = new FileWriter(outputName+".txt");

        try
        {
            while( sc.hasNext() )
            {
                String user = sc.nextLine();
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }
        writer.close();
        System.out.println("\nSuccess");
    }
}