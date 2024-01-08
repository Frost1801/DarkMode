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
    private lateinit var toggleButton : SwitchCompat
    private lateinit var mainLayout  : LinearLayoutCompat
    private lateinit var  monsterImage : ImageView
    private lateinit var textBox : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)


        var clicks = 0
        toggleButton = findViewById<SwitchCompat>(R.id.material_switch)
        mainLayout = findViewById<LinearLayoutCompat> (R.id.mainLinearLayout)
        monsterImage = findViewById<ImageView>(R.id.monster)
        textBox = findViewById<TextView> (R.id.mainTextBox)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            clicks ++
            switchWasClicked(clicks)
            if (isChecked){
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
                toggleButton.setTextColor(ContextCompat.getColor(this, R.color.white))
                textBox.setTextColor(ContextCompat.getColor(this,R.color.white))
            }
            else{

                textBox.setTextColor(ContextCompat.getColor(this,R.color.black))
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
                toggleButton.setTextColor(ContextCompat.getColor(this, R.color.black))
            }
        }



    }
    private fun switchWasClicked (clicks: Int){
        when (clicks){
            1 -> {
                textBox.text = ContextCompat.getString(this,R.string.reassuring)
                val descriptionBox = findViewById<TextView>(R.id.descriptionbox)
                descriptionBox.visibility = View.GONE
            }
            2->{
                textBox.text = ContextCompat.getString(this,R.string.insideWalls)
                monsterImage.visibility =  View.VISIBLE
            }
            3-> {
                textBox.text = ContextCompat.getString(this,R.string.cantEscape)
            }
            4-> {
                textBox.text = ContextCompat.getString(this,R.string.cantEscape)
            }
            5 -> {
                textBox.text = ContextCompat.getString(this, R.string.run)
            }
            6 -> {
                monsterImage.setImageResource(R.drawable.monsterwithhands)

            }
        }

    }


}

