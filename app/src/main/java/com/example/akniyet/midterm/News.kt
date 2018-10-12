package com.example.akniyet.midterm

import android.arch.persistence.room.PrimaryKey

/**
 * Created by Akniyet on 12.10.2018.
 */
data class News (
        @PrimaryKey
        var textTodo: String
)