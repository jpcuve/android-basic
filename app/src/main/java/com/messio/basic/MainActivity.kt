package com.messio.basic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("Bazaar")
        button2.setOnClickListener{
            Log.d("BASIC", "Button 2 clicked")
            val intent = Intent(this@MainActivity, SeizureActivity::class.java)
//            val intent = Intent("com.messio.basic.SeizureActivity")
            startActivity(intent)
        }
    }
}
