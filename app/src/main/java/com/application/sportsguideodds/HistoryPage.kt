package com.application.sportsguideodds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HistoryPage : AppCompatActivity() {

    private var btn1 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_page)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            onBackPressed()
        }
    }
}