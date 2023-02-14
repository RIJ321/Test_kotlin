package com.example.test.presentation.fragments.home_fragment

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.test.R
import com.example.test.databinding.FragmentNoteListBinding
import com.example.test.domain.model.Note
import com.example.test.presentation.MainViewModel
import com.example.test.presentation.UIState
import com.example.test.presentation.base.BaseFragment
import com.example.test.presentation.fragments.home_fragment.recycler.NoteItemAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NoteListFragment : BaseFragment(R.layout.fragment_note_list) {

    private val binding by viewBinding(FragmentNoteListBinding::bind)
    private val viewModel by viewModels<MainViewModel>()
    private var list = listOf<Note>()
    private val noteAdapter by lazy { NoteItemAdapter(list) }

    override fun setupRequests() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getAllNotes()
            viewModel.getAllNotesState.collectState(
                onError = {
                    Toast.makeText(requireContext(), "ERror", Toast.LENGTH_SHORT).show()
                },
                onSuccess = {
                    list = it
                },
                onLoading = {
                }
            )
        }
    }

    override fun setupClickListeners() {
        binding.rvMainList.apply {
            layoutManager =
                LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.VERTICAL,
                    false
                )
            adapter = noteAdapter
        }
        binding.fabAddNote.setOnClickListener {
            requireActivity()
                .findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_noteListFragment_to_blankFragment)
        }
    }

}