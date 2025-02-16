package com.example.fc;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnIncreaseFont, btnChangeColor;
    private int colorIndex = 0;
    private float fontSize = 20f;
    private final int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btnIncreaseFont = findViewById(R.id.buttonIncreaseFont);
        btnChangeColor = findViewById(R.id.buttonChangeColor);

        btnIncreaseFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fontSize += 5;
                if (fontSize > 50) {
                    fontSize = 20;
                }
                textView.setTextSize(fontSize);
            }
        });

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(colors[colorIndex]);
                colorIndex = (colorIndex + 1) % colors.length;
            }
        });
    }
}
