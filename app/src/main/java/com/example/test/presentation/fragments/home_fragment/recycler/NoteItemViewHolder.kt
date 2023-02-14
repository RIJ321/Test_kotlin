package com.example.test.presentation.fragments.home_fragment.recycler

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.test.R
import com.example.test.databinding.ItemNoteBinding
import com.example.test.domain.model.Note
import java.text.SimpleDateFormat
import java.util.*

class NoteItemViewHolder(val binding: ItemNoteBinding) : ViewHolder(binding.root) {

    @SuppressLint("SimpleDateFormat")
    fun onBind(note: Note) {
        binding.tvTitle.text = note.title
        binding.tvDescription.text = note.description
        binding.tvCreateAt.text = SimpleDateFormat("").format(Date(System.currentTimeMillis())).toString()
    }


}