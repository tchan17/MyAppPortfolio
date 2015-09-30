package com.example.android.myappportfolio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton = (Button) findViewById(R.id.spotifybutton);

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Spotify_streamer_Activity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastspotify);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


        Button scoresButton = (Button) findViewById(R.id.scoresbutton);


        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scores_Activity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastscores);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button libraryButton = (Button) findViewById(R.id.librarybutton);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Library_Activity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastlibrary);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button builditButton = (Button) findViewById(R.id.builditbutton);

        builditButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Build_It_Bigger_Activity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastbuildit);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button baconButton = (Button) findViewById(R.id.baconbutton);

        baconButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bacon_Reader_Activity.class);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastbacon);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button capstoneButton = (Button) findViewById(R.id.capstonebutton);

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toastcapstone);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent intent = new Intent(MainActivity.this, Capstone_Activity.class);
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
