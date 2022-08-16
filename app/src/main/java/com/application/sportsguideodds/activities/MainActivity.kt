package com.application.sportsguideodds.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.sportsguideodds.Details
import com.application.sportsguideodds.adapter.MyAdapter
import com.application.sportsguideodds.R

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Details>

    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var briefNews : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageId = arrayOf(R.drawable.odds, R.drawable.odds, R.drawable.odds,
            R.drawable.odds, R.drawable.odds, R.drawable.odds, R.drawable.odds, R.drawable.odds)

        heading = arrayOf("Methods of Sports Prediction",
        "Rating for Time Independent Least Squares",
        "Markov Chain Monte Carlo with Time Dependence", "Arbitrage betting",
        "Value betting", "Stats-based betting system",
        "Follow betting tipsters", "Straightforward betting method")

        briefNews = arrayOf(
            getString(R.string.conn1),
            getString(R.string.conn2),
            getString(R.string.conn3),
            getString(R.string.conn4),
            getString(R.string.conn5),
            getString(R.string.conn6),
            getString(R.string.conn7),
            getString(R.string.conn8),

        )

        newRecyclerView = findViewById(R.id.recyclerItems)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Details>()
        getUserdata()
    }

    private fun getUserdata() {

        for(i in imageId.indices){

    val news = Details(imageId[i], heading[i],briefNews[i])
    newArrayList.add(news)
}
        val adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter
}
}



