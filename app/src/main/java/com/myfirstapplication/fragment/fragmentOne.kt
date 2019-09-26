package com.myfirstapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class fragmengOne: Fragment(){

    var myStr: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view = inflater.inflate(R.layout.fragment_one, container, false)

        view.fOmeB1.setOnClickListener(View.OnClickListener {

            myStr = fOneT1.text.toString()

            var fragTwo = fragmentTwo()
            var myBundle = Bundle()
            myBundle.putString("theKey", myStr)
            fragTwo.arguments = myBundle

            var thisFrag = fragmentManager!!.beginTransaction()
            thisFrag.replace(R.id.mainAct, fragTwo).commit()
        })

        return view

    }

}