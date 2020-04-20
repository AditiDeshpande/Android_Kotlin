package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll Dice"
        rollButton.setOnClickListener {
            rollDice()
            //Toast.makeText(this,"Button Clicked!",Toast.LENGTH_SHORT).show()}
        }
    }

    private fun rollDice() {
        //TV showing random dice result between 1-6
        /*val resultText: TextView = findViewById(R.id.textview_result)
        val randomInt = Random.nextInt(6)+1
        resultText.text = randomInt.toString()*/
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val imageDice: ImageView = findViewById(R.id.image_dice_result)
        imageDice.setImageResource(drawableResource)

    }
}

