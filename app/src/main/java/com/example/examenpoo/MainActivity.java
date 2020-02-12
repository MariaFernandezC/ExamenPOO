package com.example.examenpoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView DetectarBandera =findViewById(R.id.DetectionBandera);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetectarBandera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detectionFace2 = new Intent (MainActivity.this, DetectarBandera.class);
                MainActivity.this.startActivity(detectionFace2);
                finish();
            }
        });

    }
}
