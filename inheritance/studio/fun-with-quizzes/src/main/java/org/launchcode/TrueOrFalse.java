package org.launchcode;

import java.util.Scanner;

public class TrueOrFalse extends Questions {
    private String correctAnswer;
    private String candidateAnswer;
    public TrueOrFalse (String questions, int pointValue, String correctAnswer){
        super(questions, pointValue);
        this.correctAnswer = correctAnswer;
    }

    //Getters and Setters

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCandidateAnswer() {
        return candidateAnswer;
    }

    public void setCandidateAnswer(String candidateAnswer) {
        this.candidateAnswer = candidateAnswer;
    }

    //Methods
    @Override
    void displayAnswers(){
        System.out.println("True or False?");
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
