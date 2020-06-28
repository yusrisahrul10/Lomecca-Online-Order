package me.yusrisahrul.lomeccaonlineorder.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Menu (val nameMenu: String?,
                 val imageMenu: String?,
                 val descriptionMenu: String?,
                 val priceMenu: String?,
                 val quantityMenu: Int) : Parcelable