package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll the dice and show the result on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            /**val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()**/
            //val resultTextView:TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView:TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}