package com.example.nwaccposs2017app.SupremeCourtTheGame;

/**
 * Created by stephenvickers on 1/25/17.
 */

public class Answers {

    private String mText = "";

    private Boolean mCorrect = false;

    private int mQuestionNumber = 0;


    public Answers(){};

    public Answers(String text, Boolean correct, int questionNumber){
        this.setText(text);
        this.setCorrect(correct);
        this.setQuestionNumber(questionNumber);
    }

    public Answers(Answers answer){
        this.setText(answer.getText());
        this.setCorrect(answer.getCorrect());
        this.setQuestionNumber(answer.getQuestionNumber());
    }

    public static Answers newInstance(Answers answer){
        return new Answers(answer);
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void setQuestionNumber(int questionNumber) {
        this.mQuestionNumber = questionNumber;
    }

    public Boolean getCorrect() {
        return mCorrect;
    }

    public void setCorrect(Boolean mCorrect) {
        this.mCorrect = mCorrect;
    }

    public int getQuestionNumber() {
        return this.mQuestionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answers)) return false;

        Answers answers = (Answers) o;

        if (mText != null ? !mText.equals(answers.mText) : answers.mText != null) return false;
        return mCorrect != null ? mCorrect.equals(answers.mCorrect) : answers.mCorrect == null;

    }

    @Override
    public int hashCode() {
        int result = this.getText() != null ? this.getText().hashCode() : 0;
        result = 31 * result + (this.getCorrect() != null ? this.getCorrect().hashCode() : 0);
        return result;
    }
}