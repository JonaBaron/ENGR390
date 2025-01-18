package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView nameView;
    EditText edName;
    Button showTextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("checkLiceCycle", "OnCreate called");

        setContentView(R.layout.activity_main);

        nameView = findViewById(R.id.textView);
        edName = findViewById(R.id.editTextText);
        showTextButton = findViewById(R.id.button);

        showTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edName.getText().toString();

                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("name", s);
                startActivity(intent);

            }
        });

    }
// on start
    @Override
    protected void onStart() {
        super.onStart();

        Log.d("checkLiceCycle", "OnStart called");
    }
}