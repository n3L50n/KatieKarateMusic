package com.katiekaratemusic.android.katiekaratemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CreateNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new);

        ImageButton backButton = (ImageButton) findViewById(R.id.create_new_system_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(CreateNewActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
