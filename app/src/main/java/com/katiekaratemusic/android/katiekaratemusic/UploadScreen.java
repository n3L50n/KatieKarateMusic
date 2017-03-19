package com.katiekaratemusic.android.katiekaratemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UploadScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_screen);

        ImageButton backButton = (ImageButton) findViewById(R.id.upload_system_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(UploadScreen.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

        ImageButton libraryButton = (ImageButton) findViewById(R.id.upload_screen_go_to_library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(UploadScreen.this, MusicLibrary.class);
                startActivity(libraryIntent);
            }
        });

    }
}
