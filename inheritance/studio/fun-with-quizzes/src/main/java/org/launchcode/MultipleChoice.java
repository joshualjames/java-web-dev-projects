package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {
    //Fields
    private ArrayList<String> possibleAnswers;
    private String correctAnswer;


    //Constructors
    public MultipleChoice(String text, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(1, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(Question.letters[i] + possibleAnswers.get(i));
        }
    }

    @Override
    public int getAnswers() {
        String userAnswer = UserInputHandler.getMultipleChoiceAnswers();
        return checkMCAnswer(userAnswer) ? 1 : 0;
    }

    @Override
    public void displayQuestion() {
        System.out.println("\n\tSelect the correct answer (only one):\n" + getText());
    }

    public boolean checkMCAnswer(String possibleAnswer) {
        return possibleAnswer.equals(correctAnswer);
    }
}






