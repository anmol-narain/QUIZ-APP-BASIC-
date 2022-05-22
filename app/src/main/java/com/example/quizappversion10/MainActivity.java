package com.example.quizappversion10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Liverpool won the champions league 6 times ", "Ac MIlan won CL 7 times","Real madrid has most wins in CL", "Messi and Ronaldo are the goats"};
    private boolean[] answers = {true,true,true,true};
    private int index = 0;
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        question = findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index<=questions.length-1){
                    if(answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Final Score is "+ score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                        score = 0;
                        index = 0;
                        question.setText(questions[index]);
                    }
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(answers[index] == false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Final Score is "+ score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                        score = 0;
                        index = 0;
                        question.setText(questions[index]);
                    }
                }
            }
        });
    }
}