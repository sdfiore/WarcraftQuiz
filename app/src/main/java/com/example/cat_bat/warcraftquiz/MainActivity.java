/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.cat_bat.warcraftquiz
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.cat_bat.warcraftquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class MainActivity extends AppCompatActivity
{
    MediaPlayer wowMusic;
    CheckBox Music;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This variable stores the data needed to play the music file.
        wowMusic = MediaPlayer.create(this, R.raw.wow_login);

        startWowTheme();

        Music = findViewById(R.id.music_check_box);
        Music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked)
                {
                    wowMusic.release();
                    Music.setText(R.string.checkbox_unchecked);
                }
                else
                {
                    Music.setText(R.string.checkbox_checked);
                }
            }
        });
    }

    // Called when the user taps the "Start Quiz" button.
    public void startQuiz(View view)
    {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        wowMusic.release();
    }

    /**
     * This method plays the World of Warcraft theme song.
     * Music only plays when app is in MainActivity.xml
     */
    public void startWowTheme()
    {
        wowMusic.setLooping(true);
        wowMusic.start();
    }

}
