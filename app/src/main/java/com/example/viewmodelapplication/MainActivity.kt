package com.example.viewmodelapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var number = 0
//        textView.text = number.toString()
//
//        button.setOnClickListener {
//            number++
//            textView.text = number.toString()
//        }

        // view model instance
        var viewModel : MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // setting text view
        textView.text = viewModel.number.toString()

        // handling button click event
        button.setOnClickListener {
            viewModel.addOne()
            textView.text = viewModel.number.toString()
        }
    }
}