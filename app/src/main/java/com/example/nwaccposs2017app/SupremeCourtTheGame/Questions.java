package com.example.nwaccposs2017app.SupremeCourtTheGame;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


/**
 * Created by stephenvickers on 10/4/16.
 */
public class Questions implements Serializable{


    //Mark: - Private vairables for the class

    /**
     * private String to hold the question
     */
    private String question;

    /**
     * Private ArrayList to hold the answers for the current question
     */
    private List<Answers> answerChoice = new ArrayList();

    /**
     * Private int to hold the question number for the class
     */
    private int questionNumber = 0;

    /**
     * Private int to hold the number for the question set
     */
    private int questionSetNumber = 0;


    //Mark - Constructors for the class

    /**
     * Default constructor for the class
     */
    public Questions(){
        this.question = "";
    }

    /**
     * overloaded constructor for the class
     * @param question a question instance
     */
    public Questions(Questions question){
        this.setQuestion(question.getQuestion());

        for(int index = 0; index < question.getNumberOfAnswers(); index++){

            Answers temp = question.getNextAnswer(index);

            this.pushAnswer(temp.getText(), temp.getCorrect(), temp.getQuestionNumber());
        }
    }

    /**
     * Overloaded constructor for the class
     * @param question a String to pass the a question to the class
     */
    public Questions(String question){
        this.setQuestion(question);
    }

    /**
     * Public void method to get the
     * @param answer
     * @param correct
     */
    public void pushAnswer(String answer, boolean correct, int questionNumber){
        Answers answers = new Answers(answer, correct, questionNumber);
        this.answerChoice.add(answers);
    }

    public void pushAnswer(Answers answer){
        this.answerChoice.add(Answers.newInstance(answer));
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionNumber(int questionNumber){
        this.questionNumber = questionNumber;
    }

    public void setQuestionSetNumber(int questionSetNumber) {
        this.questionSetNumber = questionSetNumber;
    }

    public Answers getNextAnswer(int index){
        return this.answerChoice.get(index);
    }

    public int getNumberOfAnswers(){
        return answerChoice.size();
    }

    public int getQuestionNumber(){
        return this.questionNumber;
    }

    public int getQuestionSetNumber() {
        return this.questionSetNumber;
    }

    public List<Answers> getAnswers(){
        return this.answerChoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Questions)) return false;

        Questions questions = (Questions) o;


        if (getQuestion() != null ? !getQuestion().equals(questions.getQuestion()) : questions.getQuestion() != null)
            return false;
        return answerChoice != null ? answerChoice.equals(questions.answerChoice) : questions.answerChoice == null;

    }

    @Override
    public int hashCode() {
        int result = getQuestion() != null ? getQuestion().hashCode() : 0;

        result = 31 * result + (this.answerChoice != null ? this.answerChoice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                ", answerChoice=" + answerChoice +
                ", questionNumber=" + questionNumber +
                '}';
    }
}
