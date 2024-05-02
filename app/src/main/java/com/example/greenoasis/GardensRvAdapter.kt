package com.example.greenoasis

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class GardensRvAdapter (private val mContext: Context, private val gardenList: List<Gardens>) : RecyclerView.Adapter<GardensRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var text: TextView
        var cardImage: ImageView
        init {
            CardView = view.findViewById(R.id.CardView)
            text = view.findViewById(R.id.textt)
            cardImage=view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return gardenList.size
    }

    override fun onBindViewHolder(
        holder: GardensRvAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val gardens = gardenList[position]
        holder.text.setText(gardens.name)
        if (gardens.name=="Gardens of Versailles") {
            holder.cardImage.setBackgroundResource(R.drawable.versailles)


        }
        if (gardens.name=="Claude Monet's Garden") {
            holder.cardImage.setBackgroundResource(R.drawable.monet)

        }
        if (gardens.name.equals("Longwood Gardens")) {
            holder.cardImage.setBackgroundResource(R.drawable.longwood)

        }
        if (gardens.name=="Powerscourt Gardens") {
            holder.cardImage.setBackgroundResource(R.drawable.powerscourt)

        }
        if (gardens.name=="Keukenhof Gardens") {
            holder.cardImage.setBackgroundResource(R.drawable.keukenhof)

        }
        holder.CardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, GardenActivity::class.java)
            intent.putExtra("gardenName", gardens.name)
            mContext.startActivity(intent)
        })
    }
}