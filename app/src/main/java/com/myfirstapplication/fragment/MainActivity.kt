package com.myfirstapplication.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var minFrag = fragmengOne()
        var thiFrag = supportFragmentManager.beginTransaction()
        thiFrag.replace(R.id.mainAct, minFrag).commit()

    }
}
