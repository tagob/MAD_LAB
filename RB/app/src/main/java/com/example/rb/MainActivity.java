package com.example.rb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button btnSubmit;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnSubmit = findViewById(R.id.btnSubmit);
        textResult = findViewById(R.id.textResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaySelectedCourse();
            }
        });
    }

    private void displaySelectedCourse() {
        int selectedId = radioGroup.getCheckedRadioButtonId();

        if (selectedId == -1) {
            textResult.setText("Please select a course.");
        } else {
            RadioButton selectedRadioButton = findViewById(selectedId);
            textResult.setText("Selected Course: " + selectedRadioButton.getText());
        }
    }
}
