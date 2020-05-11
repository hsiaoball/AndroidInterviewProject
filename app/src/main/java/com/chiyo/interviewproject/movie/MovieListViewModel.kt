package com.chiyo.interviewproject.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class MovieListViewModel : ViewModel() {
    private val movieList = MutableLiveData<List<MovieData>>()


    fun getMovies(): LiveData<List<MovieData>> {
        return movieList
    }

    fun loadMovies() {
        Timber.d("chiyo load")
        movieList.postValue(listOf(
            MovieData("AAA"),
            MovieData("BBB")
        ))
    }
}