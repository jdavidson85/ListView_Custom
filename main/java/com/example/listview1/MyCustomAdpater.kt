package com.example.listview1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdpater (var ctx: Context, var ourResource: Int, var Items: ArrayList<Model>):
    ArrayAdapter<Model>(ctx, ourResource, Items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        val name = view.findViewById<TextView>(R.id.name)
        val extra = view.findViewById<TextView>(R.id.text1)
        val img = view.findViewById<ImageView>(R.id.img1)

        name.text = Items[position].name
        extra.text = Items[position].text1
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))

        return view
    }
}