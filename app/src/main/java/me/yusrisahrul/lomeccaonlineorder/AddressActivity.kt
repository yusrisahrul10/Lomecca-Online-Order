package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_address.*

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        btnNewAddress.setOnClickListener {
            val intent = Intent(this, AddressAddActivity::class.java)
            startActivity(intent)
        }

//        imageButton.setOnClickListener {
//            showPopupMenu()
//        }

    }

    private fun showPopupMenu(view: View, position: Int) {
        val popup = PopupMenu(view.context, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.popup_address_menu, popup.menu)
        popup.setOnMenuItemClickListener(MyMenuItemClickListener(position))
        popup.show()
    }

    internal class MyMenuItemClickListener(private val position: Int) :
        PopupMenu.OnMenuItemClickListener {
        override fun onMenuItemClick(menuItem: MenuItem): Boolean {
            when (menuItem.itemId) {
                R.id.editAddress -> {

                }

                R.id.deleteAddress -> {

                }

                else -> {
                }
            }
            return false
        }

    }
}