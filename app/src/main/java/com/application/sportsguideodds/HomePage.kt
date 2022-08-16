package com.application.sportsguideodds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.application.sportsguideodds.activities.MainActivity
import com.application.sportsguideodds.activities.MainActivity2

class HomePage : AppCompatActivity() {

    private var tv1: TextView? = null
    private var tv2: TextView? = null
    private var tv3: TextView? = null
    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        tv1 = findViewById(R.id.tv1)
        tv1?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tv2 = findViewById(R.id.tv2)
        tv2?.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        tv3 = findViewById(R.id.tv3)
        tv3?.setOnClickListener{
            val intent = Intent(this, HistoryPage::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}