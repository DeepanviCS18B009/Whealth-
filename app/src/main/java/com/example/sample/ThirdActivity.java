package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button burger = (Button) findViewById(R.id.burger);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Burger";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Burger";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button pizza = (Button) findViewById(R.id.pizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Pizza";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Pizza";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button chips = (Button) findViewById(R.id.chips);
        chips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Chips";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Chips";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button doughnut = (Button) findViewById(R.id.doughnut);
        doughnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Doughnut";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Doughnut";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });

        Button burrito = (Button) findViewById(R.id.burrito);
        burrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Burrito";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Burrito";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button hotdogs = (Button) findViewById(R.id.hotdogs);
        hotdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "hot_dogs";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Hot dogs";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button chocolate = (Button) findViewById(R.id.chocolate);
        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Chocolate";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Chocolate";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button cheesecake = (Button) findViewById(R.id.cheesecake);
        cheesecake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Cheesecake";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Cheesecake";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button coke = (Button) findViewById(R.id.coke);
        coke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Coke";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Coke";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });
        Button nuggets = (Button) findViewById(R.id.nuggets);
        nuggets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                Intent tocal = new Intent(ThirdActivity.this, CalcostActivity.class);

                String n = "Nuggets";
                String replacement = databaseAccess.getReplacement(n);
                String fcarbs = databaseAccess.getfcarbs(n);
                String fproteins = databaseAccess.getfproteins(n);
                String ffats = databaseAccess.getffats(n);
                String fcalories = databaseAccess.getfcalories(n);
                String rcarbs = databaseAccess.getrcarbs(n);
                String rproteins = databaseAccess.getrproteins(n);
                String rfats = databaseAccess.getrfats(n);
                String rcalories = databaseAccess.getrcalories(n);
                String fmoney = databaseAccess.getfmoney(n);
                String rmoney = databaseAccess.getrmoney(n);
                String food = "Nuggets";


                tocal.putExtra("replacement", replacement);
                tocal.putExtra("fcarbs", fcarbs);
                tocal.putExtra("fproteins", fproteins);
                tocal.putExtra("ffats", ffats);
                tocal.putExtra("fmoney", fmoney);
                tocal.putExtra("fcalories", fcalories);
                tocal.putExtra("rcarbs", rcarbs);
                tocal.putExtra("rproteins", rproteins);
                tocal.putExtra("rfats", rfats);
                tocal.putExtra("rmoney", rmoney);
                tocal.putExtra("rcalories", rcalories);
                tocal.putExtra("food",food);

                databaseAccess.close();

                startActivity(tocal);
            }
        });

    }
}