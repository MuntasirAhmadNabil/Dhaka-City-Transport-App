package com.example.nabil.drawerlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class FaqActivity extends AppCompatActivity {

    private TextView destinationanstv;
    private TextView routeanstv;
    private TextView rateanstv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);


      //  Toolbar toolbar= (Toolbar) findViewById(R.id.toolbarfaq);
     //   setSupportActionBar(toolbar);

      //  getSupportActionBar().setTitle("FAQ");

        Intent intent= getIntent();

        destinationanstv = (TextView) findViewById(R.id.destinationanswer);
        routeanstv= (TextView) findViewById(R.id.routeanswer);
        rateanstv= (TextView) findViewById(R.id.rateanswer);

        destinationanstv.setText(" - Go to home page. Then enter your location & destination and search.");
        routeanstv.setText(" - Go to all bus & select your desired bus. The bus will appear with all routes.");
        rateanstv.setText(" - Go to 'rate this app' & select stars according to your desired rating.");

    }
}
