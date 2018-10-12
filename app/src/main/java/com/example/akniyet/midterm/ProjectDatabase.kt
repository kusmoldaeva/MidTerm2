package com.example.akniyet.midterm

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by Akniyet on 12.10.2018.
 */
@Database(entities = arrayOf(News::class), version = 1)
abstract class ProjectDatabase: RoomDatabase() {
    abstract fun newsDao(): NewList
}