package com.example.kotlinrestaurantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lvOptions.setOnItemClickListener( {_, _, index, _ ->
            if (index == 0) {// if first item is clicked
                val intent = Intent(this, Food::class.java)
                startActivity(intent)
            }
        }
        )

    }
}
