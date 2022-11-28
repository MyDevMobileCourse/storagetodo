package com.example.internalstorage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var root:ConstraintLayout
    lateinit var counter:TextView
    lateinit var red:Button
    lateinit var green:Button
    lateinit var blue:Button
    lateinit var black:Button
    lateinit var white:Button
    lateinit var count:Button
    lateinit var save:Button
    lateinit var clear:Button
    lateinit var load:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(){
        root = findViewById(R.id.root)
        counter = findViewById(R.id.counter)
        red = findViewById(R.id.red)
        green = findViewById(R.id.green)
        blue = findViewById(R.id.blue)
        black = findViewById(R.id.black)
        white = findViewById(R.id.white)
        count = findViewById(R.id.count)
        save = findViewById(R.id.save)
        clear = findViewById(R.id.clear)
        load = findViewById(R.id.load2)
        red.setOnClickListener {
            root.setBackgroundColor(Color.RED)
        }
        green.setOnClickListener {
            root.setBackgroundColor(Color.GREEN)
        }
        blue.setOnClickListener {
            root.setBackgroundColor(Color.BLUE)
        }
        black.setOnClickListener {
            root.setBackgroundColor(Color.BLACK)
        }
        white.setOnClickListener {
            root.setBackgroundColor(Color.WHITE)
        }
        count.setOnClickListener {
            var count = counter.text.toString().toInt()
            count++
            counter.text = count.toString()
        }


    }
}