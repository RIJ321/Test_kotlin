package com.example.test.domain.usecases

import com.example.test.domain.model.Note
import com.example.test.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase  @Inject constructor(
    private val noteRepository: NoteRepository
) {

    operator fun invoke(note: Note) = noteRepository.editNote(note)

}