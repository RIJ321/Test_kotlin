package com.example.test.data.mappers

import com.example.test.data.model.NoteEntity
import com.example.test.domain.model.Note

fun Note.toEntity() = NoteEntity(id, title, description, createAt)

fun NoteEntity.toNote() = Note(id, title, description, createAt)