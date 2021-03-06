package com.example.uwmlh.psykick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String user = "Nathaniel Ngo";
    public static final long studentNo = 20457412;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button notifyButton = (Button) findViewById(R.id.notify);
        Button questionsButton = (Button) findViewById(R.id.questionsButton);
        notifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateNotificationActivity.class);
                startActivity(intent);
            }
        });
        questionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionnaireActivity.class);
                startActivity(intent);
            }
        });
    }


}
