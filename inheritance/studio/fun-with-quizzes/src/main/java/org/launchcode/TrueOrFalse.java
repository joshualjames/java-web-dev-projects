package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueOrFalse extends Question {
    //fields
    private Boolean correctAnswer;


    //Constructors


    public TrueOrFalse(String text, Boolean correctAnswer) {
        super(1, text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
    }

    @Override
    public int getAnswers() {
        Boolean userAnswer = UserInputHandler.getTrueOrFalseAnswer();
        return isCorrectAnswer(userAnswer)? 1:0;
    }

    @Override
    public void displayQuestion() {
        System.out.println("\n\tTrue or False:\n" + getText());
    }


    public boolean isCorrectAnswer(Boolean possibleAnswer) {
        return possibleAnswer == correctAnswer;
    }
}
