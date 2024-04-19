package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Questions{
    //Fields
    private String correctAnswer;
    private String candidateAnswer;
    private ArrayList<String> possibleAnswers = new ArrayList<>();

    public MultipleChoice(String questions, int pointValue, String correctAnswer, ArrayList<String>){

    }






                          @Override
    public int getCandidateAnswers(){
        Scanner input = new Scanner(System.in);
        candidateAnswer = input.nextLine();
        return validateAnswer();
    }

    public int validateAnswer() {
        if (candidateAnswer.equals(correctAnswer)) {
            return 1;
        } else {
            return 0;
        }
    }
}
