package com.example.ctadmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ctadmin.myapplication.R;

public class MainActivity extends AppCompatActivity {
    int quizScore = 0;

    // meh
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gotoButton = (Button) findViewById(R.id.submit);
        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                RadioGroup rbGroup = (RadioGroup) findViewById(R.id.r);
                int selectedId = rbGroup.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedId);
                    String radioButtonText = selectedRadioButton.getText().toString();
                    if ((radioButtonText).equals(getString(R.string.m2))) {
                        quizScore = quizScore + 1;
                    }
                }
                RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.r1);
                int selectedId1 = rbGroup1.getCheckedRadioButtonId();
                if (selectedId1 != -1) {
                    RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId1);
                    String radioButtonText1 = selectedRadioButton1.getText().toString();
                    if ((radioButtonText1).equals(getString(R.string.m7))) {
                        quizScore = quizScore + 1;
                    }
                }

                RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.r2);
                int selectedId2 = rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.m12))) {
                        quizScore = quizScore + 1;
                    }
                }




                TextView mytextView = (TextView) findViewById(R.id.resultscore);
                mytextView.setText(" the score is "+ quizScore);
            }
        });
    }

}