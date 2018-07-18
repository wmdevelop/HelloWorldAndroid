package com.mwdevp.android.helloworldkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var switch:Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(switch){
                tv_hello.visibility= View.VISIBLE
                button.text="Hide"
                switch=false
            }
            else
            {
                tv_hello.visibility= View.INVISIBLE
                button.text="Show"
                switch=true
            }
        }
    }
}
