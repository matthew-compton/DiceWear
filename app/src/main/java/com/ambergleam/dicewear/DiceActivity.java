package com.ambergleam.dicewear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.Button;

public class DiceActivity extends Activity {

    private Button mButton_d20;
    private Button mButton_d3;
    private Button mButton_d4;
    private Button mButton_d6;
    private Button mButton_d8;
    private Button mButton_d10;
    private Button mButton_d12;
    private Button mButton_d100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dice);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

                mButton_d20 = (Button) stub.findViewById(R.id.button_d20);
                mButton_d20.setOnClickListener(new DiceListener(20));

                mButton_d3 = (Button) stub.findViewById(R.id.button_d3);
                mButton_d3.setOnClickListener(new DiceListener(3));

                mButton_d4 = (Button) stub.findViewById(R.id.button_d4);
                mButton_d4.setOnClickListener(new DiceListener(4));

                mButton_d6 = (Button) stub.findViewById(R.id.button_d6);
                mButton_d6.setOnClickListener(new DiceListener(6));

                mButton_d8 = (Button) stub.findViewById(R.id.button_d8);
                mButton_d8.setOnClickListener(new DiceListener(8));

                mButton_d10 = (Button) stub.findViewById(R.id.button_d10);
                mButton_d10.setOnClickListener(new DiceListener(10));

                mButton_d12 = (Button) stub.findViewById(R.id.button_d12);
                mButton_d12.setOnClickListener(new DiceListener(12));

                mButton_d100 = (Button) stub.findViewById(R.id.button_d100);
                mButton_d100.setOnClickListener(new DiceListener(100));

            }
        });

    }

}