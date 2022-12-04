package com.samiun.affirmations.adapter

import android.content.Context
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.samiun.affirmations.MainActivity
import com.samiun.affirmations.R
import com.samiun.affirmations.model.Affirmation
private const val TAG = "MainActivity"
class ItemAdapter (
    private val context:Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_img)
        val textView2: TextView = view.findViewById(R.id.item_descripton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

        }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        Log.v(TAG, "This the value of item "+context.resources.getText(item.stringResourceId))

        Log.v(TAG, "This the Description of item "+context.resources.getText(item.stringDescription))
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imgResourceId)
        holder.textView2.text = context.resources.getString(item.stringDescription)


    }

    override fun getItemCount(): Int {
        return dataset.count()
    }
}