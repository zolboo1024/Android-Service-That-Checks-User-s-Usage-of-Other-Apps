package com.example.zz.androidservicethatchecksotherappsusage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zolboo Erdenebaatar
 * 11/18/2018
 * This is an example of an application that
 * tracks the phone usage of the users and display
 * what apps that users are using at any moment.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton= (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(), StartPlanService.class));
            }
        });
    }
}
