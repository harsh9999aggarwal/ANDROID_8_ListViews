package com.example.listviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_fruit.*
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvFruits.adapter = ArrayAdapter<String>(
            this,
            R.layout.list_item_fruit,
            R.id.tvFruitName,
            arrayOf(
                "Apple",
                "Mango",
                "Guava",
                "Banana",
                "Kiwi",
                "Grapes",
                "Watermelon",
                "Fruit1",
                "Fruit2",
                "Fruit3",
                "Fruit4",
                "Fruit5",
                "Fruit6",
                "Fruit7"

            )
        )

        lvFruits.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "johny ate ${position+1} ${view.tvFruitName.text}",Toast.LENGTH_SHORT).show()
        }
    }
}