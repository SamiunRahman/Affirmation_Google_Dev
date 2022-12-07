package com.samiun.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.samiun.affirmations.adapter.ItemAdapter
import com.samiun.affirmations.data.DataSource
class MainActivity : AppCompatActivity() {

    //private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)

        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        button.setOnClickListener{
            if(button.text.toString()=="Grid View") {
                recyclerView.layoutManager =
                    StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
                recyclerView.setHasFixedSize(true)
                recyclerView.adapter = ItemAdapter(this, myDataset)
                button.setText("Linear View")
            }
            else{
                recyclerView.layoutManager = StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL)
                recyclerView.setHasFixedSize(true)
                recyclerView.adapter = ItemAdapter(this, myDataset)
                button.setText("Grid View")
            }
        }


    }
}