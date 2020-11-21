package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MacrosActivity extends AppCompatActivity {

    public TextView foodname;
    public TextView replacementname;
    public TextView foodcarbs;
    public TextView repcarbs;
    public TextView foodproteins;
    public TextView repproteins;
    public TextView foodfats;
    public TextView repfats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros);

        Intent tocal = getIntent();
        String replacement = tocal.getStringExtra("replacement");
        String fcarbs = tocal.getStringExtra("fcarbs");
        String fproteins = tocal.getStringExtra("fproteins");
        String ffats = tocal.getStringExtra("ffats");
        String fcalories = tocal.getStringExtra("fcalories");
        String rcarbs = tocal.getStringExtra("rcarbs");
        String rproteins = tocal.getStringExtra("rproteins");
        String rfats = tocal.getStringExtra("rfats");
        String rcalories = tocal.getStringExtra("rcalories");
        String fmoney = tocal.getStringExtra("fmoney");
        String rmoney = tocal.getStringExtra("rmoney");
        String food = tocal.getStringExtra("food");


        foodname = findViewById(R.id.textView16);
        replacementname = findViewById(R.id.textView21);
        foodcarbs = findViewById(R.id.textView18);
        repcarbs= findViewById(R.id.textView22);
        foodproteins = findViewById(R.id.textView19);
        repproteins = findViewById(R.id.textView23);
        foodfats = findViewById(R.id.textView20);
        repfats= findViewById(R.id.textView24);

        foodname.setText(food);
        replacementname.setText(replacement);
        foodcarbs.setText(fcarbs);
        repcarbs.setText(rcarbs);
        foodproteins.setText(fproteins);
        repproteins.setText(rproteins);
        foodfats.setText(ffats);
        repfats.setText(rfats);

    }



}