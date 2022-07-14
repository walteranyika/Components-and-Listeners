package com.walter.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myImage: ImageView = findViewById(R.id.imgWater)
        val checkFootball: CheckBox = findViewById(R.id.checkBoxFootball)
        val checkRugby: CheckBox = findViewById(R.id.checkBoxRugby)
        val toggleWifi: ToggleButton = findViewById(R.id.toggleButtonWifi)
        val switchDisplayMode: Switch = findViewById(R.id.switchLightMode)
        val groupGender : RadioGroup = findViewById(R.id.groupGender)

        var original = true
        myImage.setOnClickListener {
            if (original) {
                myImage.setImageResource(R.drawable.coffee)
                original = false
            } else {
                myImage.setImageResource(R.drawable.water)
                original = true
            }
        }

        checkFootball.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Football Selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Football Not Selected", Toast.LENGTH_SHORT).show()
            }
        }

        toggleWifi.setOnCheckedChangeListener{ _, isTurnedOn ->
             if (isTurnedOn){
                 Toast.makeText(this, "Wifi is On", Toast.LENGTH_SHORT).show()
             }else{
                 Toast.makeText(this, "Wifi is off", Toast.LENGTH_SHORT).show()
             }
        }

        switchDisplayMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                Toast.makeText(this, "Dark mode is On", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Dark mode off", Toast.LENGTH_SHORT).show()
            }
        }

        groupGender.setOnCheckedChangeListener { _, id ->
             if (id == R.id.radioFemale){
                 Toast.makeText(this, "I am Female", Toast.LENGTH_SHORT).show()
             }
             else if(id == R.id.radioMale){
                 Toast.makeText(this, "I am male", Toast.LENGTH_SHORT).show()
             }
             else if(id == R.id.radioOther){
                 Toast.makeText(this, "I am not sure about my gender", Toast.LENGTH_SHORT).show()
             }
        }
    }
}

//kenyan_flag.png

//git init
//git add .
//git commit -m "UI Components"
//PASTE the long command
//git push -u origin master

//Push the interest calculator to github
//send the link to walter@emobilis.ac.ke

