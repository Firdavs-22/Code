package PartOne;//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ReadingInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String name = scan.nextLine().trim();
        System.out.println("You are " + name);
    }
}
