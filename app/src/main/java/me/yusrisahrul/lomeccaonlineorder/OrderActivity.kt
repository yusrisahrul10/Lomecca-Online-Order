package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btnOrder.setOnClickListener {
            val intent = Intent(this, OrderFinishActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}