package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the name of a story: ");
        String fileName = read.nextLine().trim() + ".txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.println("Sorry, I couldn't find the story " + fileName);
        }

        read.close();
    }
}
