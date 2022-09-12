package com.ihabakh.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel: ViewModel() {
    var mutableLiveData: MutableLiveData<String> = MutableLiveData()

    private fun getMovieNameFromData(): MovieModel {
        return MovieModel("Underworld")
    }

    fun getMovieName() {
        mutableLiveData.value = getMovieNameFromData().name
    }
}