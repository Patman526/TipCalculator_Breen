package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        try {
            int bill = Integer.parseInt(billText.getText().toString());
            int tip = Integer.parseInt(tipText.getText().toString());

            if(bill < 0 || tip < 0){
                Toast toast = Toast.makeText(getApplicationContext(), "No negatives. Try again", Toast.LENGTH_SHORT);
                toast.show();
                return;
            }

            double answer = bill + (bill * ((double) tip / 100));

            ansText.setText("Bill: $" + bill + "\n" +
                    "Tip: " + tip + "%\n" +
                    "Final Cost: $" + answer);
        } catch(Exception e){
            Toast toast = Toast.makeText(getApplicationContext(), "Invalid input. Try again", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
