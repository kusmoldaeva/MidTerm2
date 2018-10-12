package com.example.akniyet.midterm

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private var todos: ArrayList<Todo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = Intent(this, ThirdActivity::class.java)

        startActivity(intent)




    }



}
