package me.yusrisahrul.lomeccaonlineorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_voucher -> {
                    loadVoucherFragment(savedInstanceState)

                }
                R.id.navigation_store -> {
                    loadStoreFragment(savedInstanceState)

                }
                R.id.navigation_home -> {
                    loadHomeFragment(savedInstanceState)

                }
                R.id.navigation_history -> {
                    loadTransaksiFragment(savedInstanceState)

                }
                R.id.navigation_profile -> {
                    loadProfileFragment(savedInstanceState)
                }
            }
            true
        }

        navView.selectedItemId = R.id.navigation_home

    }

    private fun loadVoucherFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.mainContainer,
                    VoucherFragment(), VoucherFragment::class.java.simpleName
                )
                .commit()
        }
    }

    private fun loadStoreFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.mainContainer,
                    StoreFragment(), StoreFragment::class.java.simpleName
                )
                .commit()
        }
    }

    private fun loadHomeFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.mainContainer,
                    HomeFragment(), HomeFragment::class.java.simpleName
                )
                .commit()
        }
    }

    private fun loadTransaksiFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.mainContainer,
                    TransactionFragment(), TransactionFragment::class.java.simpleName
                )
                .commit()
        }
    }

    private fun loadProfileFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.mainContainer,
                    ProfileFragment(), ProfileFragment::class.java.simpleName
                )
                .commit()
        }
    }
}