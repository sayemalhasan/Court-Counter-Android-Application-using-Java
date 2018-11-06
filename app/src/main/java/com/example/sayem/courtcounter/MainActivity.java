package com.example.sayem.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int totalScore = 0;

    public void threePoints(View view){
        totalScore = totalScore +3;
        displayForTeamA(totalScore);
    }
    public void twoPoints(View view){
        totalScore = totalScore +2;
        displayForTeamA(totalScore);
    }
    public void freeThrow(View view){
        totalScore = totalScore +1;
        displayForTeamA(totalScore);
    }

    int totalScoreForB = 0;

    public void threePointsForB(View view){
        totalScoreForB = totalScoreForB +3;
        displayForTeamB(totalScoreForB);
    }
    public void twoPointsForB(View view){
        totalScoreForB = totalScoreForB +2;
        displayForTeamB(totalScoreForB);
    }
    public void freeThrowForB(View view){
        totalScoreForB = totalScoreForB +1;
        displayForTeamB(totalScoreForB);
    }

    public void displayForTeamA(int score){
        TextView textView = (TextView)findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView textView = (TextView)findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(score));
    }

    public void setReset(View view) {
        totalScore = 0;
        displayForTeamA(totalScore);
        totalScoreForB = 0;
        displayForTeamB(totalScoreForB);
    }
}
