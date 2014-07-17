package com.ambergleam.dicewear;

import android.view.View;

import java.util.Random;

public class DiceListener implements View.OnClickListener {

    int mSides;

    public DiceListener(int sides) {
        mSides = sides;
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        int roll = random.nextInt(mSides) + 1;
        // TODO - display value of the die roll
    }

};