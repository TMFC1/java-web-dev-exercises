package Studios;

import java.util.HashMap;
import java.util.Scanner;

public class Counting {

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
