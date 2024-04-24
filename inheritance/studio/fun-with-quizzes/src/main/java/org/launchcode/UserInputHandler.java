package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputHandler {
    public static String getUserInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public static String getMultipleChoiceAnswers(){
        String userAnswer = getUserInput("Your Answer: ");
        return userAnswer;
    }

    public static ArrayList<String> getMultipleSelectAnswers() {
        ArrayList<String> userAnswers = new ArrayList<>();
        String userInput = getUserInput("Your answers (separate with comma): ");
        String[] answerArray = userInput.split(",");
        for (String answer : answerArray) {
            answer = answer.trim();
            userAnswers.add(answer);
        }
        return userAnswers;
    }

    public static boolean getTrueOrFalseAnswer(){
        String userAnswer = getUserInput("Type 't' for True or 'f' for False: ");
        return userAnswer.trim().equalsIgnoreCase("t");
    }
}
