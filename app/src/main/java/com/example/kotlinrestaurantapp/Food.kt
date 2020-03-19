package com.example.kotlinrestaurantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food.*

class Food : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        lvFood.setOnItemClickListener( {_, _, index, _ ->
            val intent = Intent(this, Food_details::class.java)
            when (index) {
                0 -> {// if first item is clicked
                    intent.putExtra("food_index",index)
                    startActivity(intent)
                }
                1 -> {// if second item is clicked
                    intent.putExtra("food_index",index)
                    startActivity(intent)
                }
                2 -> {// if third item is clicked
                    intent.putExtra("food_index",index)
                    startActivity(intent)
                }
            }// end when
        }
        )

    }
}
