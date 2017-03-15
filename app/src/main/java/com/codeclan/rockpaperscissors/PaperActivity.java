package com.codeclan.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PaperActivity extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);

        resultView = (TextView)findViewById(R.id.paperResult);
        RockPaperScissors game = new RockPaperScissors();
        resultView.setText(game.compareHands("paper"));
    }
}
