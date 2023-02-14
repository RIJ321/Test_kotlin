package com.example.test.di

import android.content.Context
import androidx.room.Room
import com.example.test.data.localdb.NoteDB
import com.example.test.data.localdb.NoteDao
import com.example.test.data.repository.NoteRepositoryImpl
import com.example.test.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Singleton
    @Provides
    fun provideNoteDataBase(
        @ApplicationContext context: Context
    ): NoteDB = Room.databaseBuilder(
        context,
        NoteDB::class.java,
        "note_db"
    )
        .allowMainThreadQueries().build()

    @Singleton
    @Provides
    fun providesNoteDao(noteDB: NoteDB) = noteDB.noteDao()

    @Provides
    fun providesNoteRepository(noteDao: NoteDao): NoteRepository = NoteRepositoryImpl(noteDao)

}