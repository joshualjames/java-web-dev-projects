package org.launchcode;

public abstract class Question {
    public static String[] letters = {"a. ", "b. ", "c. ", "d. ", "e. ", "f. "};
    private int pointValue;
    private String text;

    //Constructors
    public Question(int pointValue, String text){
        this.pointValue = pointValue;
        this.text = text;
    }

    //Getters and Setters
    public int getPointValue() {
        return pointValue;
    }

    public String getText() {
        return text;
    }

    //Methods
    public abstract void displayAnswers();
    public abstract int getAnswers();
    public abstract void displayQuestion();
}
