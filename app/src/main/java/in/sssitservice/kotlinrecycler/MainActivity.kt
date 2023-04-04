package `in`.sssitservice.kotlinrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemModel>()
        for(i in 1..10){
            data.add(ItemModel("Text " + i))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = RvAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }
}