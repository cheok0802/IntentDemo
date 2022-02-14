package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonA: Button=findViewById(R.id.buttonA)
        val buttonB: Button=findViewById(R.id.buttonB)

        buttonA.setOnClickListener() {
            print(123);
            val intentA: Intent = Intent(this, AboutActivity::class.java)
            intentA.putExtra("StudentName","John")
            startActivity(intentA)
        }

        buttonB.setOnClickListener(){
            /*val telNo = Uri.parse("tel:999")
              val intentA: Intent = Intent(Intent.ACTION_DIAL,telNo)*/
            val geo = Uri.parse("geo: 3.140853, 101.693207")
            val intentB: Intent = Intent(Intent.ACTION_VIEW ,geo)
            startActivity(intentB)
        }

    }
}