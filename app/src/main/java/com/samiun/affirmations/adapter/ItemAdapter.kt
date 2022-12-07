package com.samiun.affirmations.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.samiun.affirmations.DetailsActivity
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
       val cardView: LinearLayout = view.findViewById(R.id.cardLayout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        Log.v("MainActiviy", "OncreateViewHolder Called")
        return ItemViewHolder(adapterLayout)

        }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        Log.v(TAG, "This the value of item "+context.resources.getText(item.stringResourceId))
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imgResourceId)
        holder.textView2.text = context.resources.getString(item.stringDescription)
        holder.cardView.setOnClickListener{
            val intent = Intent(context,DetailsActivity::class.java)
            intent.putExtra("string_value", item.stringResourceId.toString())
            intent.putExtra("string_description", item.stringDescription.toString())
            intent.putExtra("image_value", item.imgResourceId.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}