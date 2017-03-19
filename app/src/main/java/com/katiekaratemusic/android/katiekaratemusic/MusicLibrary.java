package com.katiekaratemusic.android.katiekaratemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        /**
         * Return user back to Main screen from Music library
         */
        ImageButton backButton = (ImageButton) findViewById(R.id.music_library_system_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backButtonIntent = new Intent(MusicLibrary.this, MainActivity.class);
                startActivity(backButtonIntent);
            }
        });

        /**
         * Send user to Now playing screen from Library list
         */
        ImageButton talkingSongButton = (ImageButton) findViewById(R.id.talking_song_button);
        talkingSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });

        /**
         * Send user to Now playing screen from Library list
         */
        ImageButton battleSongButton = (ImageButton) findViewById(R.id.battle_song_button);
        battleSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });

        /**
         * Send user to Now playing screen from Library list
         */
        ImageButton casperSongButton = (ImageButton) findViewById(R.id.casper_song_button);
        casperSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });

        /**
         * Lead user to Edit screen where songs aspects of song can be trimmed, edited, and changed
         */
        ImageButton talkingEditButton = (ImageButton) findViewById(R.id.talking_edit_button);
        talkingEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(MusicLibrary.this, EditActivity.class);
                startActivity(editIntent);
            }
        });

        /**
         * Lead user to Edit screen where songs aspects of song can be trimmed, edited, and changed
         */
        ImageButton battleEditButton = (ImageButton) findViewById(R.id.battle_edit_button);
        battleEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(MusicLibrary.this, EditActivity.class);
                startActivity(editIntent);
            }
        });

        /**
         * Lead user to Edit screen where songs aspects of song can be trimmed, edited, and changed
         */
        ImageButton casperEditButton = (ImageButton) findViewById(R.id.casper_edit_button);
        casperEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(MusicLibrary.this, EditActivity.class);
                startActivity(editIntent);
            }
        });
    }
}
