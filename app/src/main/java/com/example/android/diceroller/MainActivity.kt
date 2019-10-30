package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    /**
     * lateinit mutable variables for avoid multiple
     * call to R classes
     */
    private lateinit var image: ImageView
    private lateinit var btn_main: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Button
         */
        btn_main.setOnClickListener {
            rollDice()
        }

    }

    /**
     * Random image from src
     * n.b. Using val(Immutable) and var(mutable)
     */
    private fun rollDice() {

        val random = Random().nextInt(6) + 1

        val chooseRandomDrawable = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        image.setImageResource(chooseRandomDrawable)
    }
}
