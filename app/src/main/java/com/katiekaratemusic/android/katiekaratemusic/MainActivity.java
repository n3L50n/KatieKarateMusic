package com.katiekaratemusic.android.katiekaratemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton libraryButton = (ImageButton) findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainActivity.this, MusicLibrary.class);
                startActivity(libraryIntent);
            }
        });

        ImageButton uploadButton = (ImageButton) findViewById(R.id.upload_button);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uploadIntent = new Intent(MainActivity.this, UploadScreen.class);
                startActivity(uploadIntent);
            }
        });

        ImageButton createButton = (ImageButton) findViewById(R.id.create_button);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createIntent = new Intent(MainActivity.this, CreateNewActivity.class);
                startActivity(createIntent);
            }
        });
    }
}
