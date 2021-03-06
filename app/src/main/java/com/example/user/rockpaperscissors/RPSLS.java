package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class RPSLS extends AppCompatActivity {

    TextView mInstruction;
    Button mRock;
    Button mPaper;
    Button mScissors;
    Button mLizard;
    Button mSpock;

    RPSLSGame mGame = new RPSLSGame();
    Intent mIntent;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        Log.d("RockPaperScissors", "RPSLS onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsls);

        mInstruction = (TextView)findViewById(R.id.instruction_text);
        mRock = (Button)findViewById(R.id.rock_button);
        mPaper = (Button)findViewById(R.id.paper_button);
        mScissors = (Button)findViewById(R.id.scissors_button);
        mLizard = (Button)findViewById(R.id.lizard_button);
        mSpock = (Button)findViewById(R.id.spock_button);


        mRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Rock button clicked");

                String result = mGame.play(0);
                String countsText = mGame.getCountsText();
                mIntent = new Intent(RPSLS.this, RPSResult.class);
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Paper button clicked");

                String result = mGame.play(1);
                String countsText = mGame.getCountsText();
                mIntent = new Intent(RPSLS.this, RPSResult.class);
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Scissors button clicked");

                String result = mGame.play(2);
                String countsText = mGame.getCountsText();
                mIntent = new Intent(RPSLS.this, RPSResult.class);
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mLizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Lizard button clicked");

                String result = mGame.play(3);
                String countsText = mGame.getCountsText();
                mIntent = new Intent(RPSLS.this, RPSResult.class);
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mSpock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Spock button clicked");
                String result = mGame.play(4);
                String countsText = mGame.getCountsText();
                mIntent = new Intent(RPSLS.this, RPSResult.class);
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

    }
}
