package com.tps.challenge.features.storefeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tps.challenge.R
import com.tps.challenge.network.model.StoreResponse

/**
 * A RecyclerView.Adapter to populate the screen with a store feed.
 */
class StoreFeedAdapter(private var list: List<StoreResponse>): RecyclerView.Adapter<StoreItemViewHolder>() {

    private var isError: Boolean = false
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreItemViewHolder {
        return StoreItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_store, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoreItemViewHolder, position: Int) {
        if (list.isNotEmpty()) {
            val result = list[position]

            with(holder.itemView) {
                findViewById<TextView>(R.id.name).text = result.name
                findViewById<TextView>(R.id.description).text = result.description
                Glide.with(context).load(result.coverImgUrl)
                    .into(findViewById<ImageView>(R.id.storeImage))
            }
        } else {
            with(holder.itemView) {
                findViewById<TextView>(R.id.errorMessage).apply {
                    visibility = if (isError) View.VISIBLE else View.GONE
                    text = "Unable to fetch response"
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return if (list.isEmpty() && isError) 1 else list.size
    }

    fun submitList(newList: List<StoreResponse>, hasError: Boolean =false){
        list = newList
        isError = hasError
        notifyDataSetChanged()
    }
}

/**
 * Holds the view for the Store item.
 */
class StoreItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
