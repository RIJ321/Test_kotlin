package com.example.test.data.repository

import com.example.test.data.base.BaseRepository
import com.example.test.data.localdb.NoteDB
import com.example.test.data.localdb.NoteDao
import com.example.test.data.mappers.toEntity
import com.example.test.data.mappers.toNote
import com.example.test.domain.common.Resource
import com.example.test.domain.model.Note
import com.example.test.domain.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao,
) : NoteRepository, BaseRepository() {

    override fun createNote(note: Note) = doRequest {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes() = doRequest {
        noteDao.getAllNotes().map { it.toNote() }
    }

    override fun editNote(note: Note) = doRequest {
        noteDao.editNote(note.toEntity())
    }

    override fun deleteNote(note: Note) = doRequest {
        noteDao.deleteNote(note.toEntity())
    }
}