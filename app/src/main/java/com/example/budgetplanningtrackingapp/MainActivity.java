package com.example.budgetplanningtrackingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView budgetCardView, todayCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        budgetCardView = findViewById(R.id.budgetCardView);
        todayCardView = findViewById(R.id.todayCardView);

        budgetCardView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BudgetActivity.class);
            startActivity(intent);
        });

        todayCardView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TodaySpendingActivity.class);
            startActivity(intent);
        });
    }
}