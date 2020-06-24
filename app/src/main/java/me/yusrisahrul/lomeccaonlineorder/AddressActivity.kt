package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_address.*

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        btnNewAddress.setOnClickListener {
            val intent = Intent(this, AddressAddActivity::class.java)
            startActivity(intent)
        }
    }
}