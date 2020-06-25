package org.launchcode.java.studios.areaofacircle.org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conting {

    public static void main(String[] args) {

        HashMap<Character, Integer> characters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newString;

        System.out.println("Enter a String of characters (or ENTER to finish):");
        newString = input.nextLine();
        newString.toLowerCase();
        char[] charactersInString = newString.toCharArray();
        for (char ch : charactersInString) {
            characters.put(ch, characters.getOrDefault(ch, 0) + 1);
        }
        System.out.print(characters);



    }
}
