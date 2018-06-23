package com.gravelle.aaron.constructionator;

import java.lang.Integer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    String currentNumStr = "";
    String equationStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    int OnNumberButtonPress(View btn) {
        TextView btnTextView = (TextView) btn;
        currentNumStr = currentNumStr.concat(btnTextView.getText().toString());
        SetEquationTextBox(currentNumStr);
        return 0;
    }

    void OnClearButtonPress(View btn) {
        TextView numberBox = findViewById(R.id.numberBox);
        currentNumStr = "";
        SetEquationTextBox(currentNumStr);
    }

    void OnOperationButtonPress(View btn) {
        TextView btnTextView = (TextView) btn;
        equationStr = equationStr.concat(currentNumStr + btnTextView.getText().toString());
        currentNumStr = "";
        SetEquationTextBox(btnTextView.getText().toString());
    }

    void SetEquationTextBox(String str) {
        TextView numberBox = findViewById(R.id.numberBox);
        numberBox.setText(str);
    }

    void 

}
