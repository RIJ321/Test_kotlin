package com.example.test.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.domain.common.Resource
import com.example.test.presentation.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

/*
    protected val <T> noteState(data: () -> T) = MutableStateFlow<T>(data)

    private fun <T> asMutableStateFlow(stateFlow: MutableStateFlow<T>) = stateFlow.asStateFlow()
    protected val asStateFLow = asMutableStateFlow.
*/

    fun <T> Flow<Resource<T>>.collectFlow(
        _state: MutableStateFlow<UIState<T>>
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            this@collectFlow.collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _state.value = UIState.Loading()
                    }
                    is Resource.Error -> {
                        _state.value = UIState.Error(result.message!!)
                    }
                    is Resource.Success -> {
                        if (result.data != null)
                            _state.value = UIState.Success(result.data)
                    }
                }

            }
        }
    }
}