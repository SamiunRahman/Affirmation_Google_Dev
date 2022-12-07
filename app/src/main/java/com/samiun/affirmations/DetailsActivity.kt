package com.samiun.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val textView: TextView = findViewById(R.id.detail_title)
        val imageView: ImageView = findViewById(R.id.detail_image)
        val textView2: TextView = findViewById(R.id.detail_description)
        val bundle: Bundle? = intent.extras
        val title: String? = bundle?.getString("string_value")
        val image: String? = bundle?.getString("image_value")
        val descriton: String? = bundle?.getString("string_description")
        Log.v("MainActivity", "This the Detail  of item "+title.toString())
        Log.v("MainActiviy", "Value of of title is $title")
        textView.text= title?.toInt()?.let { getString(it) }
        image?.toInt()?.let{imageView.setImageResource(it)}
        textView2.text= descriton?.toInt()?.let { getString(it) }





    }
}