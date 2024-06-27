package com.akirachix.readersdigest

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter (var articleList: List<Atricle>){
      RecyclerView.Adapter<ArticlesViewHolder>(){

    }




    class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvProfile = itemView.findViewById<TextView>(R.id.tvProfile)
        var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
        var tvPublicationDate = itemView.findViewById<TextView>(R.id.tvPublicationDate)
        var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
        var tvCover = itemView.findViewById<TextView>(R.id.tvCover)
        var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
    }
}
}