package com.example.greenoasis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GardenActivity : AppCompatActivity() {
    private lateinit var imagegarden : ImageView
    private lateinit var textgarden : TextView
    private lateinit var gardenName : String
    private lateinit var textViewgarden : TextView
    private lateinit var buttonOffer : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden)

        textViewgarden = findViewById(R.id.textViewGarden)
        buttonOffer = findViewById(R.id.button4)

        textViewgarden.setText("Information of the Garden ")
        if (intent.hasExtra("gardenName")) {
            gardenName = intent.getStringExtra("gardenName")!!
        }
        imagegarden = findViewById(R.id.imageGarden)
        textgarden = findViewById(R.id.textGarden)

        if(gardenName.equals("Gardens of Versailles")) {
            imagegarden.setBackgroundResource(R.drawable.versailles)
            textgarden.setText(
                "   - Location: Versailles, France\n" +
                        "   - Design Features: The Gardens of Versailles are adorned with grandiose Baroque-style designs, elaborate geometric layouts, sculptures, fountains, and ponds. The gardens behind the palace exhibit unique beauty and grandeur known worldwide.\n" +
                        "   - History: Garden arrangements began during the reign of Louis XIV and were expanded and enriched over time. The Gardens of Versailles are considered one of the most magnificent examples of French garden style.\n")

        }
        if(gardenName.equals("Claude Monet's Garden")) {
            imagegarden.setBackgroundResource(R.drawable.monet)
            textgarden.setText(
                "- Location: Giverny, France\n" +
                        "   - Design Features: The garden, which famously inspired the renowned painter Claude Monet, is filled with colorful flowerbeds, water lilies, and bridges. Monet's garden served as a muse for many of his famous works.\n" +
                        "   - History: Claude Monet began designing the garden after purchasing a house in Giverny in the late 19th century. The design and arrangement of the garden greatly influenced Monet's art.\n")
        }
        if(gardenName.equals("Longwood Gardens")) {
            imagegarden.setBackgroundResource(R.drawable.longwood)
            textgarden.setText(
                "   - Location: Kennett Square, Pennsylvania, USA\n" +
                        "   - Design Features: Longwood Gardens feature various themed gardens, conservatories, ponds, and flowerbeds. The gardens offer visitors various events and exhibitions throughout the year.\n" +
                        "   - History: Longwood Gardens were purchased by Pierre S. du Pont in the late 19th century and expanded over time. Today, it provides visitors with a captivating experience of natural beauty and botanical diversity.\n")
        }
        if(gardenName.equals("Powerscourt Gardens")) {
            imagegarden.setBackgroundResource(R.drawable.powerscourt)
            textgarden.setText(
                "   - Location: Wicklow County, Ireland\n" +
                        "   - Design Features: Situated around a historic estate, Powerscourt Gardens boast various terraces, ponds, sculptures, and plant collections. The gardens are famous for their magnificent views and historical ambiance.\n" +
                        "   - History: Powerscourt Gardens were constructed in the 18th century and have been renovated over time. They are one of Ireland's most important examples of landscape design, attracting over a million visitors annually.\n")
        }
        if(gardenName.equals("Keukenhof Gardens")) {
            imagegarden.setBackgroundResource(R.drawable.keukenhof)
            textgarden.setText(
                "- Location: Lisse, Netherlands\n" +
                        "   - Design Features: Keukenhof, known as Holland's tulip garden, hosts millions of tulip varieties. The garden features colorful flower beds, tulip exhibitions, and watery vistas.\n" +
                        "   - History: Keukenhof Gardens were established in the early 20th century to promote tulip cultivation and are now one of the world's largest tulip gardens.\n")
        }




    }
}