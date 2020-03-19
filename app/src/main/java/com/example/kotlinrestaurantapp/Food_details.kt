package com.example.kotlinrestaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class Food_details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val index: Int =intent.getIntExtra("food_index",0)// get food index from intent
        val foodArray: Array<String> = resources.getStringArray(R.array.food)//convert string array to array of string

        val food_description_array=ArrayList<String>()

        food_description_array.add("Pizza with mozeralla cheese")
        food_description_array.add("Beef burger with cheese and fries")
        food_description_array.add("chicken wings with barbecue flavour")

        when (index) {
            0 -> {// if first item is clicked
                ivFoodImage.setImageResource(R.drawable.pizza)
                tvFoodName.setText(foodArray[index].toString())
                tvFoodDesc.setText(food_description_array.get(index))
            }
            1 -> {// if second item is clicked
                ivFoodImage.setImageResource(R.drawable.burger)
                tvFoodName.setText(foodArray[index].toString())
                tvFoodDesc.setText(food_description_array.get(index))
            }
            2 -> {// if third item is clicked
                ivFoodImage.setImageResource(R.drawable.wings)
                tvFoodName.setText(foodArray[index].toString())
                tvFoodDesc.setText(food_description_array.get(index))
            }
        }// end when
    }
}
