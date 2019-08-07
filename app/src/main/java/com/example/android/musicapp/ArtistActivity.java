package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView artists = (TextView) findViewById(R.id.eminem);
        artists.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Eminem";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
        TextView artists1 = (TextView) findViewById(R.id.camilla_cabello);
        artists1.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Now Playing Camilla Cabello";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        TextView artists2 = (TextView) findViewById(R.id.MO);
        artists2.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                String text = "Playing MO";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }

        });

        Button songs = (Button) findViewById(R.id.songs_button);
        songs.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ArtistActivity.this,SongsActivity.class);

                startActivity(numbersIntent);

            }

        });
        Button albums = (Button) findViewById(R.id.albums_button);
        albums.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ArtistActivity.this, AlbumActivity.class);

                startActivity(numbersIntent);

            }
        });

        Button payments = (Button) findViewById(R.id.payments_button);
        payments.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ArtistActivity.this, PaymentsActivity.class);

                startActivity(numbersIntent);

            }
        });
        Button nowplaying = (Button) findViewById(R.id.nowplaying_button);
        nowplaying.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ArtistActivity.this, NowPlayingActivity.class);

                startActivity(numbersIntent);

            }
        });
    }
}
