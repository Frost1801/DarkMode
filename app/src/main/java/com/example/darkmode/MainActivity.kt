package com.example.darkmode

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SwitchCompat
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        val toggleButton = findViewById<SwitchCompat>(R.id.material_switch)
        val mainLayout = findViewById<LinearLayoutCompat> (R.id.mainLinearLayout)
        val monsterImage = findViewById<ImageView>(R.id.monster)
        val textBox = findViewById<TextView> (R.id.mainTextBox)

        var clicks = 0

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            clicks ++
            if (isChecked){
                if (clicks == 1){
                    textBox.text = ContextCompat.getString(this,R.string.reassuring)

                    val descriptionBox = findViewById<TextView>(R.id.descriptionbox)
                    descriptionBox.visibility = View.GONE
                }
                else if (clicks > 3){
                    textBox.text = ContextCompat.getString(this, R.string.run)
                }
                else{
                    textBox.text = ContextCompat.getString(this,R.string.cantEscape)
                }
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
                toggleButton.setTextColor(ContextCompat.getColor(this, R.color.white))
                textBox.setTextColor(ContextCompat.getColor(this,R.color.white))
            }
            else{
                if (clicks == 2){
                    textBox.text = ContextCompat.getString(this,R.string.memeText)
                    monsterImage.visibility =  View.VISIBLE
                }
                else if (clicks == 3){
                    textBox.text = ContextCompat.getString(this,R.string.cantEscape)
                }
                textBox.setTextColor(ContextCompat.getColor(this,R.color.black))
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
                toggleButton.setTextColor(ContextCompat.getColor(this, R.color.black))
            }
        }


    }
}

