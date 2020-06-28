package me.yusrisahrul.lomeccaonlineorder.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import me.yusrisahrul.lomeccaonlineorder.R
import me.yusrisahrul.lomeccaonlineorder.data.Menu

class MenuAdapter(private val context: Context, private val items: List<Menu>, private val listener:
    (Menu) -> Unit) : RecyclerView.Adapter
<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(context).inflate(
            R.layout.item_menu, parent, false
        )
    )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val nameMenu = view.findViewById<TextView>(R.id.textViewNameMenu)
        private val descriptionMenu = view.findViewById<TextView>(R.id.textViewDescriptionMenu)
        private val priceMenu = view.findViewById<TextView>(R.id.textViewPriceMenu)
        private val image = view.findViewById<ImageView>(R.id.imageViewMenu)

        fun bindItem(items: Menu, listener: (Menu) -> Unit) {
            Glide.with(itemView.context)
                .load(items.imageMenu)
                .into(image)
            nameMenu.text = items.nameMenu
            descriptionMenu.text = items.descriptionMenu
            priceMenu.text = items.priceMenu


            itemView.setOnClickListener {
                listener(items)
            }
        }
    }
}