package org.launchcode;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’".toLowerCase();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a term to search for in the first sentence of Alice's Adventures in Wonderland.");
        String search = input.nextLine().toLowerCase();

        Boolean result = text.contains(search);

        Integer index = text.indexOf(search);
        Integer length = search.length();

        if (result){
            System.out.println("Your search result was found! " +
                    "Your search term first appears at index " + index + ". " +
                    "Your term is " + length + " characters long.");
            String alteredText = text.replace(search.toLowerCase(), "");
            System.out.println(alteredText);
        } else {
            System.out.println("No results found");
        }
    }
}
