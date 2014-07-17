package com.ambergleam.dicewear;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

import java.util.Random;

public class DiceListener implements View.OnClickListener {

    private Context mContext;
    private int mSides;

    public DiceListener(Context context, int sides) {
        mContext = context;
        mSides = sides;
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        int roll = random.nextInt(mSides) + 1;
        String title = mContext.getResources().getString(R.string.dialog_title, mSides);
        String message = ((Integer) roll).toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setTitle(title)
                .setMessage(message)
                .setNeutralButton(android.R.string.ok, null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

};