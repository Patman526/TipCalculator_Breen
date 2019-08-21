package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){
        EditText billText = (EditText) findViewById(R.id.billEditText);
        EditText tipText = (EditText) findViewById(R.id.tipEditText);
        TextView ansText = (TextView) findViewById(R.id.ansTextView);

        int bill = Integer.parseInt(billText.getText().toString());
        int tip = Integer.parseInt(tipText.getText().toString());

        double answer = bill + (bill * ((double)tip / 100));

        ansText.setText("Bill: $" + bill + "\n" +
                "Tip: " + tip + "%\n" +
                "Final Cost: $" + answer);
    }
}
