package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollbutton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //Made the dice array constant so that OnClickListener gets to know that it is not gonna change
        final int[] diceArray = {R.drawable.dice1_2x,
                R.drawable.dice2_2x,
                R.drawable.dice3_2x,
                R.drawable.dice4_2x,
                R.drawable.dice5_2x,
                R.drawable.dice6_2x
                };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Button Pressed");

                Random randomNumberGenerator = new Random();
                Random randomNumberGenerator1 = new Random();
                int number = randomNumberGenerator.nextInt(6);
                int number1 = randomNumberGenerator1.nextInt(6);
                Log.d("Dicee","THe number generated is: "+number);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number1]);
            }
        });

    }
}
