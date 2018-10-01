package edu.csumb.anto1985.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Joe", "button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });

    }
}
