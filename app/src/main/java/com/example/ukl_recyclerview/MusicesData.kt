package com.example.ukl_recyclerview

object MusicesData {
    private val data = arrayOf(
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/9/91/Lelaki_dengan_gitar_kecil.jpg",
            "Tak Kan Hilang",
            "Budi Doremi"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/0/06/Madison_Beer_%40_The_Wiltern_11_28_2021_%2851783562071%29.jpg",
            "Reckless",
            "Madison Beer"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/1/12/Carmen-and-camille-idgaf.jpg",
            "IDGAF",
            "Dua Lipa"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/4/47/Anne-Marie_MTV.jpg",
            "2002",
            "Anne-Marie"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/3/35/Foto_profil_dari_Soegi_Bornean.jpg",
            "Asmalibrasi",
            "Soegi Bornean"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/6/63/Tiara_Andini_Photoby_JodieOctora.jpg",
            "Tertawan Hati",
            "Tiara Andini"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/2/26/Stacey_Ryan_%40_Moroccan_Lounge_08_25_2022_%2852514341628%29.jpg",
            "Fall In Love Alone",
            "Stacey Ryan"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/7/7c/Meghan_Trainor_2015_%28cropped%29.jpg",
            "Made You look",
            "Meghan Trainor"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/9/9a/Anggi_Marito_in_2022.png",
            "Semata Karenamu",
            "Mario G Klau"
        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/6/6d/Taylor_Swift_performing_Fearless_during_Reputation_Stadium_Tour_-_New_Jersey%2C_2018.jpg",
            "Anti-Hero",
            "Taylor Swift"
        )
    )

    val listData: ArrayList<Music>
        get() {
            val list = arrayListOf<Music>()
            for (aData in data) {
                val Music = Music()
                Music.photo = aData[0]
                Music.judul = aData[1]
                Music.from = aData[2]

                list.add(Music)
            }

            return list
        }
}