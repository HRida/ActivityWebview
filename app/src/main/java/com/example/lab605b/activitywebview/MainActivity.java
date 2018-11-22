package com.example.lab605b.activitywebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field = findViewById(R.id.keyWord);
    }
    //"http://www.google.com?#q=+ // add this in the url string to make the app search browser
    public void open(View view){
        Intent i = new Intent(this, WebView.class);
        String word="http://www.google.com?#q=+"+field.getText().toString();
        i.putExtra("N", word);
        startActivity(i);
    }// end method open

    public void clear(View view){
        field.setText("");
    }
}