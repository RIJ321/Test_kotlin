package com.example.test.presentation

import com.example.test.domain.model.Note
import com.example.test.domain.usecases.EditNoteUseCase
import com.example.test.domain.usecases.GetAllNotesUseCase
import com.example.test.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val editNoteUseCase: EditNoteUseCase,
    private val getAllNotesUseCase: GetAllNotesUseCase
) : BaseViewModel() {

    private val _createNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    private val _getAllNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getAllNotesState = _getAllNotesState.asStateFlow()

    fun editNote(note: Note) = editNoteUseCase(note).collectFlow(_createNoteState)
    fun getAllNotes() = getAllNotesUseCase().collectFlow(_getAllNotesState)
}