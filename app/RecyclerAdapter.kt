package com.example.app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :RecyclerView.Adapter<ViewHolderItem>(){
 val animalList = listOf(
        "ライオン","クマ","キリン","ゾウ","パンダ","キリン","ライオン","ライオン",
        "ライオン","馬","ライオン","ライオン","キリン","ライオン","ライオン","ライオン",
        "ライオン","キリン","ライオン","ライオン","ライオン","ライオン","キリン","ライオン","ライオン","ライオン","ライオン","キリン","ライオン","ライオン","ライオン",
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout,parent,false)
        return  ViewHolderItem((itemXml))
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.itemName.text = animalList[position]
    }

    override fun getItemCount(): Int {
        return animalList.size
    }
}