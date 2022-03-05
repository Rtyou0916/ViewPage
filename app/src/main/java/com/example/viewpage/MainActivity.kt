package com.example.viewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.viewpage.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }
    fun setupEvents(){


    }
    fun setValues(){
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        MainViewPagerAdapter.adapter = mAdapter

        mainViewPager.offscreenPageLimit =3

        mainTabLayot.setup.

    }

}