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

        ImageButton talkingSongButton = (ImageButton) findViewById(R.id.talking_song_button);
        talkingSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });

        ImageButton battleSongButton = (ImageButton) findViewById(R.id.battle_song_button);
        battleSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });

        ImageButton casperSongButton = (ImageButton) findViewById(R.id.casper_song_button);
        casperSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(songIntent);
            }
        });
    }
}
