package com.chiyo.interviewproject.movie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chiyo.interviewproject.R
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class MovieListFragment : Fragment() {

    private lateinit var model: MovieListViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: MovieAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_movie_list, container, false)
        activity?.let { it ->
            model = ViewModelProviders.of(it).get(MovieListViewModel::class.java)
            viewManager = LinearLayoutManager(it)
            viewAdapter = MovieAdapter()

            recyclerView = root.findViewById<RecyclerView>(R.id.movie_recycler_view).apply {
                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                setHasFixedSize(true)

                // use a linear layout manager
                layoutManager = viewManager

                // specify an viewAdapter (see also next example)
                adapter = viewAdapter

            }

            model.getMovies().observe(it, Observer<List<MovieData>>{movieList ->
                viewAdapter.addList(movieList)
            })

        }
        return root
    }


}
