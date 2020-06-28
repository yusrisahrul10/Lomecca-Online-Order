package me.yusrisahrul.lomeccaonlineorder.data

import androidx.lifecycle.ViewModel

class FoodViewModel : ViewModel() {
    fun getFoods() : List<Menu> = DataDummy().generateDummyFood()
}