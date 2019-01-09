package com.softs.mt.orderandmail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivCreate;
    ImageView ivRepeat;
    ImageView ivHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCreate = findViewById(R.id.ivCreate);
        ivRepeat = findViewById(R.id.ivRepeat);
        ivHistory = findViewById(R.id.ivHistory);


        ivCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.softs.mt.orderandmail.CreateActivity.class);
                startActivity(intent);
            }
        });

    }
}
