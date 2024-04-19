package org.launchcode;

public abstract class Questions {

    //TODO
    private String questions;
    private int pointValue;
    private Boolean isCorrect;

    //Constructor

    public Questions(String questions, int pointValue) {
        this.questions = questions;
        this.pointValue = pointValue;
    }

    //Getters and Setters

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }


    //Methods

    void displayQuestions(){
        System.out.println(this.questions);
    }

    abstract void displayAnswers();

    abstract int getCandidateAnswers();
}
