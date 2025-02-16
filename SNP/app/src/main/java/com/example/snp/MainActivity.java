package com.example.snp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView result;
    private Button findSmallest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editText1);
        num2 = findViewById(R.id.editText2);
        result = findViewById(R.id.textViewResult);
        findSmallest = findViewById(R.id.button);

        findSmallest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findSmallestNumber();
            }
        });
    }

    private void findSmallestNumber() {
        String text1 = num1.getText().toString();
        String text2 = num2.getText().toString();

        if (text1.isEmpty() || text2.isEmpty()) {
            result.setText("Please enter both numbers");
            return;
        }

        int n1 = Integer.parseInt(text1);
        int n2 = Integer.parseInt(text2);

        int smallest = Math.min(n1, n2);

        result.setText("Smallest Number: " + smallest);
    }
}
