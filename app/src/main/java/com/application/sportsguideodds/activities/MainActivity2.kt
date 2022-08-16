package com.application.sportsguideodds.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import com.application.sportsguideodds.MyModel
import com.application.sportsguideodds.R
import com.application.sportsguideodds.adapter.MyAdapter2
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter2: MyAdapter2

    private var im1 : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        init actionbar
        loadCards()
//        add page change listener
        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                //change title of actionbar
                var title = myModelList[position].title
            }
            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {
            }
        })

        im1 = findViewById(R.id.im1)
        im1?.setOnClickListener{
            onBackPressed()
        }
    }
    private fun loadCards(){
//        init List
        myModelList = ArrayList()

//        add items/data to list
        myModelList.add(MyModel(
            "BASKETBALL",
         R.string.vp1,
            R.drawable.baa))
        myModelList.add(MyModel(
            "BOXING",
            R.string.vp2,
            R.drawable.b11))
        myModelList.add(MyModel(
            "FOOTBALL",
            R.string.vp3,
            R.drawable.b22))
        myModelList.add(MyModel(
            "BILLIARDS",
            R.string.vp4,
            R.drawable.b33))
        myModelList.add(MyModel(
            "MOTO GP",
            R.string.vp5,
            R.drawable.b444))
        myModelList.add(MyModel(
            "GOLF",
            R.string.vp6,
            R.drawable.b66))
        myModelList.add(MyModel(
            "BOWLING",
            R.string.vp7,
            R.drawable.bowling))
        myModelList.add(MyModel(
            "HORSE RACING",
            R.string.vp8,
            R.drawable.b55))
        myModelList.add(MyModel(
            "BASEBALL",
            R.string.vp9,
            R.drawable.b77))
        myModelList.add(MyModel(
            "AMERICAN FOOTBALL",
            R.string.vp10,
            R.drawable.af))

//        setup adapter
        myAdapter2 = MyAdapter2(this, myModelList)

//        set adapter to viewpager
        viewPager.adapter = myAdapter2

//        set default padding
        viewPager.setPadding(100,0,100,0)
    }
}