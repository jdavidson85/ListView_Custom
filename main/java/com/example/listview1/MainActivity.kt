package com.example.listview1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ListView = findViewById<ListView>(R.id.listView)
        // val consoles = arrayOf("PlayStation 5", "Xbox Series X", "Nintendo Switch", "PC", "PlayStation 4", "Xbox One")

        var list = ArrayList<Model>()

        list.add(Model("Joe Davidson", "Student", R.drawable.ic_launcher_foreground))


        ListView.adapter= MyCustomAdpater(this, R.layout.custom_item_layout, list)

       /* ListView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "item selected "+ consoles[i], Toast.LENGTH_LONG)
                .show()
        }*/
    }

}