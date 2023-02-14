package com.example.test.data.base

import com.example.test.domain.common.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

abstract class BaseRepository {

    protected fun <T> doRequest(request: suspend () -> T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
        } catch (io: IOException) {
            emit(Resource.Error(io.localizedMessage ?: "createNote ERROR"))
        }
    }.flowOn(Dispatchers.IO)

}