package com.example.android.musicapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView songs = (TextView) findViewById(R.id.lean_On);
        songs.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Lean On";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        TextView songs1 = (TextView) findViewById(R.id.nights_With_You);
        songs1.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Nights With You";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
        TextView songs2 = (TextView) findViewById(R.id.mockingbird);
        songs2.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Mockingbird";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });


        TextView songs3 = (TextView) findViewById(R.id.never_Be_The_Same);
        songs3.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Never Be The Same";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        TextView songs4 = (TextView) findViewById(R.id.havana);
        songs4.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Havana";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
        TextView songs5 = (TextView) findViewById(R.id.river);
        songs5.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing River";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        TextView songs6 = (TextView) findViewById(R.id.walk_On_Water);
        songs6.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Walk On Water";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        Button artists = (Button) findViewById(R.id.artists_button);
        artists.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(SongsActivity.this,ArtistActivity.class);

                startActivity(numbersIntent);


            }

        });
        Button albums = (Button) findViewById(R.id.albums_button);
        albums.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(SongsActivity.this, AlbumActivity.class);

                startActivity(numbersIntent);

            }

        });
        Button payments = (Button) findViewById(R.id.payments_button);
        payments.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(SongsActivity.this, PaymentsActivity.class);

                startActivity(numbersIntent);

            }
        });
        Button nowplaying = (Button) findViewById(R.id.nowplaying_button);
        nowplaying.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.


            public void onClick(View view) {
                Intent numbersIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);

                startActivity(numbersIntent);

            }
        });
    }
}