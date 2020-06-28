package me.yusrisahrul.lomeccaonlineorder.data

class DataDummy {
    fun generateDummyFood() : ArrayList<Menu> {
        val items = ArrayList<Menu>()

        items.add(
            Menu(
                "Nasi Goreng Biasa",
                "https://www.masakapahariini.com/wp-content/uploads/2018/04/cara-membuat-nasi-goreng-seafood-500x300.jpg",
                "Dengan sayuran dan sosis",
                "26.000",
                1
            )
        )

        items.add(
            Menu(
                "Ayam Rica-rica",
                "https://lestariweb.com/ResepImages/AyamRicaRica.jpg",
                "Dengan Bumbu rica-rica",
                "23.000",
                1
            )
        )

        items.add(
            Menu(
                "Mi Goreng Spesial",
                "https://img-global.cpcdn.com/recipes/353e684da9bcbab3/1200x630cq70/photo.jpg",
                "Dengan telur dan daging ayam",
                "21.000",
                1
            )
        )

        items.add(
            Menu(
                "Capcay Kuah",
                "https://img-global.cpcdn.com/recipes/61a050e26d88ccc3/751x532cq70/capcay-kuah-kental-foto-resep-utama.jpg",
                "Dengan Kuah Seafood",
                "27.000",
                1
            )
        )

        return items
    }
}