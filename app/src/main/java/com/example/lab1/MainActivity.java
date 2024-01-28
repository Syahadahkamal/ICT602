package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    Button resetButton;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        resetButton = (Button) findViewById(R.id.button2);
    }
    public void displayText(View view){
        String text = etName.getText().toString();
        tvMessage.setText("WELCOME!" + text);
        Toast toast = Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void resetText(View view){
        tvMessage.setText("WELCOME!");
        etName.getText().clear();
        Toast toast = Toast.makeText(this,"Name cleared", Toast.LENGTH_SHORT);
        toast.show();
    }

}