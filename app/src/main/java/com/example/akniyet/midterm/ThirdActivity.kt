package com.example.akniyet.midterm

import android.app.Activity
import android.os.Bundle
import android.support.constraint.R.attr.content
import android.support.v7.app.AppCompatActivity
import android.util.Log

class ThirdActivity(private var newList: ArrayList<News> = ArrayList()) : AppCompatActivity() {

    private lateinit var newList: NewList

    private lateinit var textTodo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        newList = (applicationContext as Myapp).database.newsList()

        date_label.text = spf.format(date)

        add_news.setOnClickListener {
            textTodo = new_textTodo.text.toString()

            Thread(Runnable {
                val news = News(newsList.getCount() + 1, textTodo, publishedDate, content)
                newsList.insertNews(news)
                newsList = newsList.getNews() as ArrayList<News>
                runOnUiThread {
                    setResult(Activity.RESULT_OK)
                    finish()
                }
            }).start()
        }
    }

}

