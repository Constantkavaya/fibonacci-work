package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRecyclerViewAdapter (var numberslist:List<BigInteger>) :RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var  itemView= LayoutInflater.from(parent.context).inflate(com.example.fibonacci.R.layout.numbers_list_items,parent,false)
        return  NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvnumber.text=numberslist.get(position).toString()
    }

    override fun getItemCount(): Int {
        return  numberslist.size
    }

}
class  NumberViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
    var  tvnumber=itemView.findViewById<TextView>(com.example.fibonacci.R.id.tvnumbers)


}