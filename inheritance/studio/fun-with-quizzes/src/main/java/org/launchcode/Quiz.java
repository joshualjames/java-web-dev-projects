package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Quiz {

    //Fields
    private ArrayList<Question> questions;
    private int score;
    private int total;

    //Constructors
    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for(int i = 0; i<questions.size(); i++){
            this.total = this.total + questions.get(i).getPointValue();
        }
    }

    public void addQuestion (Question newQuestion){
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();
    }

    public void runQuiz(){
        for (int i = 0; i< questions.size(); i++){
            questions.get(i).displayQuestion();
            questions.get(i).displayAnswers();
            int pts = questions.get(i).getAnswers();
            updateScore(pts);
        }
    }

    public void updateScore(int x){this.score = this.score + x;}

    public void gradeQuiz(){
        System.out.println("You finished the quiz! Your score is "+score+" pts");
        double percentageGrade= ((double)score/(double)total)*100;
        System.out.println("Your grade as a percentage is " + percentageGrade +"%");
        System.out.println(total);
    }
}

