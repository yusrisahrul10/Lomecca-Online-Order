package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import co.ceryle.segmentedbutton.SegmentedButtonGroup
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        cardViewAddress.setOnClickListener {
            val intent = Intent(activity, AddressActivity::class.java)
            startActivity(intent)
        }

        btnOrderMenu.setOnClickListener {
            val intent = Intent(activity, MenuActivity::class.java)
            startActivity(intent)
        }

//        segmentedButtonGroup.setOnClickedButtonListener {
//
//        }
//        segmentedButtonGroup.setPosition(2, 0)

//        segmentedButtonGroup.setOnClickedButtonPosition(object : OnClickedButtonPosition() {
//            fun onClickedButtonPosition(position: Int) {
//                Toast.makeText(this@MainActivity, "Clicked: $position", Toast.LENGTH_SHORT).show()
//            }
//        })
//        segmentedButtonGroup.setPosition(2, 0)
    }
}