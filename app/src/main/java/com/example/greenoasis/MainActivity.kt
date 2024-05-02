package com.example.greenoasis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var gardenList : ArrayList<Gardens>
    private lateinit var gardenList2 : ArrayList<Gardens>
    private lateinit var gardenList3 : ArrayList<Gardens>
    private lateinit var rv : RecyclerView

    private lateinit var adapter: GardensRvAdapter
    private lateinit var adapter2: GardensRvAdapter
    private lateinit var adapter3: GardensRvAdapter
    private lateinit var gifArrow: ImageView
    private lateinit var contact: Button
    private lateinit var about: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contact = findViewById(R.id.button)
        about =findViewById(R.id.button2)
        rv =findViewById(R.id.recyclerView)
        gifArrow= findViewById(R.id.imageView2)

        rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val i1 = Gardens("Longwood Gardens")
        val i2 = Gardens("Claude Monet's Garden")
        val i3 = Gardens("Gardens of Versailles")
        val i4 = Gardens("Powerscourt Gardens")
        val i5 = Gardens("Keukenhof Gardens")
        gardenList = ArrayList<Gardens>()


        gardenList.add(i1)
        gardenList.add(i2)
        gardenList.add(i3)
        gardenList.add(i4)
        gardenList.add(i5)

        adapter = GardensRvAdapter(this,gardenList)

        rv.adapter = adapter

        contact.setOnClickListener { view ->
            onSeriesButtonClick2(view)
        }
        about.setOnClickListener { view ->
            onSeriesButtonClick3(view)
        }
        gifArrow.setOnClickListener{
            Toast.makeText(this,
                    "Swipe left",Toast.LENGTH_LONG).show()
        }
    }


    private fun onSeriesButtonClick2(view: View) {



        val intent = Intent(this, ContactUsActivity::class.java)
        intent.putExtra("infoname", "contact")
        startActivity(intent)
    }
    private fun onSeriesButtonClick3(view: View) {


        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("infoname", "about")
        startActivity(intent)
    }
}