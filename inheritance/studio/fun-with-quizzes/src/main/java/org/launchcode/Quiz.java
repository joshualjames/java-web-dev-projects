package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Quiz {

    //Fields
    private ArrayList<Questions> questions = new ArrayList<>();
    private int score;
    private int total;

    //Constructors

    public Quiz(ArrayList<Questions> questions) {
        this.questions = questions;
        for(int i=0;i<this.questions.size();i++){
            System.out.println((questions.get(i).getPointValue()));
            this.total += questions.get(i).getPointValue();
        }
    }

    //Getters and Setters

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Questions> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    //Methods
    public void addQuestion(Questions question){
        this.questions.add(question);
        this.total += question.getPointValue();
    }

    public void runQuiz(){
        for(int i=0; i<questions.size(); i++){
            questions.get(i).displayQuestions();
            questions.get(i).displayAnswers();
            score += questions.get(i).getCandidateAnswers();
        }
    }

    public void gradeQuiz(){
        System.out.println("Score: " +score);
        System.out.println("Grade: " + score/total);
    }

}
