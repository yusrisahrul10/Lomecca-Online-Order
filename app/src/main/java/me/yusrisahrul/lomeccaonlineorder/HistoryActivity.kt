package me.yusrisahrul.lomeccaonlineorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        textDetailOrder.setOnClickListener {
            val intent = Intent(this, DetailHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}