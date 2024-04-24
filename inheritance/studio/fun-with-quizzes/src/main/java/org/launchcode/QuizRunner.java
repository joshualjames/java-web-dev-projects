package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args){
        //write code here:
        Quiz quiz = new Quiz(new ArrayList<>());

        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Blue","Pineapple","Green","Yellow"));
        ArrayList<String> correctAns1 = new ArrayList<>(Arrays.asList("a","c","d"));
        MultipleSelect newQuestion1 = new MultipleSelect(3,"Which are colors?",possAns1,correctAns1);
        quiz.addQuestion(newQuestion1);

        Boolean correctAns2 = true;
        TrueOrFalse newQuestion2 = new TrueOrFalse("The sky is blue.",correctAns2);
        quiz.addQuestion(newQuestion2);

        ArrayList<String> possAns3 = new ArrayList<>(Arrays.asList("2", "5", "7", "4"));
        String correctAns3 = "d";
        MultipleChoice multipleChoiceQ1 = new MultipleChoice("What is the result of 2+2?",possAns3,correctAns3);
        quiz.addQuestion(multipleChoiceQ1);

        quiz.runQuiz();

        quiz.gradeQuiz();

    }
}