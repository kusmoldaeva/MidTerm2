package com.example.akniyet.midterm

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Akniyet on 12.10.2018.
 */
class NewsAdapter(private val list: ArrayList<News>, private val context: Context) : RecyclerView.Adapter<NewsAdapter.ViewHolder>(), Parcelable {

    abstract val view: Any

    constructor(parcel: Parcel) : this(
            TODO("list"),
            TODO("context")) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val i = Log.d("MY_TAG", "onCreateViewHolder")

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("MY_TAG", "onBindViewHolder " + position)
        holder.itemView.todoText.setText(list.get(position).content)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NewsAdapter> {
        override fun createFromParcel(parcel: Parcel): NewsAdapter {
            return NewsAdapter(parcel)
        }

        override fun newArray(size: Int): Array<NewsAdapter?> {
            return arrayOfNulls(size)
        }
    }
}