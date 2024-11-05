package com.example.task5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button like;
    private Button remove;
    private TextView likeCount;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.likeButton);
        remove = findViewById(R.id.removeButton);
        likeCount = findViewById(R.id.likeCount);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                likeCount.setText(String.valueOf(count) + " polubień");
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if(!(count<0)){
                    likeCount.setText(String.valueOf(count) + " polubień");
                } else {
                    Toast.makeText(getApplicationContext(), "Nie może być mniej niż 0 polubień", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}