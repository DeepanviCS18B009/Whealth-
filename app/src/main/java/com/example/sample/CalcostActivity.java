package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcostActivity extends AppCompatActivity {
    Button Next;
    public TextView foodname;
    public TextView replacementname;
    public TextView foodcalories;
    public TextView repcalories;
    public TextView foodcost;
    public TextView repcost;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcost);

        Next = (Button)findViewById(R.id.button_next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MacrosIntent = new Intent(CalcostActivity.this, MacrosActivity.class);
                startActivity(MacrosIntent);
            }

        });


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
        replacementname = findViewById(R.id.textView2);
        foodcalories = findViewById(R.id.textView18);
        repcalories = findViewById(R.id.textView3);
        foodcost = findViewById(R.id.textView4);
        repcost = findViewById(R.id.textView5);

        foodname.setText(food);
        replacementname.setText(replacement);
        foodcalories.setText(fcalories);
        repcalories.setText(rcalories);
        foodcost.setText(fmoney);
        repcost.setText(rmoney);

    }
}