package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help);

        TextView txtView = findViewById(R.id.textView1);
        txtView.setText("Welcome");

        Bundle b = getIntent().getExtras();
        String tmpString = b.getString("helpString");

        txtView.setText(tmpString);

        /*TextView myTextView = new TextView (this);
        myTextView.setText("Some Help Text");

        if (savedInstanceState != null) {
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));

        }
        Bundle b = getIntent().getExtras();
        String helpText = b.getString("helpString");
        myTextView.setText(helpText);
        */
    }
}