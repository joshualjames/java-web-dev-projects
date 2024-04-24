package org.launchcode;

import java.util.ArrayList;

public class MultipleSelect extends Question {
    private ArrayList<String> possibleAnswers;
    private ArrayList<String> correctAnswers;

    //Constructors

    public MultipleSelect(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }


    //Getters and Setters


    //Methods

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(Question.letters[i] + possibleAnswers.get(i));
        }
    }

    @Override
    public int getAnswers() {
        ArrayList<String> userAnswers = UserInputHandler.getMultipleSelectAnswers();
        return checkAnswers(userAnswers);
    }

    @Override
    public void displayQuestion() {
        System.out.println("\n\tMultiple Select: separate answers with a comma \n" + getText());
    }

    public int checkAnswers(ArrayList<String> check) {
        int answersCorrect = 0;
        for (String answer : check) {
            if (correctAnswers.contains(answer)) {
                answersCorrect++;
            } else {
                answersCorrect--;
            }
        }
        return answersCorrect >= 0 ? answersCorrect : 0;
    }
}

