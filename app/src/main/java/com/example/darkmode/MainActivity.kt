package com.example.darkmode

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SwitchCompat
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.darkmode.ui.theme.DarkModeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        val toggleButton = findViewById<SwitchCompat>(R.id.material_switch)
        val mainLayout = findViewById<LinearLayoutCompat> (R.id.mainLinearLayout)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
            }
            else{
                mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
            }
        }


    }
}

