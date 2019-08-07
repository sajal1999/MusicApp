package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button songs = (Button) findViewById(R.id.songs_button);
        songs.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            public void onClick(View view) {
                Intent numbersIntent = new Intent(NowPlayingActivity.this,SongsActivity.class);

                startActivity(numbersIntent);

            }
        });

            Button albums = (Button) findViewById(R.id.albums_button);
        albums.setOnClickListener(new View.OnClickListener() {

                // The code in this method will be executed when the numbers View is clicked on.


                public void onClick(View view) {
                    Intent numbersIntent = new Intent(NowPlayingActivity.this, AlbumActivity.class);

                    startActivity(numbersIntent);

                }
        });

        Button payments = (Button) findViewById(R.id.payments_button);
        payments.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.


            public void onClick(View view) {
                Intent numbersIntent = new Intent(NowPlayingActivity.this, PaymentsActivity.class);

                startActivity(numbersIntent);

            }
        });

            Button artists = (Button) findViewById(R.id.artists_button);
        artists.setOnClickListener(new View.OnClickListener() {

                // The code in this method will be executed when the numbers View is clicked on.


                public void onClick(View view) {
                    Intent numbersIntent = new Intent(NowPlayingActivity.this, ArtistActivity.class);

                    startActivity(numbersIntent);

                }
        });
    }
}
