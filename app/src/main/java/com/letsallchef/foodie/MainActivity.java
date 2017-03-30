package com.letsallchef.foodie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button goButton;
    EditText inputIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goButton = (Button)findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inputIP  = (EditText)findViewById(R.id.inputIP);
                String inIP = inputIP.getText().toString();
                Intent i = new Intent(getApplicationContext(),WebActivity.class);
                i.putExtra("inIP", inIP);
                startActivity(i);
            }
        });
    }
}

