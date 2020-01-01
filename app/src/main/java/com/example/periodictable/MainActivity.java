package com.example.periodictable;

import androidx.annotation.AnyRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
public class MainActivity extends AppCompatActivity  {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click);
        mediaPlayer.start();
        Button b = (Button)view;
        String ele = b.getText().toString();
        Toast.makeText(this, "Element is : " + ele, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Detail_Activity.class);
        intent.putExtra(EXTRA_MESSAGE, ele);
        startActivity(intent);
    }
}