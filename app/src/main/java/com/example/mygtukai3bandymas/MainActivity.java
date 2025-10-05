package com.example.mygtukai3bandymas;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView myText = findViewById(R.id.textMain);
        Button Mixer = findViewById(R.id.btnChange);
        Button Chameleon = findViewById(R.id.btnChangeCol);

        Mixer.setOnClickListener(v -> myText.setText("Labas Pasauli!"));
        Chameleon.setOnClickListener(v -> myText.setTextColor(Color.parseColor("#9F2B68")));


    }

}