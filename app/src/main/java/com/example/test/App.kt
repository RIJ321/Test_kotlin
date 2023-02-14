package com.example.test

import android.app.Application
import androidx.room.Room
import com.example.test.data.localdb.NoteDB
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application()
