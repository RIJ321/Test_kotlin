package com.example.test.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.test.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /*
        private val viewModel: MainViewModel by viewModels()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            viewModel.getAllNotes()

    */
/*
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.createNoteState.collect { state ->
                    when (state) {
                        is UIState.Loading -> {
                            // TODO: showProgressBar
                        }
                        is UIState.Error -> {
                            Toast.makeText(this@MainActivity, state.message, Toast.LENGTH_SHORT)
                                .show()
                        }
                        is UIState.Success -> {
                            // TODO: set adapter
                        }
                        is UIState.Empty -> {}
                    }
                }
            }
        }

        viewModel.getAllNotesState.collectState(
            onLoading = {

            },
            onError = { error ->

            },
            onSuccess = { data ->

            }
        )

        viewModel.createNoteState.collectState(
            onLoading = {

            },
            onError = { error ->

            },
            onSuccess = { data ->

            }
        )
    }
*/

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

}