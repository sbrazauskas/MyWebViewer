package com.example.sarahbrazauskas.mywebviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonUcsdGo, buttonYahooGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUcsdGo = (Button) findViewById(R.id.buttonUcsdGo);
        buttonUcsdGo.setOnClickListener(this);

        buttonYahooGo = (Button) findViewById(R.id.buttonYahooGo);
        buttonYahooGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
            {
            case R.id.buttonUcsdGo:
                Intent y;
                y = new Intent(this, UcsdActivity.class);
                startActivity(y);
                break;
            case R.id.buttonYahooGo:
                Intent u;
                u = new Intent(this, YahooActivity.class);
                startActivity(u);
                break;
            }
    }

}
