package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //  The action taken after clicking on songs \\

                TextView songs = (TextView) findViewById(R.id.songs);
                songs.setOnClickListener(new View.OnClickListener() {

                    // The code in this method will be executed when the numbers View is clicked on.

                    @Override
                    public void onClick(View view) {

                        Intent numbersIntent = new Intent(MainActivity.this, SongsActivity.class);

                        startActivity(numbersIntent);

                    }

                });
        //  The action taken after clicking on artists  \\

                TextView artists = (TextView) findViewById(R.id.artists);
                artists.setOnClickListener(new View.OnClickListener() {

                    // The code in this method will be executed when the numbers View is clicked on.

                    @Override
                    public void onClick(View view) {

                        Intent numbersIntent = new Intent(MainActivity.this, ArtistActivity.class);

                        startActivity(numbersIntent);

                    }

                });
        //  The action taken after clicking on albums \\
                TextView albums = (TextView) findViewById(R.id.albums);
                albums.setOnClickListener(new View.OnClickListener() {

                    // The code in this method will be executed when the numbers View is clicked on.

                    @Override
                    public void onClick(View view) {

                        Intent numbersIntent = new Intent(MainActivity.this,AlbumActivity.class);

                        startActivity(numbersIntent);

                    }

                });
        //  The action taken after clicking on payments \\

        TextView payment = (TextView) findViewById(R.id.payments);
        payment.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, PaymentsActivity.class);

                startActivity(numbersIntent);

            }

        });
        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);
        nowplaying.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                startActivity(numbersIntent);

            }

        });
    }
}
