package com.miranda.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button_plus.setOnClickListener {
            if (fist_view.text.isNotEmpty() && second_view.text.isNotEmpty()) {
                var firstView = fist_view.text.toString().toInt()
                var secondView = second_view.text.toString().toInt()
                var str = firstView.plus(secondView)
                text_view.text = str.toString()
            }
        }
        multiply.setOnClickListener {
            if (fist_view.text.isNotEmpty() && second_view.text.isNotEmpty()) {
                var firstView = fist_view.text.toString().toInt()
                var secondView = second_view.text.toString().toInt()
                var sum = firstView * secondView
                text_view.text = sum.toString()
            }

        }
        button_m.setOnClickListener {
            if (fist_view.text.isNotEmpty() && second_view.text.isNotEmpty()) {
                var firstView = fist_view.text.toString().toInt()
                var secondView = second_view.text.toString().toInt()
                var str = firstView.minus(secondView)
                text_view.text = str.toString()
            }
        }
        division.setOnClickListener {
            if (fist_view.text.isNotEmpty() && second_view.text.isNotEmpty()) {
                var firstView = fist_view.text.toString().toInt()
                var secondView = second_view.text.toString().toInt()
                var str = firstView / secondView
                text_view.text = str.toString()
            }
        }


    }


}
