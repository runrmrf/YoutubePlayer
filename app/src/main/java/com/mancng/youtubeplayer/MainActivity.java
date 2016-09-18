package com.mancng.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
                implements View.OnClickListener
{

    private Button btnPlaySingle;
    private Button btnStandalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlaySingle = (Button) findViewById(R.id.btnPlaySingle);
        btnStandalone = (Button) findViewById(R.id.btnStandalone);
        btnPlaySingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(MainActivity.this, YoutubeActivity.class);
                break;

            case R.id.btnStandalone:
                intent = new Intent(MainActivity.this, StandaloneActivity.class);
                break;

            default:
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
