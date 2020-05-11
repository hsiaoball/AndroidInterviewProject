package com.chiyo.interviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.chiyo.interviewproject.movie.MovieListFragment
import com.chiyo.interviewproject.movie.MovieListViewModel
import timber.log.Timber.DebugTree
import timber.log.Timber



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.plant(DebugTree())

        val model = ViewModelProviders.of(this).get(MovieListViewModel::class.java)
        model.loadMovies()

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val movieListFragment = MovieListFragment()
        fragmentTransaction.add(R.id.fragment_container, movieListFragment)
        fragmentTransaction.addToBackStack("aa")
        fragmentTransaction.commit()
    }
}
