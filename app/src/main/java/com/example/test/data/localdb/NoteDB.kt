package com.example.test.data.localdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.test.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = true)
abstract class NoteDB : RoomDatabase() {

    abstract fun noteDao(): NoteDao

}