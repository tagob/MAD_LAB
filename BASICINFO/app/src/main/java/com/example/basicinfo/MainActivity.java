package com.example.basicinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editName, editAge, editEmail;
    private TextView textResult;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editAge = findViewById(R.id.editAge);
        editEmail = findViewById(R.id.editEmail);
        textResult = findViewById(R.id.textResult);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayInfo();
            }
        });
    }

    private void displayInfo() {
        String name = editName.getText().toString();
        String age = editAge.getText().toString();
        String email = editEmail.getText().toString();

        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            textResult.setText("Please enter all details.");
        } else {
            String result = "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
            textResult.setText(result);
        }
    }
}
