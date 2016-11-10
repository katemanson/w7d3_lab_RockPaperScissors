package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class Main extends AppCompatActivity {

    TextView mWelcome;
    Button mRPS;
    Button mRPSLS;
    TextView mRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("RockPaperScissors", "Main onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWelcome = (TextView)findViewById(R.id.welcome_text);
        mRPS = (Button)findViewById(R.id.rps_button);
        mRPSLS = (Button)findViewById(R.id.rpsls_button);
        mRules = (TextView)findViewById(R.id.rules_text);
        mRules.setMovementMethod(new ScrollingMovementMethod());

        mRPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Rock, Paper, Scissors button clicked");

                Intent intentRPS = new Intent(Main.this, RPS.class);
                startActivity(intentRPS);

            }
        });

        mRPSLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Rock, Paper, Scissors, Lizard, Spock button clicked");

                Intent intentRPSLS = new Intent(Main.this, RPSLS.class);
                startActivity(intentRPSLS);

            }
        });




    }

}
