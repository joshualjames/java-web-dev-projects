package org.launchcode;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args){
        //write code here:
        Quiz quiz = new Quiz(new ArrayList<>());
        TrueOrFalse trueOrFalse = new TrueOrFalse("Will this program work?", 1, "true");
        quiz.addQuestion(trueOrFalse);

        quiz.runQuiz();

        quiz.gradeQuiz();
    }
}