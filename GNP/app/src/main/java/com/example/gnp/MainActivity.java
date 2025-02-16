package com.example.gnp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2, num3;
    private TextView result;
    private Button findLargest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editText1);
        num2 = findViewById(R.id.editText2);
        num3 = findViewById(R.id.editText3);
        result = findViewById(R.id.textViewResult);
        findLargest = findViewById(R.id.button);

        findLargest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findLargestNumber();
            }
        });
    }

    private void findLargestNumber() {
        String text1 = num1.getText().toString();
        String text2 = num2.getText().toString();
        String text3 = num3.getText().toString();

        if (text1.isEmpty() || text2.isEmpty() || text3.isEmpty()) {
            result.setText("Please enter all numbers");
            return;
        }

        int n1 = Integer.parseInt(text1);
        int n2 = Integer.parseInt(text2);
        int n3 = Integer.parseInt(text3);

        int largest = Math.max(n1, Math.max(n2, n3));

        result.setText("Largest Number: " + largest);
    }
}
