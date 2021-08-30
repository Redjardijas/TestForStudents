package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class Test extends AppCompatActivity {
    private TextView textViewQuestion, textViewScore, textViewQuestionCounter, textViewCountDown;
    private RadioGroup rdGroup;
    private RadioButton rb1, rb2, rb3;
    private Button buttonConfirm;
    private ColorStateList textColorDefaultRb;
    private List<Question> questionList;
    private int questionCountTotal;
    private Question currentQuestion;
    private int questionCounter;
    private int score;
    private boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewScore = findViewById(R.id.score0);
        textViewQuestionCounter = findViewById(R.id.questNumber);
        textViewCountDown = findViewById(R.id.time);
        rb1 = findViewById(R.id.radiobutton1);
        rb2 = findViewById(R.id.radiobutton2);
        rb3 = findViewById(R.id.radiobutton3);
        buttonConfirm = findViewById(R.id.confirm);

        textColorDefaultRb = rb1.getTextColors();
        rdGroup = findViewById(R.id.radiogroup1);

        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestions();
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);

        showNextQuestion();

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {
                    if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked()) {
                        checkAnswer();
                    }else {
                        Toast.makeText(Test.this, "select answer!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });
    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rdGroup.clearCheck();

        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());

            questionCounter++;
            textViewQuestionCounter.setText("Question: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirm.setText("Confirm");

        } else {
            finishQuiz();
        }
    }

    public void finishQuiz() {
        finish();
    }
    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(rdGroup.getCheckedRadioButtonId());
        int answerNr = rdGroup.indexOfChild(rbSelected) + 1;

        if (answerNr == currentQuestion.getAnswerNr()) {
            score++;
            textViewScore.setText("Score:" + score);
        }
        showSolution();
    }
        private void showSolution(){
        rb1.setTextColor(Color.RED);
            rb2.setTextColor(Color.RED);
            rb3.setTextColor(Color.RED);

           switch (currentQuestion.getAnswerNr()) {
               case 1:
               rb1.setTextColor(Color.GREEN);
               textViewQuestion.setText("Answer 1 is correct");
               break;
               case 2:
               rb2.setTextColor(Color.GREEN);
               textViewQuestion.setText("Answer 2 is correct");
               break;
               case 3:
               rb3.setTextColor(Color.GREEN);
               textViewQuestion.setText("Answer 3 is correct");
               break;
           }
       if (questionCounter < questionCountTotal) {
           buttonConfirm.setText("Next");
       }else{
           buttonConfirm.setText("Finish");
       }
    }
}
