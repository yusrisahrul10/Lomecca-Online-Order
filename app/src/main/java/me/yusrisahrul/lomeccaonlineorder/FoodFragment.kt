package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_food.*
import me.yusrisahrul.lomeccaonlineorder.adapter.MenuAdapter
import me.yusrisahrul.lomeccaonlineorder.data.FoodViewModel
import me.yusrisahrul.lomeccaonlineorder.data.Menu

class FoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this,
                ViewModelProvider.NewInstanceFactory())[FoodViewModel::class.java]
            val movies = viewModel.getFoods()
            val movieAdapter = MenuAdapter(requireContext(), movies)
            { item: Menu -> getItemClicked(item) }

            with(rvMenu) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }

        btnFilter.setOnClickListener {
            val intent = Intent(activity, FilterMenuActivity::class.java)
            startActivity(intent)
        }

    }

    private fun getItemClicked(item: Menu) {
        val intent = Intent(activity, DetailMenuActivity::class.java)
        intent.putExtra("name", item.nameMenu)
        startActivity(intent)
    }

}