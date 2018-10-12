package com.example.akniyet.midterm

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pref: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pref = PreferenceManager.getDefaultSharedPreferences(this)

        LoginButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            pref!!.edit().putString("username", EmailTextValue.editText!!.text.toString()).apply()
            pref!!.edit().putString("password", PasswordTextValue.editText!!.text.toString()).apply()

            startActivity(intent)
            finish()
        }

    }
}
