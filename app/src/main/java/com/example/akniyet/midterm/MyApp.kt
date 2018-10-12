package com.example.akniyet.midterm

import android.app.Application
import android.arch.persistence.room.Room

/**
 * Created by Akniyet on 12.10.2018.
 */
class MyApp: Application() {

    lateinit var database: ProjectDatabase

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(applicationContext,
                ProjectDatabase::class.java,
                "ProjectDatabase")
                .fallbackToDestructiveMigration()
                .build()
    }
}