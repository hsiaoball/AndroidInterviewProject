package com.chiyo.interviewproject.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chiyo.interviewproject.R

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val moveList = ArrayList<MovieData>()
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.title_text)
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MovieViewHolder {
        // create a new view
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)

        // set the view's size, margins, paddings and layout parameters
        return MovieViewHolder(root)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.text = moveList[position].title
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = moveList.size

    fun addList(list: List<MovieData>) {
        moveList.addAll(list)
        notifyDataSetChanged()
    }
}