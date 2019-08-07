package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        TextView album = (TextView) findViewById(R.id.eminem_album);
        album.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Curtain Call Album";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
        TextView album1 = (TextView) findViewById(R.id.camilla_cabello_album);
        album1.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Cabello Album";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        TextView album2 = (TextView) findViewById(R.id.MO_album);
        album2.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Playing Glass Album";
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
                Intent numbersIntent = new Intent(AlbumActivity.this,SongsActivity.class);

                startActivity(numbersIntent);

            }

        });
        Button artists = (Button) findViewById(R.id.artists_button);
        artists.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(AlbumActivity.this, ArtistActivity.class);

                startActivity(numbersIntent);

            }
        });

        Button payments = (Button) findViewById(R.id.payments_button);
        payments.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(AlbumActivity.this, PaymentsActivity.class);

                startActivity(numbersIntent);

            }
        });
        Button nowplaying = (Button) findViewById(R.id.nowplaying_button);
        nowplaying.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.


            public void onClick(View view) {
                Intent numbersIntent = new Intent(AlbumActivity.this, NowPlayingActivity.class);

                startActivity(numbersIntent);

            }
        });
    }
}
